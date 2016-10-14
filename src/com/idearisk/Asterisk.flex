package com.idearisk;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.idearisk.psi.AsteriskTypes;
import com.intellij.psi.TokenType;

%%

%class AsteriskLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF= \n|\r|\r\n
WHITE_SPACE=[\ \t\f]
END_OF_LINE_COMMENT=(";")[^\r\n]*
CHARACTER=[^:=>\ \n\r\t\f\\]
SEPARATOR=,

INCLUDE="#include"

EXTENSION_DEFINITION="[".+"]"

APPLICATION_NAME=[A-Z][a-zA-Z]+
APPLICATION_ARGS="(".+")"

INCLUDE_CTX_LEFT="include"

EXT_INST_LEFT="exten"
EXT_OPERATOR="=>"
EXT_EXTENSION=[0-9]+ | [hioatTs]
EXT_PRIORITY=[0-9]+ | n | [0-9]+"(".+")" | n"(".+")"

%state PROGRAM_INSTRUCTION
%state EXTENSION
%state PRIORITY
%state APPLICATION_NAME
%state APPLICATION_ARGS
%state INCLUDE_FILE
%state INCLUDE_CTX

%%

<YYINITIAL> {END_OF_LINE_COMMENT} {
    yybegin(YYINITIAL);
    return AsteriskTypes.COMMENT;
}

<YYINITIAL> {EXTENSION_DEFINITION} {
    yybegin(YYINITIAL);
    return AsteriskTypes.EXTENSION_DEFINITION;
}

<YYINITIAL> {INCLUDE} {
  yybegin(INCLUDE_FILE);
  return AsteriskTypes.INCLUDE_STMT;
}

<INCLUDE_FILE> {
    {CHARACTER}+ {
      yybegin(YYINITIAL);
      return AsteriskTypes.INCLUDE_FILE_TARGET;
    }
}

<YYINITIAL> {INCLUDE_CTX_LEFT} {
    yybegin(INCLUDE_CTX);
    return AsteriskTypes.INCLUDE_CTX_LEFT;
}

<INCLUDE_CTX> {
    {EXT_OPERATOR} {
      yybegin(INCLUDE_CTX);
      return AsteriskTypes.EXT_OPERATOR;
    }
    {CHARACTER}+ {
      yybegin(YYINITIAL);
      return AsteriskTypes.INCLUDE_CTX_CONTEXT;
    }
}

<YYINITIAL> {EXT_INST_LEFT} {
    yybegin(PROGRAM_INSTRUCTION);
    return AsteriskTypes.EXT_INST_LEFT;
}

<PROGRAM_INSTRUCTION> {
    {EXT_OPERATOR} {
      yybegin(EXTENSION);
       return AsteriskTypes.EXT_OPERATOR;
    }
}

<EXTENSION> {
    {EXT_EXTENSION} {
      yybegin(EXTENSION);
      return AsteriskTypes.EXT_EXTENSION;
    }
    {SEPARATOR} {
      yybegin(PRIORITY);
      return AsteriskTypes.SEPARATOR;
    }
}

<PRIORITY> {
    {EXT_PRIORITY} {
      yybegin(APPLICATION_NAME);
      return AsteriskTypes.EXT_PRIORITY;
    }
}

<APPLICATION_NAME> {APPLICATION_NAME} {
    yybegin(APPLICATION_ARGS);
    return AsteriskTypes.APPLICATION_NAME;
}

<APPLICATION_ARGS> {APPLICATION_ARGS} {
    yybegin(YYINITIAL);
    return AsteriskTypes.APPLICATION_ARGS;
}

{WHITE_SPACE}+ {
  yybegin(yystate());
  return TokenType.WHITE_SPACE;
}

{SEPARATOR} {
  yybegin(yystate());
  return AsteriskTypes.SEPARATOR;
}

({CRLF}|{WHITE_SPACE})+ {
    yybegin(YYINITIAL);
    return TokenType.WHITE_SPACE;
}

. {
    return TokenType.BAD_CHARACTER;
}

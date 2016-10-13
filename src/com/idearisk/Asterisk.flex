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

INCLUDE="#include".+

EXTENSION_DEFINITION="[".+"]"

APPLICATION_NAME=[A-Z][a-zA-Z]+
APPLICATION_ARGS="(".+")"

EXT_INST_LEFT="exten"
EXT_OPERATOR="=>"
EXT_EXTENSION=[0-9]+ | [hioatTs]
EXT_PRIORITY=[0-9]+ | n | [0-9]+"(".+")" | n"(".+")"

%state PROGRAM_INSTRUCTION
%state EXTENSION
%state PRIORITY
%state APPLICATION_NAME
%state APPLICATION_ARGS

%%

<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return AsteriskTypes.COMMENT; }

<YYINITIAL> {EXTENSION_DEFINITION}                          { yybegin(YYINITIAL); return AsteriskTypes.EXTENSION_DEFINITION; }

<YYINITIAL> {INCLUDE}                                       { yybegin(YYINITIAL); return AsteriskTypes.INCLUDE; }

<YYINITIAL> {EXT_INST_LEFT}{WHITE_SPACE}+                   { yybegin(PROGRAM_INSTRUCTION); return AsteriskTypes.EXT_INST_LEFT; }

<PROGRAM_INSTRUCTION> {EXT_OPERATOR}{WHITE_SPACE}+          { yybegin(EXTENSION); return AsteriskTypes.EXT_OPERATOR; }

<EXTENSION> {EXT_EXTENSION},                                { yybegin(PRIORITY); return AsteriskTypes.EXT_EXTENSION; }

<PRIORITY> {EXT_PRIORITY},                                  { yybegin(APPLICATION_NAME); return AsteriskTypes.EXT_PRIORITY; }

<APPLICATION_NAME> {APPLICATION_NAME}                       { yybegin(APPLICATION_ARGS); return AsteriskTypes.APPLICATION_NAME; }

<APPLICATION_ARGS> {APPLICATION_ARGS}                       { yybegin(YYINITIAL); return AsteriskTypes.APPLICATION_ARGS; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

{WHITE_SPACE}+                                              { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                                                           { return TokenType.BAD_CHARACTER; }

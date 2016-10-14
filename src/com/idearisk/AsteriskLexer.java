/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package com.idearisk;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.idearisk.psi.AsteriskTypes;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>Asterisk.flex</tt>
 */
class AsteriskLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int PROGRAM_INSTRUCTION = 2;
  public static final int EXTENSION = 4;
  public static final int PRIORITY = 6;
  public static final int APPLICATION_NAME = 8;
  public static final int APPLICATION_ARGS = 10;
  public static final int INCLUDE_FILE = 12;
  public static final int INCLUDE_CTX = 14;
  public static final int ASSIGNMENT = 16;
  public static final int ASSIGNMENT_VAL = 18;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9, 9
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 1568 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>12]|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\1\1\1\20\1\21\1\1\22\0\1\2\2\0\1\7\4\0\1\25\1\26\1\33\1\0\1\5\3"+
    "\0\12\36\1\4\1\3\1\0\1\6\1\27\2\0\23\23\1\34\6\23\1\17\1\4\1\22\1\0\1\32\1"+
    "\0\1\35\1\24\1\12\1\15\1\16\2\24\1\35\1\10\2\24\1\13\1\24\1\11\1\35\3\24\1"+
    "\35\1\31\1\14\2\24\1\30\2\24\12\0\1\20\242\0\2\20\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\12\0\1\1\1\2\1\3\1\4\1\5\4\1\1\6"+
    "\1\5\1\7\1\10\1\5\1\10\2\11\2\5\1\12"+
    "\1\13\1\5\1\14\2\15\4\1\1\0\1\16\1\10"+
    "\1\0\1\17\1\0\1\20\1\21\3\1\2\22\1\0"+
    "\3\1\1\11\2\1\1\23\3\1\1\24\1\25";

  private static int [] zzUnpackAction() {
    int [] result = new int[65];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\37\0\76\0\135\0\174\0\233\0\272\0\331"+
    "\0\370\0\u0117\0\u0136\0\u0155\0\u0174\0\u0193\0\u01b2\0\u01d1"+
    "\0\u01f0\0\u020f\0\u022e\0\u01b2\0\u024d\0\u01b2\0\u01b2\0\u026c"+
    "\0\u028b\0\u02aa\0\u02c9\0\u02e8\0\u0307\0\u0326\0\u0345\0\u0364"+
    "\0\u01b2\0\u0383\0\u0117\0\u03a2\0\u03c1\0\u03e0\0\u03ff\0\u041e"+
    "\0\u01b2\0\u026c\0\u043d\0\u02e8\0\u0307\0\u0307\0\u01b2\0\u045c"+
    "\0\u047b\0\u049a\0\u03ff\0\u041e\0\u04b9\0\u04d8\0\u04f7\0\u0516"+
    "\0\u01b2\0\u0535\0\u0554\0\u0136\0\u0573\0\u0592\0\u05b1\0\u0136"+
    "\0\u0136";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[65];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\13\1\14\1\15\1\16\1\17\1\13\1\17\1\20"+
    "\1\21\5\13\1\22\1\23\1\13\1\15\5\13\1\17"+
    "\7\13\1\17\1\14\1\15\2\17\1\24\1\25\11\17"+
    "\1\0\1\15\16\17\1\14\1\15\2\17\1\26\2\17"+
    "\1\27\7\17\1\0\1\15\7\17\1\27\1\30\1\31"+
    "\2\27\1\31\1\17\1\14\1\15\2\17\1\24\3\17"+
    "\1\32\6\17\1\0\1\15\14\17\1\33\1\17\1\14"+
    "\1\15\2\17\1\24\12\17\1\0\1\15\1\17\1\34"+
    "\10\17\1\34\3\17\1\14\1\15\2\17\1\24\12\17"+
    "\1\0\1\15\3\17\1\35\11\17\1\36\1\14\1\15"+
    "\1\36\1\17\1\36\1\17\12\36\1\15\5\36\1\17"+
    "\7\36\1\37\1\14\1\15\1\37\1\17\1\37\1\40"+
    "\12\37\1\15\5\37\1\17\7\37\1\17\1\14\1\15"+
    "\2\17\1\24\1\41\11\17\1\0\1\15\15\17\1\42"+
    "\1\14\1\43\15\42\1\0\1\15\15\42\1\13\2\0"+
    "\1\13\1\0\1\13\1\0\12\13\1\0\5\13\1\0"+
    "\7\13\1\0\2\14\16\0\1\14\16\0\1\14\1\15"+
    "\16\0\1\15\15\0\1\16\1\0\35\16\37\0\1\13"+
    "\2\0\1\13\1\0\1\13\1\0\1\13\1\44\10\13"+
    "\1\0\5\13\1\0\10\13\2\0\1\13\1\0\1\13"+
    "\1\0\2\13\1\45\7\13\1\0\5\13\1\0\10\13"+
    "\2\0\1\13\1\0\1\13\1\0\12\13\1\0\5\13"+
    "\1\0\1\46\6\13\1\47\1\0\1\50\1\47\1\50"+
    "\1\47\1\50\11\47\1\13\1\0\5\47\1\50\7\47"+
    "\27\0\1\51\7\0\5\52\1\0\31\52\33\0\1\31"+
    "\2\0\1\31\25\0\1\53\36\0\1\53\10\0\1\33"+
    "\10\0\7\54\4\0\2\54\3\0\2\54\2\0\2\54"+
    "\1\0\1\55\1\0\16\55\2\0\4\55\1\56\10\55"+
    "\1\36\2\0\1\36\1\0\1\36\1\0\12\36\1\0"+
    "\5\36\1\0\7\36\1\37\2\0\1\37\1\0\1\37"+
    "\1\0\12\37\1\0\5\37\1\0\7\37\27\0\1\57"+
    "\7\0\1\42\1\0\16\42\2\0\15\42\1\13\2\0"+
    "\1\13\1\0\1\13\1\0\2\13\1\60\7\13\1\0"+
    "\5\13\1\0\10\13\2\0\1\13\1\0\1\13\1\0"+
    "\3\13\1\61\6\13\1\0\5\13\1\0\10\13\2\0"+
    "\1\13\1\0\1\13\1\0\12\13\1\0\5\13\1\0"+
    "\1\13\1\62\5\13\1\47\1\0\1\50\1\47\1\50"+
    "\1\47\1\50\11\47\1\13\1\0\1\63\4\47\1\50"+
    "\7\47\1\50\1\0\16\50\2\0\1\64\14\50\26\65"+
    "\1\0\10\65\1\13\2\0\1\13\1\0\1\13\1\0"+
    "\3\13\1\66\6\13\1\0\5\13\1\0\10\13\2\0"+
    "\1\13\1\0\1\13\1\0\4\13\1\67\5\13\1\0"+
    "\5\13\1\0\10\13\2\0\1\13\1\0\1\13\1\0"+
    "\7\13\1\70\2\13\1\0\5\13\1\0\7\13\26\65"+
    "\1\71\10\65\1\13\2\0\1\13\1\0\1\13\1\0"+
    "\4\13\1\72\5\13\1\0\5\13\1\0\10\13\2\0"+
    "\1\13\1\0\1\13\1\0\5\13\1\73\4\13\1\0"+
    "\5\13\1\0\10\13\2\0\1\13\1\0\1\13\1\0"+
    "\2\13\1\74\7\13\1\0\5\13\1\0\10\13\2\0"+
    "\1\13\1\0\1\13\1\0\5\13\1\75\4\13\1\0"+
    "\5\13\1\0\10\13\2\0\1\13\1\0\1\13\1\0"+
    "\6\13\1\76\3\13\1\0\5\13\1\0\10\13\2\0"+
    "\1\13\1\0\1\13\1\0\6\13\1\77\3\13\1\0"+
    "\5\13\1\0\10\13\2\0\1\13\1\0\1\13\1\0"+
    "\7\13\1\100\2\13\1\0\5\13\1\0\10\13\2\0"+
    "\1\13\1\0\1\13\1\0\7\13\1\101\2\13\1\0"+
    "\5\13\1\0\7\13";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1488];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\12\0\4\1\1\11\4\1\1\11\1\1\2\11\11\1"+
    "\1\11\6\1\1\0\1\11\1\1\1\0\1\1\1\0"+
    "\1\1\1\11\5\1\1\0\3\1\1\11\10\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[65];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  AsteriskLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { yybegin(ASSIGNMENT);
    return AsteriskTypes.VAR_NAME;
            }
          case 22: break;
          case 2: 
            { yybegin(YYINITIAL);
    return TokenType.WHITE_SPACE;
            }
          case 23: break;
          case 3: 
            { yybegin(yystate());
  return TokenType.WHITE_SPACE;
            }
          case 24: break;
          case 4: 
            { yybegin(YYINITIAL);
    return AsteriskTypes.COMMENT;
            }
          case 25: break;
          case 5: 
            { return TokenType.BAD_CHARACTER;
            }
          case 26: break;
          case 6: 
            { yybegin(yystate());
  return AsteriskTypes.SEPARATOR;
            }
          case 27: break;
          case 7: 
            { yybegin(PRIORITY);
      return AsteriskTypes.SEPARATOR;
            }
          case 28: break;
          case 8: 
            { yybegin(EXTENSION);
      return AsteriskTypes.EXT_EXTENSION;
            }
          case 29: break;
          case 9: 
            { yybegin(APPLICATION_NAME);
      return AsteriskTypes.EXT_PRIORITY;
            }
          case 30: break;
          case 10: 
            { yybegin(YYINITIAL);
      return AsteriskTypes.INCLUDE_FILE_TARGET;
            }
          case 31: break;
          case 11: 
            { yybegin(YYINITIAL);
      return AsteriskTypes.INCLUDE_CTX_CONTEXT;
            }
          case 32: break;
          case 12: 
            { yybegin(ASSIGNMENT_VAL);
      return AsteriskTypes.ASSIGNMENT_OPERATOR;
            }
          case 33: break;
          case 13: 
            { yybegin(YYINITIAL);
      return AsteriskTypes.VAR_VAL;
            }
          case 34: break;
          case 14: 
            { yybegin(EXTENSION);
       return AsteriskTypes.EXT_OPERATOR;
            }
          case 35: break;
          case 15: 
            { yybegin(APPLICATION_ARGS);
    return AsteriskTypes.APPLICATION_NAME;
            }
          case 36: break;
          case 16: 
            { yybegin(YYINITIAL);
    return AsteriskTypes.APPLICATION_ARGS;
            }
          case 37: break;
          case 17: 
            { yybegin(INCLUDE_CTX);
      return AsteriskTypes.INCLUDE_CTX_OPERATOR;
            }
          case 38: break;
          case 18: 
            { yybegin(YYINITIAL);
    return AsteriskTypes.EXTENSION_DEFINITION;
            }
          case 39: break;
          case 19: 
            { yybegin(PROGRAM_INSTRUCTION);
    return AsteriskTypes.EXT_INST_LEFT;
            }
          case 40: break;
          case 20: 
            { yybegin(INCLUDE_CTX);
    return AsteriskTypes.INCLUDE_CTX_LEFT;
            }
          case 41: break;
          case 21: 
            { yybegin(INCLUDE_FILE);
  return AsteriskTypes.INCLUDE_STMT;
            }
          case 42: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

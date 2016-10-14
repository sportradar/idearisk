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

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7, 7
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
    "\11\0\1\2\1\1\1\17\1\20\1\1\22\0\1\2\2\0\1\6\4\0\1\24\1\25\2\0\1\5\3\0\12"+
    "\32\1\4\1\3\1\0\1\30\1\31\2\0\23\22\1\33\6\22\1\16\1\4\1\21\3\0\1\34\1\23"+
    "\1\11\1\14\1\15\2\23\1\34\1\7\2\23\1\12\1\23\1\10\1\34\3\23\1\34\1\27\1\13"+
    "\2\23\1\26\2\23\12\0\1\17\242\0\2\17\26\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\10\0\1\1\1\2\1\3\1\4\1\5\5\1\1\6"+
    "\2\7\2\10\2\1\1\11\1\12\1\1\4\0\1\13"+
    "\1\0\1\14\1\0\1\15\3\0\1\16\1\0\1\17"+
    "\3\0\1\10\2\0\1\20\3\0\1\21\1\22";

  private static int [] zzUnpackAction() {
    int [] result = new int[55];
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
    "\0\0\0\35\0\72\0\127\0\164\0\221\0\256\0\313"+
    "\0\350\0\u0105\0\u0122\0\u013f\0\350\0\u015c\0\u0179\0\u0196"+
    "\0\u01b3\0\u01d0\0\350\0\350\0\u01ed\0\u020a\0\u0227\0\u0244"+
    "\0\u0261\0\u027e\0\u029b\0\u02b8\0\u02d5\0\u02f2\0\u030f\0\u032c"+
    "\0\350\0\u0349\0\u0244\0\u0366\0\350\0\u0383\0\u03a0\0\u03bd"+
    "\0\u032c\0\u03da\0\u0366\0\u03f7\0\u0414\0\u0431\0\u03da\0\u044e"+
    "\0\u046b\0\350\0\u0488\0\u04a5\0\u04c2\0\350\0\350";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[55];
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
    "\1\11\1\12\1\13\1\14\1\11\1\15\1\16\1\17"+
    "\5\11\1\20\1\21\1\0\1\13\15\11\1\12\1\13"+
    "\2\11\1\15\11\11\1\0\1\13\7\11\1\22\5\11"+
    "\1\12\1\13\2\11\1\23\1\11\1\24\7\11\1\0"+
    "\1\13\6\11\1\24\2\11\1\25\2\24\1\11\1\12"+
    "\1\13\2\11\1\15\2\11\1\26\6\11\1\0\1\13"+
    "\11\11\1\27\3\11\1\12\1\13\2\11\1\15\11\11"+
    "\1\0\1\13\1\11\1\30\10\11\1\30\2\11\1\12"+
    "\1\13\2\11\1\15\11\11\1\0\1\13\3\11\1\31"+
    "\10\11\1\32\1\12\1\13\1\32\1\11\13\32\1\13"+
    "\7\32\2\11\3\32\1\33\1\12\1\13\1\33\1\11"+
    "\13\33\1\13\7\33\1\34\1\11\3\33\36\0\2\12"+
    "\15\0\1\12\15\0\1\12\1\13\15\0\1\13\14\0"+
    "\1\14\1\0\33\14\7\0\1\35\35\0\1\36\52\0"+
    "\1\37\6\0\1\40\1\0\15\40\2\0\14\40\31\0"+
    "\1\41\35\0\1\25\26\0\1\42\34\0\1\42\5\0"+
    "\1\27\11\0\7\43\4\0\2\43\2\0\2\43\3\0"+
    "\2\43\1\44\1\0\15\44\2\0\14\44\1\32\2\0"+
    "\1\32\1\0\13\32\1\0\7\32\2\0\3\32\1\33"+
    "\2\0\1\33\1\0\13\33\1\0\7\33\2\0\3\33"+
    "\31\0\1\45\13\0\1\46\35\0\1\47\52\0\1\50"+
    "\5\0\1\40\1\0\15\40\2\0\1\51\13\40\1\52"+
    "\1\0\15\52\2\0\14\52\1\44\1\0\15\44\2\0"+
    "\4\44\1\53\7\44\11\0\1\54\35\0\1\55\37\0"+
    "\1\56\17\0\1\52\1\0\15\52\2\0\4\52\1\57"+
    "\7\52\12\0\1\60\35\0\1\61\31\0\1\62\37\0"+
    "\1\63\35\0\1\64\34\0\1\65\35\0\1\66\34\0"+
    "\1\67\17\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1247];
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
    "\10\0\1\11\3\1\1\11\5\1\2\11\10\1\4\0"+
    "\1\11\1\0\1\1\1\0\1\11\3\0\1\1\1\0"+
    "\1\1\3\0\1\1\2\0\1\11\3\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[55];
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
            { return TokenType.BAD_CHARACTER;
            }
          case 19: break;
          case 2: 
            { yybegin(YYINITIAL);
    return TokenType.WHITE_SPACE;
            }
          case 20: break;
          case 3: 
            { yybegin(yystate());
  return TokenType.WHITE_SPACE;
            }
          case 21: break;
          case 4: 
            { yybegin(YYINITIAL);
    return AsteriskTypes.COMMENT;
            }
          case 22: break;
          case 5: 
            { yybegin(yystate());
  return AsteriskTypes.SEPARATOR;
            }
          case 23: break;
          case 6: 
            { yybegin(PRIORITY);
      return AsteriskTypes.SEPARATOR;
            }
          case 24: break;
          case 7: 
            { yybegin(EXTENSION);
      return AsteriskTypes.EXT_EXTENSION;
            }
          case 25: break;
          case 8: 
            { yybegin(APPLICATION_NAME);
      return AsteriskTypes.EXT_PRIORITY;
            }
          case 26: break;
          case 9: 
            { yybegin(YYINITIAL);
      return AsteriskTypes.INCLUDE_FILE_TARGET;
            }
          case 27: break;
          case 10: 
            { yybegin(YYINITIAL);
      return AsteriskTypes.INCLUDE_CTX_CONTEXT;
            }
          case 28: break;
          case 11: 
            { yybegin(EXTENSION);
       return AsteriskTypes.EXT_OPERATOR;
            }
          case 29: break;
          case 12: 
            { yybegin(APPLICATION_ARGS);
    return AsteriskTypes.APPLICATION_NAME;
            }
          case 30: break;
          case 13: 
            { yybegin(INCLUDE_CTX);
      return AsteriskTypes.EXT_OPERATOR;
            }
          case 31: break;
          case 14: 
            { yybegin(YYINITIAL);
    return AsteriskTypes.EXTENSION_DEFINITION;
            }
          case 32: break;
          case 15: 
            { yybegin(YYINITIAL);
    return AsteriskTypes.APPLICATION_ARGS;
            }
          case 33: break;
          case 16: 
            { yybegin(PROGRAM_INSTRUCTION);
    return AsteriskTypes.EXT_INST_LEFT;
            }
          case 34: break;
          case 17: 
            { yybegin(INCLUDE_CTX);
    return AsteriskTypes.INCLUDE_CTX_LEFT;
            }
          case 35: break;
          case 18: 
            { yybegin(INCLUDE_FILE);
  return AsteriskTypes.INCLUDE_STMT;
            }
          case 36: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

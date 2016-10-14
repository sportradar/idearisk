package com.idearisk;

import com.idearisk.psi.AsteriskTypes;
import com.intellij.ide.highlighter.JavaHighlightingColors;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class AsteriskSyntaxHighlighter extends SyntaxHighlighterBase {

	public static final TextAttributesKey SEPARATOR =
      createTextAttributesKey("ASTERISK_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
  public static final TextAttributesKey KEY =
      createTextAttributesKey("ASTERISK_KEY", DefaultLanguageHighlighterColors.KEYWORD);
  public static final TextAttributesKey VALUE =
      createTextAttributesKey("ASTERISK_VALUE", DefaultLanguageHighlighterColors.STRING);
  public static final TextAttributesKey COMMENT =
      createTextAttributesKey("ASTERISK_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
  public static final TextAttributesKey BAD_CHARACTER =
      createTextAttributesKey("ASTERISK_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
	public static final TextAttributesKey VARIABLE =
			createTextAttributesKey("ASTERISK_VARIABLE", DefaultLanguageHighlighterColors.INSTANCE_FIELD);
	public static final TextAttributesKey APPLICATION_CALL =
			createTextAttributesKey("ASTERISK_APPLICATION_CALL", DefaultLanguageHighlighterColors.STATIC_FIELD);
	public static final TextAttributesKey APPLICATION_ARGS =
			createTextAttributesKey("ASTERISK_APPLICATION_ARGS", DefaultLanguageHighlighterColors.STATIC_METHOD);
	public static final TextAttributesKey INCLUDE =
			createTextAttributesKey("ASTERISK_INCLUDE", JavaHighlightingColors.ANNOTATION_NAME_ATTRIBUTES);

  private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
  private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
	private static final TextAttributesKey[] KEYWORDS = new TextAttributesKey[]{KEY};
  private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
	private static final TextAttributesKey[] VARIABLES = new TextAttributesKey[]{VARIABLE};
	private static final TextAttributesKey[] APPLICATION_CALLS = new TextAttributesKey[]{APPLICATION_CALL};
	private static final TextAttributesKey[] APPLICATION_ARGUMENTS = new TextAttributesKey[]{APPLICATION_ARGS};
	private static final TextAttributesKey[] INCLUDES = new TextAttributesKey[]{INCLUDE};

	@NotNull @Override public Lexer getHighlightingLexer() {
		return new AsteriskLexerAdapter();
	}

	@NotNull @Override public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
    if (tokenType.equals(AsteriskTypes.COMMENT)) {
      return COMMENT_KEYS;
    } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
      return BAD_CHAR_KEYS;
		} else if (isKeyword(tokenType)) {
			return KEYWORDS;
		} else if (tokenType.equals(AsteriskTypes.VAR_NAME)) {
			return VARIABLES;
		} else if (tokenType.equals(AsteriskTypes.APPLICATION_NAME)) {
			return APPLICATION_CALLS;
		} else if (tokenType.equals(AsteriskTypes.APPLICATION_ARGS)) {
			return APPLICATION_ARGUMENTS;
		} else if (isInclude(tokenType)) {
			return INCLUDES;
		} else {
      return EMPTY_KEYS;
    }
	}

	private static boolean isInclude(IElementType tokenType) {
		return tokenType.equals(AsteriskTypes.INCLUDE_STMT)
				|| tokenType.equals(AsteriskTypes.INCLUDE_FILE_TARGET);
	}

	private static boolean isApplicationCall(IElementType tokenType) {
		return tokenType.equals(AsteriskTypes.APPLICATION_NAME)
				|| tokenType.equals(AsteriskTypes.APPLICATION_ARGS);
	}

	private static boolean isKeyword(IElementType tokenType) {
		return tokenType.equals(AsteriskTypes.EXT_INST_LEFT)
				|| tokenType.equals(AsteriskTypes.INCLUDE_CTX_LEFT);
	}
}

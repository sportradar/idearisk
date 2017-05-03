package com.idearisk;

import com.idearisk.psi.AsteriskTypes;
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

  private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
  private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
  private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

	@NotNull @Override public Lexer getHighlightingLexer() {
		return new AsteriskLexerAdapter();
	}

	@NotNull @Override public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
    if (tokenType.equals(AsteriskTypes.COMMENT)) {
      return COMMENT_KEYS;
    } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
      return BAD_CHAR_KEYS;
		} else {
      return EMPTY_KEYS;
    }
	}
}

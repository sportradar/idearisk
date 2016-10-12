package com.idearisk;

import com.intellij.lexer.FlexAdapter;

public class AsteriskLexerAdapter extends FlexAdapter {
	public AsteriskLexerAdapter() {
		super(new AsteriskLexer(null));
	}
}

package com.idearisk;

import com.intellij.lang.Language;

public class AsteriskLang extends Language{
	public static final AsteriskLang INSTANCE = new AsteriskLang();

	private AsteriskLang() {
		super("Asterisk");
	}
}

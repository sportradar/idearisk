package com.idearisk;

import com.intellij.lang.Language;

public class AsteriskLanguage extends Language{
	public static final AsteriskLanguage INSTANCE = new AsteriskLanguage();

	private AsteriskLanguage() {
		super("Asterisk");
	}
}

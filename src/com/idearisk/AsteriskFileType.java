package com.idearisk;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class AsteriskFileType extends LanguageFileType {
	public static final AsteriskFileType INSTANCE = new AsteriskFileType();
	private AsteriskFileType() {
		super(AsteriskLanguage.INSTANCE);
	}

	@NotNull @Override public String getName() {
		return "Asterisk file";
	}

	@NotNull @Override public String getDescription() {
		return "Asterisk language file";
	}

	@NotNull @Override public String getDefaultExtension() {
		return "conf";
	}

	@Nullable @Override public Icon getIcon() {
		return AsteriskIcons.FILE;
	}
}

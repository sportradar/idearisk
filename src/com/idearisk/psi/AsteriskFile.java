package com.idearisk.psi;

import com.idearisk.AsteriskFileType;
import com.idearisk.AsteriskLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class AsteriskFile extends PsiFileBase {
	public AsteriskFile(@NotNull FileViewProvider viewProvider) {
		super(viewProvider, AsteriskLanguage.INSTANCE);
	}

	@NotNull @Override public FileType getFileType() {
		return AsteriskFileType.INSTANCE;
	}

	@Override
	public String toString() {
		return "Asterisk File";
	}
}

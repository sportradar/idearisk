package com.idearisk.psi;

import com.idearisk.AsteriskLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class AsteriskElementType extends IElementType {
	public AsteriskElementType(@NotNull @NonNls String debugName) {
		super(debugName, AsteriskLanguage.INSTANCE);
	}
}

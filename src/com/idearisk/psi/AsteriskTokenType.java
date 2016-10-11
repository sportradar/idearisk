package com.idearisk.psi;

import com.idearisk.AsteriskLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class AsteriskTokenType extends IElementType {

	public AsteriskTokenType(@NotNull @NonNls String debugName) {
		super(debugName, AsteriskLanguage.INSTANCE);
	}

	@Override
	public String toString() {
		return "AsteriskTokenType." + super.toString();
	}
}

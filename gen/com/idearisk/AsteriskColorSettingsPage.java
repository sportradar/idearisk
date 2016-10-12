package com.idearisk;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class AsteriskColorSettingsPage implements ColorSettingsPage {

	private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
			new AttributesDescriptor("Key", AsteriskSyntaxHighlighter.KEY),
			new AttributesDescriptor("Separator", AsteriskSyntaxHighlighter.SEPARATOR),
			new AttributesDescriptor("Value", AsteriskSyntaxHighlighter.VALUE),
	};


	@Nullable @Override public Icon getIcon() {
		return AsteriskIcons.FILE;
	}

	@NotNull @Override public SyntaxHighlighter getHighlighter() {
		return new AsteriskSyntaxHighlighter();
	}

	@NotNull @Override public String getDemoText() {
		return "Hest";
	}

	@Nullable @Override public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
		return null;
	}

	@NotNull @Override public AttributesDescriptor[] getAttributeDescriptors() {
		return DESCRIPTORS;
	}

	@NotNull @Override public ColorDescriptor[] getColorDescriptors() {
		return ColorDescriptor.EMPTY_ARRAY;
	}

	@NotNull @Override public String getDisplayName() {
		return "Asterisk";
	}
}

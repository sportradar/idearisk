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
			new AttributesDescriptor("Keyword", AsteriskSyntaxHighlighter.KEY),
			new AttributesDescriptor("Extension definition", AsteriskSyntaxHighlighter.EXTENSION_DEFINITION),
			new AttributesDescriptor("Application call", AsteriskSyntaxHighlighter.APPLICATION_CALL),
			new AttributesDescriptor("Application arguments", AsteriskSyntaxHighlighter.APPLICATION_ARGS),
	};


	@Nullable @Override public Icon getIcon() {
		return AsteriskIcons.FILE;
	}

	@NotNull @Override public SyntaxHighlighter getHighlighter() {
		return new AsteriskSyntaxHighlighter();
	}

	@NotNull @Override public String getDemoText() {
		return "; Some comments to start with\n"
				+ "; Another comment just for the hell of it\n\n"
				+ "[extension-definition]\n"
				+ "variable1=value\n"
				+ "variable2=I've got white space characters in my variable value and everything\n\n"
				+ "#include needthis.conf\n"
				+ "#include needthisaswell.conf\n\n"
				+ "[another-extension-definition]\n\n"
				+ "include => extension-include\n"
				+ "exten => 1,1,ApplicationCall(application arguments)";
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

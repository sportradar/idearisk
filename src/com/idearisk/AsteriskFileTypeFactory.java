package com.idearisk;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;

public class AsteriskFileTypeFactory extends FileTypeFactory {
	@Override public void createFileTypes(FileTypeConsumer fileTypeConsumer) {
		fileTypeConsumer.consume(AsteriskFileType.INSTANCE, "conf");
	}
}

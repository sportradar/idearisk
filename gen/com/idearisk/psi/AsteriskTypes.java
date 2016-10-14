// This is a generated file. Not intended for manual editing.
package com.idearisk.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.idearisk.psi.impl.*;

public interface AsteriskTypes {

  IElementType INCLUDE_CTX = new AsteriskElementType("INCLUDE_CTX");
  IElementType INCLUDE_FILE = new AsteriskElementType("INCLUDE_FILE");
  IElementType PROGRAM_STATEMENT = new AsteriskElementType("PROGRAM_STATEMENT");
  IElementType STATEMENT = new AsteriskElementType("STATEMENT");

  IElementType APPLICATION_ARGS = new AsteriskTokenType("APPLICATION_ARGS");
  IElementType APPLICATION_NAME = new AsteriskTokenType("APPLICATION_NAME");
  IElementType COMMENT = new AsteriskTokenType("COMMENT");
  IElementType CRLF = new AsteriskTokenType("CRLF");
  IElementType EXTENSION_DEFINITION = new AsteriskTokenType("EXTENSION_DEFINITION");
  IElementType EXT_EXTENSION = new AsteriskTokenType("EXT_EXTENSION");
  IElementType EXT_INST_LEFT = new AsteriskTokenType("EXT_INST_LEFT");
  IElementType EXT_OPERATOR = new AsteriskTokenType("EXT_OPERATOR");
  IElementType EXT_PRIORITY = new AsteriskTokenType("EXT_PRIORITY");
  IElementType INCLUDE_CTX_CONTEXT = new AsteriskTokenType("INCLUDE_CTX_CONTEXT");
  IElementType INCLUDE_CTX_LEFT = new AsteriskTokenType("INCLUDE_CTX_LEFT");
  IElementType INCLUDE_CTX_OPERATOR = new AsteriskTokenType("INCLUDE_CTX_OPERATOR");
  IElementType INCLUDE_FILE_TARGET = new AsteriskTokenType("INCLUDE_FILE_TARGET");
  IElementType INCLUDE_STMT = new AsteriskTokenType("INCLUDE_STMT");
  IElementType SEPARATOR = new AsteriskTokenType("SEPARATOR");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == INCLUDE_CTX) {
        return new AsteriskIncludeCtxImpl(node);
      }
      else if (type == INCLUDE_FILE) {
        return new AsteriskIncludeFileImpl(node);
      }
      else if (type == PROGRAM_STATEMENT) {
        return new AsteriskProgramStatementImpl(node);
      }
      else if (type == STATEMENT) {
        return new AsteriskStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

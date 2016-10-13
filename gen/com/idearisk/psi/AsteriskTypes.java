// This is a generated file. Not intended for manual editing.
package com.idearisk.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.idearisk.psi.impl.*;

public interface AsteriskTypes {

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
  IElementType INCLUDE = new AsteriskTokenType("INCLUDE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROGRAM_STATEMENT) {
        return new AsteriskProgramStatementImpl(node);
      }
      else if (type == STATEMENT) {
        return new AsteriskStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

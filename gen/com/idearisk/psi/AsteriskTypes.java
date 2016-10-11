// This is a generated file. Not intended for manual editing.
package com.idearisk.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.idearisk.psi.impl.*;

public interface AsteriskTypes {

  IElementType PROPERTY = new AsteriskElementType("PROPERTY");

  IElementType COMMENT = new AsteriskTokenType("COMMENT");
  IElementType CRLF = new AsteriskTokenType("CRLF");
  IElementType KEY = new AsteriskTokenType("KEY");
  IElementType SEPARATOR = new AsteriskTokenType("SEPARATOR");
  IElementType VALUE = new AsteriskTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new SimplePropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

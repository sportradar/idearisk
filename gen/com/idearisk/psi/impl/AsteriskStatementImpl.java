// This is a generated file. Not intended for manual editing.
package com.idearisk.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.idearisk.psi.AsteriskTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.idearisk.psi.*;

public class AsteriskStatementImpl extends ASTWrapperPsiElement implements AsteriskStatement {

  public AsteriskStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AsteriskVisitor visitor) {
    visitor.visitStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AsteriskVisitor) accept((AsteriskVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public AsteriskAssignment getAssignment() {
    return findChildByClass(AsteriskAssignment.class);
  }

  @Override
  @Nullable
  public AsteriskIncludeCtx getIncludeCtx() {
    return findChildByClass(AsteriskIncludeCtx.class);
  }

  @Override
  @Nullable
  public AsteriskIncludeFile getIncludeFile() {
    return findChildByClass(AsteriskIncludeFile.class);
  }

  @Override
  @Nullable
  public AsteriskProgramStatement getProgramStatement() {
    return findChildByClass(AsteriskProgramStatement.class);
  }

}

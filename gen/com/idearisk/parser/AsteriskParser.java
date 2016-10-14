// This is a generated file. Not intended for manual editing.
package com.idearisk.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.idearisk.psi.AsteriskTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class AsteriskParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ASSIGNMENT) {
      r = ASSIGNMENT(b, 0);
    }
    else if (t == INCLUDE_CTX) {
      r = INCLUDE_CTX(b, 0);
    }
    else if (t == INCLUDE_FILE) {
      r = INCLUDE_FILE(b, 0);
    }
    else if (t == PROGRAM_STATEMENT) {
      r = PROGRAM_STATEMENT(b, 0);
    }
    else if (t == STATEMENT) {
      r = STATEMENT(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return asteriskFile(b, l + 1);
  }

  /* ********************************************************** */
  // VAR_NAME ASSIGNMENT_OPERATOR VAR_VAL
  public static boolean ASSIGNMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ASSIGNMENT")) return false;
    if (!nextTokenIs(b, VAR_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VAR_NAME, ASSIGNMENT_OPERATOR, VAR_VAL);
    exit_section_(b, m, ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // INCLUDE_CTX_LEFT INCLUDE_CTX_OPERATOR INCLUDE_CTX_CONTEXT
  public static boolean INCLUDE_CTX(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INCLUDE_CTX")) return false;
    if (!nextTokenIs(b, INCLUDE_CTX_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INCLUDE_CTX_LEFT, INCLUDE_CTX_OPERATOR, INCLUDE_CTX_CONTEXT);
    exit_section_(b, m, INCLUDE_CTX, r);
    return r;
  }

  /* ********************************************************** */
  // INCLUDE_STMT INCLUDE_FILE_TARGET
  public static boolean INCLUDE_FILE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INCLUDE_FILE")) return false;
    if (!nextTokenIs(b, INCLUDE_STMT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INCLUDE_STMT, INCLUDE_FILE_TARGET);
    exit_section_(b, m, INCLUDE_FILE, r);
    return r;
  }

  /* ********************************************************** */
  // EXT_INST_LEFT EXT_OPERATOR EXT_EXTENSION SEPARATOR EXT_PRIORITY SEPARATOR APPLICATION_NAME APPLICATION_ARGS
  public static boolean PROGRAM_STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PROGRAM_STATEMENT")) return false;
    if (!nextTokenIs(b, EXT_INST_LEFT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, EXT_INST_LEFT, EXT_OPERATOR, EXT_EXTENSION, SEPARATOR, EXT_PRIORITY, SEPARATOR, APPLICATION_NAME, APPLICATION_ARGS);
    exit_section_(b, m, PROGRAM_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // EXTENSION_DEFINITION | INCLUDE_FILE | ASSIGNMENT | PROGRAM_STATEMENT | INCLUDE_CTX
  public static boolean STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = consumeToken(b, EXTENSION_DEFINITION);
    if (!r) r = INCLUDE_FILE(b, l + 1);
    if (!r) r = ASSIGNMENT(b, l + 1);
    if (!r) r = PROGRAM_STATEMENT(b, l + 1);
    if (!r) r = INCLUDE_CTX(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean asteriskFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asteriskFile")) return false;
    int c = current_position_(b);
    while (true) {
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "asteriskFile", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // STATEMENT|COMMENT|CRLF
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = STATEMENT(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, m, null, r);
    return r;
  }

}

package com.idearisk;

import com.idearisk.parser.AsteriskParser;
import com.idearisk.psi.AsteriskFile;
import com.idearisk.psi.AsteriskTypes;
import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;

public class AsteriskParserDefinition implements ParserDefinition {

	public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
  public static final TokenSet COMMENTS = TokenSet.create(AsteriskTypes.COMMENT);

  public static final IFileElementType FILE = new IFileElementType(Language.<AsteriskLanguage>findInstance(AsteriskLanguage.class));

	@NotNull @Override public Lexer createLexer(Project project) {
		return new AsteriskLexerAdapter();
	}

	@Override public PsiParser createParser(Project project) {
		return new AsteriskParser();
	}

	@Override public IFileElementType getFileNodeType() {
		return FILE;
	}

	@NotNull @Override public TokenSet getWhitespaceTokens() {
		return WHITE_SPACES;
	}

	@NotNull @Override public TokenSet getCommentTokens() {
		return COMMENTS;
	}

	@NotNull @Override public TokenSet getStringLiteralElements() {
		return TokenSet.EMPTY;
	}

	@NotNull @Override public PsiElement createElement(ASTNode astNode) {
		return AsteriskTypes.Factory.createElement(astNode);
	}

	@Override public PsiFile createFile(FileViewProvider fileViewProvider) {
		return new AsteriskFile(fileViewProvider);
	}

	@Override public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode astNode, ASTNode astNode1) {
		return SpaceRequirements.MAY;
	}
}

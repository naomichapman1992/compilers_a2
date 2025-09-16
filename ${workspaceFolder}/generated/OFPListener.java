// Generated from /Users/admin/Documents/Uni/Code_Transformation/A2/compilers_a2/OFP.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OFPParser}.
 */
public interface OFPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OFPParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(OFPParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(OFPParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link OFPParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(OFPParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link OFPParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(OFPParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyStmt}
	 * labeled alternative in {@link OFPParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmt(OFPParser.EmptyStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyStmt}
	 * labeled alternative in {@link OFPParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmt(OFPParser.EmptyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(OFPParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(OFPParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(OFPParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(OFPParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link OFPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(OFPParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link OFPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(OFPParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link OFPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(OFPParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link OFPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(OFPParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelExpr}
	 * labeled alternative in {@link OFPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(OFPParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelExpr}
	 * labeled alternative in {@link OFPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(OFPParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link OFPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(OFPParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link OFPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(OFPParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link OFPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(OFPParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpr}
	 * labeled alternative in {@link OFPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(OFPParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link OFPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(OFPParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link OFPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(OFPParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link OFPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(OFPParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link OFPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(OFPParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link OFPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(OFPParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link OFPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(OFPParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterPostfix(OFPParser.PostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitPostfix(OFPParser.PostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(OFPParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(OFPParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OFPParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(OFPParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link OFPParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(OFPParser.ArgListContext ctx);
}
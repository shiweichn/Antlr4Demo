// Generated from D:/gitRepos/antlrDemo/src/cgame\CGame.g4 by ANTLR 4.7
package cgame;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CGameParser}.
 */
public interface CGameListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CGameParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CGameParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGameParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CGameParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqOrne}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqOrne(CGameParser.EqOrneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqOrne}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqOrne(CGameParser.EqOrneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParens(CGameParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParens(CGameParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunc(CGameParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunc(CGameParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decl}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CGameParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decl}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CGameParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(CGameParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(CGameParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(CGameParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(CGameParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNum(CGameParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNum(CGameParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GtLtGeLe}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGtLtGeLe(CGameParser.GtLtGeLeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GtLtGeLe}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGtLtGeLe(CGameParser.GtLtGeLeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryOpt}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryOpt(CGameParser.TernaryOptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryOpt}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryOpt(CGameParser.TernaryOptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId(CGameParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId(CGameParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGameParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(CGameParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGameParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(CGameParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGameParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CGameParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGameParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CGameParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CGameParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CGameParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CGameParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CGameParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link CGameParser#number}.
	 * @param ctx the parse tree
	 */
	void enterInt(CGameParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CGameParser#number}.
	 * @param ctx the parse tree
	 */
	void exitInt(CGameParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link CGameParser#number}.
	 * @param ctx the parse tree
	 */
	void enterFloat(CGameParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link CGameParser#number}.
	 * @param ctx the parse tree
	 */
	void exitFloat(CGameParser.FloatContext ctx);
}
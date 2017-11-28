// Generated from D:/gitRepos/antlrDemo/src/cgame\CGame.g4 by ANTLR 4.7
package cgame;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CGameParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CGameVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CGameParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CGameParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqOrne}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOrne(CGameParser.EqOrneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(CGameParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(CGameParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decl}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(CGameParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(CGameParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(CGameParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(CGameParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GtLtGeLe}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtLtGeLe(CGameParser.GtLtGeLeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryOpt}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryOpt(CGameParser.TernaryOptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CGameParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CGameParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGameParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(CGameParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGameParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CGameParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CGameParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(CGameParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CGameParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(CGameParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link CGameParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(CGameParser.FloatContext ctx);
}
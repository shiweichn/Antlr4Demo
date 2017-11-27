package cgame;

import cgame.CGameParser.*;

/**
 * Created by Sweeney on 2017/11/27.
 *
 * @author Sweeney
 * @version 1.0
 */
public class CGameEvalVisitor extends CGameBaseVisitor<Object> {
	@Override
	public Object visitProg(ProgContext ctx) {
		return super.visitProg(ctx);
	}

	@Override
	public Object visitEqOrne(EqOrneContext ctx) {
		return super.visitEqOrne(ctx);
	}

	@Override
	public Object visitFunc(FuncContext ctx) {
		return super.visitFunc(ctx);
	}

	@Override
	public Object visitDecl(DeclContext ctx) {
		return super.visitDecl(ctx);
	}

	@Override
	public Object visitPrint(PrintContext ctx) {
		final Object result = visit(ctx.expression());
		System.out.println("result:" + result.toString());
		return result;
	}

	@Override
	public Object visitParens(ParensContext ctx) {
		return visit(ctx.expression());
	}

	/**
	 * 处理 * / 运算符
	 *
	 * @param ctx
	 * @return
	 */
	@Override
	public Object visitMulDiv(MulDivContext ctx) {
		final String left = visit(ctx.expression(0)).toString();
		final String right = visit(ctx.expression(1)).toString();

		if (ctx.op.getType() == CGameLexer.MUL)
			return Integer.valueOf(left) * Integer.valueOf(right);
		else
			return Integer.valueOf(left) / Integer.valueOf(right);
	}


	/**
	 * 处理 + - 运算符
	 *
	 * @param ctx
	 * @return
	 */
	@Override
	public Object visitAddSub(AddSubContext ctx) {
		final String left = visit(ctx.expression(0)).toString();
		final String right = visit(ctx.expression(1)).toString();

		if (ctx.op.getType() == CGameLexer.ADD)
			return Integer.valueOf(left) + Integer.valueOf(right);
		else
			return Integer.valueOf(left) - Integer.valueOf(right);
	}

	@Override
	public Object visitNum(NumContext ctx) {
		return visit(ctx.number());
	}

	@Override
	public Object visitTernaryOpt(TernaryOptContext ctx) {
		return super.visitTernaryOpt(ctx);
	}

	@Override
	public Object visitId(IdContext ctx) {
		return super.visitId(ctx);
	}

	@Override
	public Object visitGtLtGtFt(GtLtGtFtContext ctx) {
		return super.visitGtLtGtFt(ctx);
	}

	@Override
	public Object visitDeclare(DeclareContext ctx) {
		return super.visitDeclare(ctx);
	}

	@Override
	public Object visitFunction(FunctionContext ctx) {
		return super.visitFunction(ctx);
	}

	@Override
	public Object visitParameter(ParameterContext ctx) {
		return super.visitParameter(ctx);
	}

	/**
	 * 处理整数
	 *
	 * @param ctx
	 * @return
	 */
	@Override
	public Object visitInt(IntContext ctx) {
		return Integer.valueOf(ctx.INT().getText());
	}

	/**
	 * 处理浮点数
	 *
	 * @param ctx
	 * @return
	 */
	@Override
	public Object visitFloat(FloatContext ctx) {
		return Float.valueOf(ctx.FLOAT().getText());
	}
}

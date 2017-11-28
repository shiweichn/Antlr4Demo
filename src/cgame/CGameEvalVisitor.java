package cgame;

import cgame.CGameParser.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Sweeney on 2017/11/27.
 *
 * @author Sweeney
 * @version 1.0
 */
public class CGameEvalVisitor extends CGameBaseVisitor<Object> {
	ParseTreeProperty<Object> treeValues = new ParseTreeProperty<>();
	private HashMap<String, Object> map = new HashMap<>();
	private FunctionUtils utils = null;

	public CGameEvalVisitor(FunctionUtils utils) {
		this.utils = utils;
	}

	@Override
	public Object visitProg(ProgContext ctx) {
		return super.visitProg(ctx);
	}

	@Override
	public Object visitEqOrne(EqOrneContext ctx) {
		final String left = visit(ctx.expression(0)).toString();
		final String right = visit(ctx.expression(1)).toString();
		if (ctx.op.getType() == CGameParser.EQUAL_EQUAL)
			return Float.parseFloat(left) == Float.parseFloat(right);
		else
			return Float.parseFloat(left) != Float.parseFloat(right);
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
		if (left.contains(".") || right.contains(".")) {

			if (ctx.op.getType() == CGameLexer.MUL)
				return Float.valueOf(left) * Float.valueOf(right);
			else
				return Float.valueOf(left) / Float.valueOf(right);
		} else {

			if (ctx.op.getType() == CGameLexer.MUL)
				return Integer.valueOf(left) * Integer.valueOf(right);
			else if (Integer.valueOf(left) % Integer.valueOf(right) == 0)
				return Integer.valueOf(left) / Integer.valueOf(right);
			else
				return Float.valueOf(left) / Float.valueOf(right);

		}
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
		if (left.contains(".") || right.contains(".")) {

			if (ctx.op.getType() == CGameLexer.ADD)
				return Float.valueOf(left) + Float.valueOf(right);
			else
				return Float.valueOf(left) - Float.valueOf(right);
		} else {

			if (ctx.op.getType() == CGameLexer.ADD)
				return Integer.valueOf(left) + Integer.valueOf(right);
			else
				return Integer.valueOf(left) - Integer.valueOf(right);
		}
	}

	@Override
	public Object visitNum(NumContext ctx) {
		return visit(ctx.number());
	}

	@Override
	public Object visitTernaryOpt(TernaryOptContext ctx) {
		final Object left = visit(ctx.expression(0));
		final Object middle = visit(ctx.expression(1));
		final Object right = visit(ctx.expression(2));

		if (Boolean.parseBoolean(left.toString()))
			return middle;
		else
			return right;
	}

	@Override
	public Object visitId(IdContext ctx) {
		final String id = ctx.ID().getText();
		return map.containsKey(id) ? map.get(id) : new Object();
	}

	@Override
	public Object visitGtLtGeLe(GtLtGeLeContext ctx) {
		final String left = visit(ctx.expression(0)).toString();
		final String right = visit(ctx.expression(1)).toString();
		if (ctx.op.getType() == CGameParser.GT) {

			return Float.valueOf(left) > Float.valueOf(right);
		} else if (ctx.op.getType() == CGameParser.LT) {

			return Float.valueOf(left) < Float.valueOf(right);
		} else if (ctx.op.getType() == CGameParser.GE) {

			return Float.valueOf(left) >= Float.valueOf(right);
		} else if (ctx.op.getType() == CGameParser.LE) {

			return Float.valueOf(left) <= Float.valueOf(right);
		}
		return false;
	}

	@Override
	public Object visitDeclare(DeclareContext ctx) {
		final Object result = visit(ctx.expression());
		map.put(ctx.ID().getText(), result);
		return result;
	}

	@Override
	public Object visitFunction(FunctionContext ctx) {
		System.out.println("function..." + ctx.getText());
		if ("list()".equals(ctx.getText())) {
			final List list = utils.list();
			treeValues.put(ctx, list);
			return list;
		} else if ("count()".equals(ctx.getText())) {
			final int childCount = ctx.parent.getChildCount();
			final int listIndex = childCount - 3;
			final ParseTree child = ctx.parent.getChild(listIndex);
			final List<String> list = (List<String>) treeValues.get(child);
			return list.size();
		}
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

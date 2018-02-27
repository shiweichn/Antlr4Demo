package cgame;

import cgame.CGameParser.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
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


	@Override
	public Object visitProg(ProgContext ctx) {
		return super.visitProg(ctx);
	}

	@Override
	protected Object defaultResult() {
		return "Null";
	}

	@Override
	public Object visitNegation(NegationContext ctx) {

		final String result = visit(ctx.expression()).toString();
		if ("true".equals(result)) {
			return false;
		} else if ("false".equals(result)) {
			return true;
		} else {
			return super.visitNegation(ctx);
		}
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
	public Object visitMinus(MinusContext ctx) {
		final String minus = "-" + visit(ctx.expression()).toString();
		if (minus.contains(".")) {
			return Float.parseFloat(minus);
		} else {
			return Integer.parseInt(minus);
		}
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
		System.out.printf("visitMulDiv !!!!! left:%s  right:%s \n", left, right);
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
		System.out.println(left);
		final String right = visit(ctx.expression(1)).toString();
		System.out.println(right);
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
//		final Object middle = visit(ctx.expression(1));
//		final Object right = visit(ctx.expression(2));

		if (Boolean.parseBoolean(left.toString()))
			return visit(ctx.expression(1));
		else
			return visit(ctx.expression(2));
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
	public Object visitParameter(ParameterContext ctx) {
//		System.out.println("Parameter...." + ctx.getText());
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

	@Override
	public Object visitCodeBlock(CGameParser.CodeBlockContext ctx) {
		Object obj = "Null";
		for (ExpressionContext context : ctx.expression()) {
			obj = visit(context);
		}
		return obj;
	}

	@Override
	public Object visitForControl(CGameParser.ForControlContext ctx) {
		Object result = "Null";
		List<Object> vList = (List<Object>) visit(ctx.expression());
		for (Object v : vList) {
			map.put(ctx.ID().toString(), v);
			for (ExpressionContext expr : ctx.statement().expression()) {
				result = visit(expr);
			}
		}
		return result;
	}

	@Override
	public Object visitIfControl(CGameParser.IfControlContext ctx) {
		Object result = "Null";
		for (int i = 0; i < ctx.expression().size(); i++) {
			boolean cond = (boolean) visit(ctx.expression(i));
			if (cond) {
				for (ExpressionContext expr : ctx.statement(i).expression()) {
					result = visit(expr);
				}
				break;
			}
		}
		return result;
	}

	@Override
	public Object visitBool(CGameParser.BoolContext ctx) {
		if (ctx.getText().equals("TRUE"))
			return true;
		else
			return false;
	}

	@Override
	public Object visitGrp(CGameParser.GrpContext ctx) {
		List<Object> list = new ArrayList<>();
		for (ParameterContext pctx : ctx.group().parameter()) {
			list.add(Integer.valueOf(pctx.getText()));
		}
		return list;
	}

	@Override
	public Object visitTheWith(CGameParser.TheWithContext ctx) {
		boolean tf = true;
		for (int i = 0; i < ctx.expression().size(); i++) {
			boolean cond = (boolean) visit(ctx.expression(i));
			if (!cond) tf = false;
		}
		return tf;
	}

	@Override
	public Object visitTheOr(CGameParser.TheOrContext ctx) {
		boolean tf = false;
		for (int i = 0; i < ctx.expression().size(); i++) {
			boolean cond = (boolean) visit(ctx.expression(i));
			if (cond) tf = true;
		}
		return tf;
	}

	@Override
	public Object visitFunction(FunctionContext ctx) {
		final String methodName = ctx.ID().getText();
		switch (methodName) {
			////////////////////////////////////杂项函数////////////////////////////////////
			////////////////////////////////////杂项函数////////////////////////////////////
			////////////////////////////////////杂项函数////////////////////////////////////
			case "log": {
				System.out.println("log...." + visit(ctx.parameter(0)));
				return "logOK";
			}
			case "list": {
//				final List<String> list = teamCtrl.list();
//				treeValues.put(ctx, list);
//				return list;
			}
			case "testPrint": {
				System.out.println("testPrint:::::::::::::::::::::::::::");
				return "Blank";
			}
			case "count": {
				final int childCount = ctx.parent.getChildCount();
				final int listIndex = childCount - 3;
				final ParseTree child = ctx.parent.getChild(listIndex);
				final List<String> list = (List<String>) treeValues.get(child);
				return list.size();
			}
			case "random": {
				// 找到当前节点相对于这棵树的位置
				final int currentCtxIndex = ctx.getParent().children.indexOf(ctx);
				// 向前找两个便是上个函数的位置
				final int listIndex = currentCtxIndex - 2;
				// 找到上个函数并取出结果
				final ParseTree child = ctx.parent.getChild(listIndex);
				final List<Object> list = (List<Object>) treeValues.get(child);
				final String s = visit(ctx.parameter(0)).toString();
				int i = Integer.parseInt(s);
//				List<Object> list1 = teamCtrl.random(list, i);
//				treeValues.put(ctx, list1);
//				return list1;
			}
		}
		return super.visitFunction(ctx);
	}
}

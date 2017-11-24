package calc;

import calc.CalcParser.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sweeney on 2017/11/24.
 */
public class MyCalcVisitor extends CalcBaseVisitor<Integer> {
	Map<String, Integer> memory = new HashMap<>();

	@Override
	public Integer visitNull(NullContext ctx) {
		memory.clear();
		return 0;
	}

	@Override
	public Integer visitPrintExpr(PrintExprContext ctx) {
		final Integer value = visit(ctx.expr());    // 计算expr子节点的值
		System.out.println(value);                    // 打印结果
		return 0;                                    // 上面已经直接打印出了结果，所以这里返回一个假值即可
	}

	@Override
	public Integer visitAssign(AssignContext ctx) {
		final String id = ctx.ID().getText(); // id 在 = 的左侧
		final Integer value = visit(ctx.expr()); // 计算右侧表达式的值
		memory.put(id, value);
		return value;
	}

	@Override
	public Integer visitParens(ParensContext ctx) {
		return visit(ctx.expr());    // 返回子表达式的值
	}

	@Override
	public Integer visitMulDiv(MulDivContext ctx) {
		final Integer left = visit(ctx.expr(0));// 计算左侧表达式的值
		final Integer right = visit(ctx.expr(1));// 计算右侧表达式的值
		if (ctx.op.getType() == CalcParser.MUL)
			return left * right;
		else
			return left / right;
	}

	@Override
	public Integer visitAddSub(AddSubContext ctx) {
		final Integer left = visit(ctx.expr(0));
		final Integer right = visit(ctx.expr(1));

		if (ctx.op.getType() == CalcParser.ADD)
			return left + right;
		else
			return left - right;
	}

	@Override
	public Integer visitId(IdContext ctx) {
		final String id = ctx.ID().getText();
		if (memory.containsKey(id))
			return memory.get(id);
		else
			return 0;
	}

	@Override
	public Integer visitInt(IntContext ctx) {
		return Integer.parseInt(ctx.INT().getText());
	}
}

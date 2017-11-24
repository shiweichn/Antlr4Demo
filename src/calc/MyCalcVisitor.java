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
	public Integer visitProg(ProgContext ctx) {
		return super.visitProg(ctx);
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
	public Integer visitBlank(BlankContext ctx) {
		return super.visitBlank(ctx);
	}

	@Override
	public Integer visitParens(ParensContext ctx) {
		return super.visitParens(ctx);
	}

	@Override
	public Integer visitMulDiv(MulDivContext ctx) {
		return super.visitMulDiv(ctx);
	}

	@Override
	public Integer visitAddSub(AddSubContext ctx) {
		return super.visitAddSub(ctx);
	}

	@Override
	public Integer visitId(IdContext ctx) {
		return super.visitId(ctx);
	}

	@Override
	public Integer visitInt(IntContext ctx) {
		return super.visitInt(ctx);
	}
}

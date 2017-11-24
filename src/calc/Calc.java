package calc;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

/**
 * Created by Sweeney on 2017/11/24.
 */
public class Calc {
	public static void main(String[] args) throws IOException {

		final ANTLRInputStream input = new ANTLRInputStream(System.in);
		final CalcLexer lexer = new CalcLexer(input);
		final CommonTokenStream tokens = new CommonTokenStream(lexer);
		final CalcParser parser = new CalcParser(tokens);

		ParseTree tree = parser.prog();
		final CalcBaseVisitor<Object> visitor = new CalcBaseVisitor<>();
		visitor.visit(tree);

	}
}

package cgame;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

/**
 * Created by Sweeney on 2017/11/27.
 */
public class CGameEvalVisitorTest {
	public static void main(String[] args) throws IOException {

		final ANTLRInputStream input = new ANTLRInputStream(System.in);
		final CGameLexer lexer = new CGameLexer(input);
		final CommonTokenStream tokens = new CommonTokenStream(lexer);
		final CGameParser parser = new CGameParser(tokens);
		ParseTree tree = parser.prog();


		final CGameEvalVisitor visitor = new CGameEvalVisitor();
		visitor.visit(tree);
	}
}

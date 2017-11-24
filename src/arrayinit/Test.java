package arrayinit;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

/**
 * Created by Sweeney on 2017/11/23.
 */
public class Test {
	public static void main(String[] args) throws IOException {
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		ArrayInitLexer lexer = new ArrayInitLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ArrayInitParser parser = new ArrayInitParser(tokens);
		ParseTree tree = parser.init();
		System.out.println(tree.toStringTree(parser));
	}
}

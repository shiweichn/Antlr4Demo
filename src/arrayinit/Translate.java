package arrayinit;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

/**
 * Created by Sweeney on 2017/11/23.
 */
public class Translate {
	public static void main(String[] args) throws IOException {
		final ANTLRInputStream input = new ANTLRInputStream(System.in);
		final ArrayInitLexer lexer = new ArrayInitLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		final ArrayInitParser parser = new ArrayInitParser(tokens);
		final ParseTree tree = parser.init();
		final ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(new ShortToUnicodeString(), tree);
		System.out.println();
	}
}

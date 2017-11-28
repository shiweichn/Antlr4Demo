package cgame;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

/**
 * Created by Sweeney on 2017/11/27.
 */
public class CGameEvalVisitorTest {
	public static void main(String[] args) throws IOException {

//		final CodePointCharStream stream = CharStreams.fromString("1+1\n 2*3\n 6-2\n 1.5*2\n ((1+1)*2+1)/(3+2)\n");
//		final CodePointCharStream stream = CharStreams.fromString("((1+1)*2+1)/(3+2)==1?2:3\n");
//		final CodePointCharStream stream = CharStreams.fromString("1==1?2:3\n");
//		final CodePointCharStream stream = CharStreams.fromString("((1+1)*2+1)/(3+2)==1?1.5*2:((1+1)*2+1)/(3+2)\n");
//		final CodePointCharStream stream = CharStreams.fromString("list()");
		final CodePointCharStream stream = CharStreams.fromString("1+list().count()*list().count()");
		final CGameLexer lexer = new CGameLexer(stream);
		final CommonTokenStream tokens = new CommonTokenStream(lexer);
		final CGameParser parser = new CGameParser(tokens);
		ParseTree tree = parser.prog();


		final FunctionUtils functionUtils = new FunctionUtils();
		final CGameEvalVisitor visitor = new CGameEvalVisitor(functionUtils);
		final Object visit = visitor.visit(tree);
		System.out.println("result:" + visit);
	}
}

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
//		final CodePointCharStream stream = CharStreams.fromString("1==1?2:3\n");
//		final CodePointCharStream stream = CharStreams.fromString("((1+1)*2+1)/(3+2)==1?1.5*2:((1+1)*2+1)/(3+2)\n");
//		final CodePointCharStream stream = CharStreams.fromString("list()");
//		final CodePointCharStream stream = CharStreams.fromString("list(2)");
//		final CodePointCharStream stream = CharStreams.fromString("1+list().count()*list().count()");
//		final CodePointCharStream stream = CharStreams.fromString("a=list().count()==4?list():9");
//		final CodePointCharStream stream = CharStreams.fromString("list().random(2)");
//		final CodePointCharStream stream = CharStreams.fromString("a=1!=1;b=2;c=3;a?b:c");
//		final CodePointCharStream stream = CharStreams.fromString("((1+1)*2+1)/(3+2)==1?2:3");
//		final CodePointCharStream stream = CharStreams.fromString("1-4");
//		final CodePointCharStream stream = CharStreams.fromString("defers()");
//		final CodePointCharStream stream = CharStreams.fromString("1==1");
//		final CodePointCharStream stream = CharStreams.fromString("-1.5");
//		final CodePointCharStream stream = CharStreams.fromString("-list().count()");
//		final CodePointCharStream stream = CharStreams.fromString("list().random(3).random(2).random(1)");
//		final CodePointCharStream stream = CharStreams.fromString("belongto(11111,list())");
//		final CodePointCharStream stream = CharStreams.fromString("testPrint()testPrint()1+1");
//		final CodePointCharStream stream = CharStreams.fromString("a=10;" +
//				"b=20;" +
//				"c=30;" +
//				"d=a*b*c;"+
//				"2*6;");
//
//		final CodePointCharStream stream = CharStreams.fromString("b=10;\n" +
//				"for(a : list()){\n" +
//				"    c=a+b;\n" +
//				"    log(c);\n" +
//				"}");


//		final CodePointCharStream stream = CharStreams.fromString("a=10;\n" +
//				"b=20;\n" +
//				"c=0;\n" +
//				"if(a<5){\n" +
//				"    t1=1;\n" +
//				"    t2=2;\n" +
//				"    b=b+t1+t2;\n" +
//				"    log(b);\n" +
//				"}else if (a>=5) {\n" +
//				"    t3=3;\n" +
//				"    t4=4;\n" +
//				"    b=b+t3+t4;\n" +
//				"    log(b);\n" +
//				"    if(b>20){\n" +
//				"        b=b*10;\n" +
//				"        a=a*10;\n" +
//				"        for(d : list()){\n" +
//				"            d=a+b;\n" +
//				"            log(d);\n" +
//				"            if(d>100){\n" +
//				"                c=c+1;\n" +
//				"            }\n" +
//				"        }\n" +
//				"    }\n" +
//				"}\n" +
//				"a+b+c");


//		final CodePointCharStream stream = CharStreams.fromString("a=1;\n" +
//				"if(a<10) {\n" +
//				"    log(a);\n" +
//				"}else if (a<20){\n" +
//				"    log(a);\n" +
//				"}else if (a<30){\n" +
//				"    log(a);\n" +
//				"}\n" +
//				"a=11;\n" +
//				"if(a<10) {\n" +
//				"    log(a*10);\n" +
//				"}else if (a<20){\n" +
//				"    log(a*10);\n" +
//				"}else if (a<30){\n" +
//				"    log(a*10);\n" +
//				"}\n" +
//				"a=21;\n" +
//				"if(a<10) {\n" +
//				"    log(a*100);\n" +
//				"}else if (a<20){\n" +
//				"    log(a*100);\n" +
//				"}else if (a<30){\n" +
//				"    log(a*100);\n" +
//				"}\n");


		final CodePointCharStream stream = CharStreams.fromString("a=-10+1;log(a);");
		final CGameLexer lexer = new CGameLexer(stream);
		final CommonTokenStream tokens = new CommonTokenStream(lexer);
		final CGameParser parser = new CGameParser(tokens);
		ParseTree tree = parser.prog();
//		final CGameEvalVisitor visitor = new CGameEvalVisitor(new TeamController());
//		final Object visit = visitor.visit(tree);
//		System.out.println(visit.toString());
	}
}

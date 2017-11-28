package cgame;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonToken;

/**
 * Created by Sweeney on 2017/11/27.
 */
public class CGameToken extends CommonToken {
	public String srcExpr;

	public CGameToken(int type, String text) {
		super(type, text);
	}
}

package arrayinit;

/**
 * Created by Sweeney on 2017/11/23.
 */
public class ShortToUnicodeString extends ArrayInitBaseListener {
	@Override
	public void enterInit(ArrayInitParser.InitContext ctx) {
		System.out.print('"');
	}

	@Override
	public void exitInit(ArrayInitParser.InitContext ctx) {
		System.out.print('"');
	}

	@Override
	public void enterValue(ArrayInitParser.ValueContext ctx) {
		final int value = Integer.parseInt(ctx.INT().getText());
		System.out.printf("\\u%04x", value);
	}
}

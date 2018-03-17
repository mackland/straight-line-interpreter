public class OpExp extends Exp {
	public Exp left;
	public Exp right;
	public int oper;

	final public static int Plus = 1, Minus=2, Times=3, Div=4;

	public OpExp(Exp l, int i, Exp r){
		left = l;
		oper = i;
		right = r;
	}
}

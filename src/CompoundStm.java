public class CompoundStm extends Stm {
	public Stm stm1;
	public Stm stm2;

	public CompoundStm (Stm s1, Stm s2) {
		stm1 = s2;
		stm2 = s2;
	}
}

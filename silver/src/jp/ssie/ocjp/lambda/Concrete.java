package jp.ssie.ocjp.lambda;

public class Concrete implements ISample {
	@Override
	public int sum(int lower,int upper) {
		int total=0;
		for (int i=lower;i<=upper;i++) {
			total+=i;
		}
		return total;
	}
}

package jp.ssie.ocjp.lambda;

public class Main_2 {
	public static void main(String[] args) {
		ISample sample=new ISample() {
		@Override
		public int sum(int lower,int upper) {
			int total=0;
			for(int i=lower;i<=upper;i++) {
				total+=i;
			}
			return total;
		}
		};
		int result=sample.sum(1, 10);
		System.out.println(l)
	}
}

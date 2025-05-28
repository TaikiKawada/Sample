package jp.ssie.ocjp;

public class Sample4_1 {
	public static void main(String[] args) {
		int[] iar= {12,2,28,427,33};
		
		for(int i=0;i<=2;i++) {
			System.out.println("iar[i]の値は"+iar[i]+"です。");
		}
		String[] sar= {"One","Two","Three"};
		
		for(int i=0;i<=2;i++) {
			System.out.println("sar[i]の値は"+sar[i]+"です。");
		}
		int len=sar.length;
		System.out.println("配列sarの要素の数は"+len+"です。");
	}
}

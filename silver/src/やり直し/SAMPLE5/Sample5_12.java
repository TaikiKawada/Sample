package やり直し.SAMPLE5;

public class Sample5_12 {
	public static void main(String[] args) {
		WorkAc w1=new WorkAc();
		System.out.println("----aに3を代入、bに１３を代入----");
		w1.met(3, 13);
		//w1.a=2;はコンパイルエラー（aはprivateなのでアクセス不可能）
		System.out.println("----bに４を代入----");
		w1.b=4;//デフォルト（記述なし）なので同一パッケージからはアクセス可能
		w1.show();
	}
}

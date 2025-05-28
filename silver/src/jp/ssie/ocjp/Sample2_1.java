package jp.ssie.ocjp;

public class Sample2_1 {
	public static void main (String [] args) {
		System.out.println("Hello!");
		test(10,20); //メソッドの呼び出し
		System.out.println(test(10,20));
	}
//メソッドの定義
/* 足した結果を返すだけ
 * @param a 整数位置
 * @param b
 * @return 足した整数値  */
	public static int test(int a,int b) {
//		System.out.println(a+b);
		return a+b;
	}
}



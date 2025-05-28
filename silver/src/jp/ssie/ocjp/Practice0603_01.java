package jp.ssie.ocjp;

public class Practice0603_01 {
	public static void main(String[] args) {
		int a = 13;
		int b = 52;
		
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println(a); // 52が表示される
		System.out.println(b); // 13が表示される
	}
}

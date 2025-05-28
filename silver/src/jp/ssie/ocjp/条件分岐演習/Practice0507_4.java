package jp.ssie.ocjp.条件分岐演習;

public class Practice0507_4 {
	public static void main(String[] args) {
		int a=20;
		if(a<=59) {
			System.out.println("不可");
		}else if(a<=69) {
			System.out.println("可");
		}else if(a<=79) {
			System.out.println("良");
		}else if(a<=100) {
			System.out.println("良");
		}else {
			System.out.println("不正な点数です");
		}
}
}

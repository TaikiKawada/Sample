package jp.ssie.ocjp.条件分岐演習;

public class Practice0507_12 {
	public static void main(String[] args) {
		int a=2002;
		if(a%400==0) {
			System.out.println("閏年です");
		}else if(a%100==0) {
			System.out.println("平年です");
		}else if(a%4==0) {
			System.out.println("閏年です");
		}else {
			System.out.println("平年です");
		}
	}
}

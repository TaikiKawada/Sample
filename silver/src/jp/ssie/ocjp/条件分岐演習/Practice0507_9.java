package jp.ssie.ocjp.条件分岐演習;

public class Practice0507_9 {
	public static void main(String[] args) {
		int a=10;
		int b=49;
		if(a==b){
			System.out.println("2つの値は同じです");
		}else if(a<b) {
			System.out.println("小さいほうの値は"+a+"です");
			System.out.println("大きいほうの値は"+b+"です");
		}else {
			System.out.println("小さいほうの値は"+b+"です");
			System.out.println("大きいほうの値は"+a+"です");
		}
	}
}
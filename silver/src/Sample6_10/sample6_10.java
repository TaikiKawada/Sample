package Sample6_10;

public class sample6_10 {
	public static void main(String[]args) {
		Car1 a1=new CarA();
		System.out.println("ライト"+a1.setLight()+"を取り付けました");
		
		System.out.println();
		
		Car b1=new CarB();
		System.out.println("ライトは"+b1.setLight()+"を取り付けました。");
	}
}

package jp.ssie.ocjp.条件分岐演習;

public class Practice0507_15 {
	public static void main(String[] args) {
		double height=170.2;
		double weight=69.3;
		
		double bmi = weight / (height * height / 10000);
		
		if(bmi<18.5) {
			System.out.println("痩せ");
		}else if(bmi<25) {
			System.out.println("普通");
		}else {
			System.out.println("肥満");
		}
	}
}

package jp.ssie.ocjp;

public class Car {
	String color;
	int number;
	double gas;
	
	public void setColor(String C) ;
	}
//コメント

	
	public void setNumber(int n) {
		number=n;
	
	
	public void setGas(double g) {
		gas=g;
	}
	public void show() {
		System.out.println("車の色は"+color+"ナンバーは["+number+"]燃料は["+gas+"]");
	}
}

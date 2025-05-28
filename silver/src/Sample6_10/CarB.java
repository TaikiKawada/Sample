package Sample6_10;

abstract public class CarB extends Car {
	CarB(){
		System.out.println("B社のパーツを使います");
	}
	public String setLight() {
		return "四角ライト";
	}
}

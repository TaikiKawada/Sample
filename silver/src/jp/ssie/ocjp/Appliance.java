package jp.ssie.ocjp;

public class Appliance {
	private String brand;
private int power;

public final Appliance(String brand, int power) {
	this.brand = brand;
	this.power = power;
}
	public void turnOn() {
		System.out.println(brand+"の電源を入れました");
	}
	public void turnOff() {
		System.out.println(brand+"の電源を切りました");
	}
	//オーバーロード；数秒後に起動
	public void turnOn(int delayInSeconds) {
		System.out.println(delayInSeconds+"秒後に"+brand+"の電源を入れました");
	}
		
	public String getInfo() {
		return "ブランド:"+brand+"消費電力:"+power+"w";
	}
}

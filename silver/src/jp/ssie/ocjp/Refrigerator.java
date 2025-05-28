package jp.ssie.ocjp;

public class Refrigerator extends Appliance {
	private int capacity;

	public Refrigerator(String brand, int power, int capacity) {
		super(brand, power);
		this.capacity = capacity;
	}
	@Override
	public String getInfo() {
		return super.getInfo()+",容量:"+capacity+"L";
	}
}

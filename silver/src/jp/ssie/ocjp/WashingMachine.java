package jp.ssie.ocjp;

public class WashingMachine extends Appliance{
	private int capacity;
	
	public WashingMachine(String brand,int power,int capacity) {
		super(brand,power);
		this.capacity=capacity;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+",洗濯容量："+capacity+"kg";
	}
}

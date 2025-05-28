package jp.ssie.ocjp;

public class Microwave extends Appliance{
	private int maxOutput;

	public Microwave(String brand,int power,int maxOutput) {
		super(brand,power);
		this.maxOutput=maxOutput;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+",最大出力"+maxOutput+"W";
	}
}

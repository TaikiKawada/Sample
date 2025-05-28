package やり直し.SAMPLE5;

public class Dog {
	static int count;
	String name;
	String kensyu;
	
	public Dog(String name, String kensyu) {
		this.name = name;
		this.kensyu = kensyu;
		count++;
	}
	String getName() {
		return name;
	}
	String getKensyu() {
		return kensyu;
	}
}

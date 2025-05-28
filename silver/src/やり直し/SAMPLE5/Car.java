package やり直し.SAMPLE5;

public class Car {
	String color;
	int number;
	double gas;
	
	public void setColor(String c) {
		color=c;
	}
	
	public void setNumber(int n) {
		number=n;
	}
	public void setGas(double d) {
		gas=d;
	}
	
	public void show() {
		System.out.println("車の色は"+color+"ナンバーは["+number+"]燃料は["+gas+"]");
	}
	}

package やり直し.SAMPLE5;

public class Car2 {
	String color;
	int num;
	double gas;
	
	public Car2(String c,int n,double g) {
		color=c;
		num=n;
		gas=g;
	}
	public void show() {
		System.out.println("車の色は"+color+"ナンバーは"+num+"燃料は"+gas);
	}
}

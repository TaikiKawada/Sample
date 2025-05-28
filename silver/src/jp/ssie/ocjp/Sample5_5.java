package jp.ssie.ocjp;

public class Sample5_5 {
	public static void main(String[]args) {
	Car car1=new Car();
	Car car2=new Car();
	Car car3=new Car();
	
	car1.setColor("red");
	car2.setColor("blue");
	car3.setColor("green");
	
	car1.setNumber(100);
	car2.setNumber(200);
	car3.setNumber(300);
		
	car1.setGas(20.5);
	car2.setGas(30.5);
	car3.setGas(40.5);
	
	car1.show();
		
	}
}

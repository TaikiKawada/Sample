package やり直し.SAMPLE5;

public class Sample5_5 {
	public static void main(String[] args) {
		//インスタンスの作成
		Car car1=new Car();
		Car car2=new Car();
		Car car3=new Car();
		
		//メソッドの呼び出し
		car1.setColor("red");//車の色
		car2.setColor("blue");
		car3.setColor("green");
		
		car1.setNumber(100);//車のナンバー
		car2.setNumber(200);
		car3.setNumber(300);
		
		car1.setGas(20.5);//車のガソリン
		car2.setGas(30.5);
		car3.setGas(40.5);
		
		car1.show();//すべて表示
		car2.show();
		car3.show();
	}
}

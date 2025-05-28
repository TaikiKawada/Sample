package やり直し.SAMPLE5;

public class Sample5_8 {
	public static void main(String[] args) {
		Car2[]cars= {new Car2("red",100,20.5),new Car2("blue",200,30.5),new Car2("green",300,40.5)
	};
		for(Car2 c:cars) {
			c.show();
		}
	}
}

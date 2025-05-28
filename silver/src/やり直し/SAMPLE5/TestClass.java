package やり直し.SAMPLE5;

public class TestClass {
	static int count=0;
	static {
		count++;
		System.out.println("count:"+count);
	}
	int num;
	public TestClass(int i){
		num=i;
	}
	void getNumber() {
		System.out.println(num);
	}
}

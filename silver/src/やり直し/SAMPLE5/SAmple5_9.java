package やり直し.SAMPLE5;

public class SAmple5_9 {
	public static void main(String[] args) {
		TestClass[]tc1= {new TestClass(10),new TestClass(20),new TestClass(30),new TestClass(40),};
		for(TestClass tc2:tc1) {
			tc2.getNumber();
		}
	}
}


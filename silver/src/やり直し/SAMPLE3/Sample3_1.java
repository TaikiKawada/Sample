package やり直し.SAMPLE3;

public class Sample3_1 {
	public static void main(String[] args) {
		int a=5;
		int b=5;
		
		System.out.println("[&]の場合");
		boolean b1=a++<5&b++<5;
		System.out.println("b1="+b1+",a="+a+",b="+b);
		
		System.out.println("[&&]の場合");
		b1=a++<5&&b++<5;
		System.out.println("b1="+b1+",a="+a+",b="+b);
	}
}

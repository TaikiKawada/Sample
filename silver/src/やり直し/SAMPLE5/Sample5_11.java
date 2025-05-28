package やり直し.SAMPLE5;

public class Sample5_11 {
	public static void main(String[] args) {
		int num=20;
		int[]array= {20,40};
		String str="20";
		RefTest obj=new RefTest();
		
		obj.metTest1(num);
		System.out.println("int型呼び出し側は"+num);
		obj.metTest2(array);
		System.out.println("配列呼び出し型は"+array[0]);//メソッドを通すとint[]arrayの20も変更される
		obj.metTest3(str);
		System.out.println("String型呼び出し型は"+str);
	}
}

package jp.ssie.ocjp;

public class Sample5_11 {
	public static void main(String[] args) {
		int num=20;
		int [] array= {20,40};
		String str="20";
		RefTest obj=new RefTest();
		
		obj.metTest1(num);
		System.out.println("int呼び出し型は"+num);
		obj.metTest2(array);
		System.out.println("配列呼び出し側は"+array);
		obj.metTest3(str);
		System.out.println("String型呼び出し側は"+str);
	}

}

package やり直し.SAMPLE2;

public class Sample2_4 {
	public static void main(String[] args) {
		//変数の宣言と代入
		int i=100;
		byte b=10;
		short s=20;
		long l=30L;
		//ここでの「L」はintやshortと同じ「30」なんだけど、long型だよって教えるために「L」をつけてる！
		float f=1.15F;//この「F」も同様
		double d=2.25;
		//double型は「D」を書かなくていいです！
		char c='A';//char型はシングルクォーテーション
		boolean bo=true;
		
		//出力
		System.out.println("int :"+i);
		System.out.println("byte :"+b);
		System.out.println("short :"+s);
		System.out.println("long :"+l);
		System.out.println("float :"+f);
		System.out.println("double :"+d);
		System.out.println("char :"+c);
		System.out.println("boolean :"+bo);
	}
}

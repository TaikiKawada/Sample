package やり直し.SAMPLE2;

public class Sample2_3 {
	public static void main(String[] args) {
		int a;//変数の宣言
		a=100;//値の代入
		int b=300;//変数の宣言と代入を一緒に
		
		System.out.println(a);
		System.out.println(b);
		
		a=200;//値の代入（更新することになる）
		System.out.println(a);
		//a=3.14;やa="abc";などの異なる型の代入は不可
		//int(現在)→double,Stringとなっているため×！！！
	}
}

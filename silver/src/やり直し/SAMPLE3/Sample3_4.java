package やり直し.SAMPLE3;

public class Sample3_4 {
	public static void main(String[] args) {
		int age=15;
		
		System.out.println("18歳未満ですか？");
		//三項演算子
		String str=age<18?"18歳未満です":"18歳以上です";
		System.out.println(str);
	}
}

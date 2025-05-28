package jp.ssie.ocjp;

public class Sample3_4 {
	public static void main(String[] args) {
		int age=15;
		String str;//変数の宣言
		
		System.out.println("18歳以上ですか？");
		if(age>=18) {
			str="18歳以上です";
		}else {
			str="18歳未満です";
		}
		System.out.println(str);//参照
	}

}

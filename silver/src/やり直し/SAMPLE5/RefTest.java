package やり直し.SAMPLE5;

public class RefTest {
	void metTest1(int num) {//変数の定義
		num+=30;//代入
		System.out.println("int定義側は"+num);
	}
	void metTest2(int[]array) {//配列の定義
		array[0]+=30;//代入
		System.out.println("配列定義側は"+array[0]);
	}
	void metTest3(String str) {
		str+=30;
		System.out.println("String型定義側は"+str);
	}
}

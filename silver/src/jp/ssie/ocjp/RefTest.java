package jp.ssie.ocjp;

public class RefTest {
	void metTest1(int num) {
		num+=30;
		System.out.println("int型定義側は"+num);
	}
	void metTest2(int[]array) {
		array[0]+=30;
		System.out.println("配列定義側は"+array[0]);
	}
	void metTest3(String str) {
		str+=30;
		System.out.println("String型定義型は"+str);
	}
}

package やり直し.SAMPLE3;

public class Sample3_5 {
	public static void main(String[] args) {
		int i=1;
		switch(i) {
		case 1:
			System.out.println("iは１です");
			
		case 2:
			System.out.println("iは２です");
			
		default://breakがないとこれも実行してしまう
			System.out.println("iは１でも２でもありません");
		}
	}
}

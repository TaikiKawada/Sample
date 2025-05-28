package やり直し.SAMPLE3;

public class Sample3＿11 {
		public static void main(String[] args) {
			for(int i=0;i<10;i++) {
				if((i%3)==0) {
					continue;
				}
				System.out.println("i= "+i);
			}
			System.out.println("for文の後の処理");
		}
}

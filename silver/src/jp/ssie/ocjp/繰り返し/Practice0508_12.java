package jp.ssie.ocjp.繰り返し;

	import java.util.Scanner;

	public class Practice0508_12 {
		public static void main(String[] args) {
			 Scanner scanner = new Scanner(System.in);
		     System.out.print("nの値を入力してください：");
		     int n = scanner.nextInt();
			
			for(int i=0;i<n;i++) {
				for(int j=i;j<n;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			scanner.close();
		}
	}

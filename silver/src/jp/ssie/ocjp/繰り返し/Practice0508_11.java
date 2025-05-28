package jp.ssie.ocjp.繰り返し;

import java.util.Scanner;

public class Practice0508_11 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("三角形の段数を入力してください: ");
		 int n = scanner.nextInt();  
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scanner.close(); 
	}
}
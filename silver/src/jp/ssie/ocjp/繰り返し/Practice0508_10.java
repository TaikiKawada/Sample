package jp.ssie.ocjp.繰り返し;

import java.util.Scanner;

public class Practice0508_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("段数を入力してください：");
	    int n = sc.nextInt(); 
	    sc.close();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

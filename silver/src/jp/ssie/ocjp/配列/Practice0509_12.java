package jp.ssie.ocjp.配列;

import java.util.Scanner;

public class Practice0509_12 {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("数値を入力してください: ");
		    int input = scanner.nextInt();
		    int sum=0;
		    for(int x=1;x<=input;x++) {
		    	sum+=x;
		    	}
		    System.out.println(sum);
		    scanner.close();
		    }
	}

package jp.ssie.ocjp.配列;

import java.util.Scanner;

public class Practice0509_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("数値を入力してください: ");
	    int input = scanner.nextInt();
	    
	    if(input==100) {
	    	System.out.println("満点です");
	    }else if(input>=60) {
	    	System.out.println("合格です");
	    }else if(input>=0) {
	    	System.out.println("不合格です");
	    }else {
	    	System.out.println("不正な値です");
	    }
	}
}

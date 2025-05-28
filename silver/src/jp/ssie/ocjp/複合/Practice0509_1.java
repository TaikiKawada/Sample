package jp.ssie.ocjp.複合;

import java.util.Scanner;

public class Practice0509_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("正の整数を入力してください: ");
        int num = scanner.nextInt();
        
        if(reverse(num)) {
        	System.out.println("回文数です。");
        }else {
        	System.out.println("回文数ではありません。");
        }
        scanner.close();
	}
	public static boolean reverse(int number) {
		int original=number;
		int reversed=0;
		
	while(number>0){
		int digit =number%10;
		reversed=reversed*10+digit;
		number /=10;
	}
	
	return original ==reversed;
	}
}

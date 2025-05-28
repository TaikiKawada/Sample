package jp.ssie.ocjp.配列;
import java.util.Scanner;

public class Practice0509_10 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("数値を入力してください: ");
	     int input = scanner.nextInt();
	     
	     if(input==1234){
	    	 System.out.println("パスワードと一致しました。");
	     }else {
	    	 System.out.println("パスワードと一致しません。");
	     }
	     scanner.close();
	}
}

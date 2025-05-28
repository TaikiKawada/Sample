package jp.ssie.ocjp.配列;
import java.util.Scanner;

public class Practice0509_11 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("数値を入力してください: ");
	     int input = scanner.nextInt();
	     for(int x=1;x<=input;x++) {
	    	 if(x%2==0) {
	    		 System.out.println(x);
	    	 }
	     }
	     scanner.close();
	}
}

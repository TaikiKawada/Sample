package jp.ssie.ocjp.繰り返し;

import java.util.Scanner;

public class Practice0508_14 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("段数を入力してください：");
	     int n = sc.nextInt(); 
	     sc.close();
	     
	     for(int i=1;i<=n;i++) {
	    	 for(int j=1;j<=i-1;j++) {
	    		 System.out.print("| ");	    		 
	    	 }
	    	 for(int j=1;j<=n-i+1;j++) {
	    		 System.out.print("* ");
	    	 }
	    	 System.out.println();
	     }
	}
}

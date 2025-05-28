package jp.ssie.ocjp.複合;

import java.util.Scanner;

public class Practice0509_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("1桁の整数をスペース区切りで入力してください：");
        
        String line=scanner.nextLine();
        String[] tokens=line.trim().split("\\s+");
        //trim()は文字列の前後にある空白を取り除く。
        //split()は文字列を指定した区切り文字で分割
        //\\3+は「空白文字を一回以上繰り返す部分」
        
        int[]number=new int[tokens.length];
        for(int i=0;i<tokens.length;i++) {
        	number[i]=Integer.parseInt(tokens[i]);
        	//Integer.parseInt(String s) は、文字列を整数（int型）に変換する
        }
        int maxcount=1;
        int currentcount=1;
        
        for(int i=1;i<number.length;i++) {
        	if(number[i]==number[i-1]) {
        		currentcount++;
        		maxcount=Math.max(maxcount,currentcount);
        		//Math.max(a.b)はaかbの大きいほうを返す
        	}else {
        		currentcount=1;
        	}
        }
        System.out.println("最大連続回数"+maxcount);
        
        scanner.close();
	}
}

package jp.ssie.ocjp;

import java.util.ArrayList;

public class Sample4_3 {
	public static void main(String[] args) {
		ArrayList<String>array=new ArrayList<>(3);
		
		array.add("田中");
		array.add("鈴木");
		array.add("高橋");
		
		for(String s:array) {
			System.out.println(s);
		}
		
	}
}

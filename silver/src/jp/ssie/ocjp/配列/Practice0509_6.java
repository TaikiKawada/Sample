package jp.ssie.ocjp.配列;

import java.util.ArrayList;

public class Practice0509_6 {
	public static void main(String[] args) {
		ArrayList<Integer>numbers=new ArrayList<>();
		
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		
		for(Integer num:numbers) {
			System.out.println(num);
		}
		
		numbers.set(0,400);
		
		for(Integer num:numbers) {
			System.out.println(num);
		}
		
		int sum=0;
		
		for(Integer number:numbers) {
			sum+=number;
		}
		System.out.println(sum);
	}
}

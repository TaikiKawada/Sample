package jp.ssie.ocjp.配列;

import java.util.ArrayList;

public class Practice0509_7 {
	public static void main(String[] args) {
		ArrayList<String>fruit=new ArrayList<>();
		
		fruit.add("りんご");
		fruit.add("みかん");
		fruit.add("ばなな");
		
		for(String item:fruit) {
			System.out.println(item);
		}
		
		ArrayList<Integer>numbers=new ArrayList<>();
		
		numbers.add(120);
		numbers.add(150);
		numbers.add(90);
		
		for(Integer number:numbers) {
			System.out.println(number);
		}
		
		for(int i=0;i<fruit.size();i++) {
			System.out.println(fruit.get(i)+"=>"+numbers.get(i)+"円");
		}
		
	}
}

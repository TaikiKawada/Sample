package jp.ssie.ocjp.配列;

import java.util.ArrayList;

public class Practice0509_8 {
	public static void main(String[] args) {
		ArrayList<Integer>l1=new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		ArrayList<Integer>l2=new ArrayList<>();
		l2.add(11);
		l2.add(22);
		l2.add(33);
		
		ArrayList<ArrayList<Integer>>list=new ArrayList<>();
		list.add(l1);
		list.add(l2);
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
	
		for(ArrayList<Integer>innerList:list) {
			for(Integer num:innerList) {
				if(num>max) {
					max=num;
				}
				if(num<min) {
					min=num;
				}
			}
		}
		System.out.println("最大値"+max);
		System.out.println("最小値"+min);
	}
}

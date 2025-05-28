package やり直し.SAMPLE４;

import java.util.ArrayList;

public class Sample4_5 {
	public static void main(String[] args) {
		ArrayList<String>myList=new ArrayList<>();
		String st1="ready";
		String st2="set";
		String st3="go";
		//Integer i=123;
		myList.add(st1);
		myList.add(st2);
		myList.add(st3);
		
		//拡張for文
		for(String st:myList) {
			System.out.println(st);
		}
	}
}

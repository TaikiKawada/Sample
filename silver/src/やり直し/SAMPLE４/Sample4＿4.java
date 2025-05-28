package やり直し.SAMPLE４;

import java.util.ArrayList;

public class Sample4＿4 {
	public static void main(String[] args) {
		ArrayList<Integer>num=new ArrayList<>();//初期値
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		
		for(int i=0;i<num.size();i++) {//numの要素数まで
			System.out.println(num.get(i));//numのi番目の要素を取り出して出力
		}
		
	}
}

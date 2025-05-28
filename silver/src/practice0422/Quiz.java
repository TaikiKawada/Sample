package practice0422;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
	private ArrayList<Word>wordList=new ArrayList<>();

	public Quiz() {
		wordList.add(new Word("1月","January"));
		wordList.add(new Word("2月","February"));
		wordList.add(new Word("3月","March"));
		wordList.add(new Word("4月","April"));
		wordList.add(new Word("5月","May"));
		wordList.add(new Word("6月","June"));
		wordList.add(new Word("7月","July"));
		wordList.add(new Word("8月","August"));
		wordList.add(new Word("9月","September"));
		wordList.add(new Word("10月","October"));
		wordList.add(new Word("11月","November"));
		wordList.add(new Word("12月","December"));
	}
	
	public void start() {
		Scanner scanner = new Scanner(System.in);
		int correct=0;//正解数
		int incorrect=0;//不正解数
		
		int number=1;
		for(Word s:wordList) {
			System.out.println("問題"+number+"「"+s.getJa()+"」:");
			String input= scanner.nextLine();
			
			if(s.check(input)) {
				System.out.println("正解!!!");
				correct++;
			}else {
				System.out.println("不正解!!!");
				incorrect++;
			}
			number++;//現在の問題数
		}
		System.out.println("==============================");
		System.out.println("正解数:"+correct+"不正解数:"+incorrect);
		//scanner.close();
	}
}

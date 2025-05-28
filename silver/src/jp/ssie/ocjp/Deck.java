package jp.ssie.ocjp;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards;//トランプカードのリスト//priviteにしない→書き換えられる可能性

	//コンストラクタ：５２枚のカード（４マークｘ１３枚）を生成してcardsに追加
	public Deck() {
	 cards=new ArrayList<>();//空のArrayListを作成
	 //トランプカードのマーク
	 char[]marks= {'♠', '♥', '♦', '♣'};
	 
	 //各マークについて、１～１３までの数字を生成
	 for(char mark:marks) {
		 for(int number=1;number<=13;number++) {
			 cards.add(new Card(mark,number));
		 }
	 }		
}
	//指定した枚数のカード情報を表示
	public void get(int count) {
		for(int i=0;i<count && i<cards.size();i++) {
			cards.get(i).show();//i番目のカード情報を表示
		}
	}
	//カードをシャッフル
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	
}

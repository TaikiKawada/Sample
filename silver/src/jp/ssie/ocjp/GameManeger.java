package jp.ssie.ocjp;

//GameManegerの定義(mainメソッドを持つ)
public class GameManeger {
	public static void main(String[] args) {
		//Cardクラスのインスタンスを生成
		Card card=new Card('♥',1);
		//showメソッドを呼び出してカード情報を表示
		card.show();
}
}

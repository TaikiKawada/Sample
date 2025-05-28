package jp.ssie.ocjp;

//トランプ1枚を表すクラス
public class Card {
	char mark;//変数の定義
	int number;//変数の定義

	
	//コンストラクタ：マークと数字を引数として受け取り、フィールドに設定
	public Card(char mark,int number) {
		this.mark=mark;//引数markを、このインスタンスのmarkフィールド（this.mark）に代入
		
	}
	
	
	public void show() {
		System.out.println(mark+":"+number);
	}

	
}

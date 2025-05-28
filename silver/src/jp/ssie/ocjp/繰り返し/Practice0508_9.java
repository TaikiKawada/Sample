package jp.ssie.ocjp.繰り返し;

public class Practice0508_9 {
	public static void main(String[] args) {
		for(int i=2000;i<=2030;i++) {
			switch(i){
			case 2000:
				System.out.println("シドニー");
			break;
			case 2004:
				System.out.println("アテネ");
			break;
			case 2008:
				System.out.println("北京");
			break;
			case 2012:
				System.out.println("ロンドン");
			break;
			case 2016:
				System.out.println("リオデジャネイロ");
			break;
			case 2021:
				System.out.println("東京");
			break;
			case 2024:
				System.out.println("パリ");
			break;
			case 2028:
				System.out.println("ロサンゼルス");
			break;
			default:
				System.out.println(i);
			}
		}
	}

}

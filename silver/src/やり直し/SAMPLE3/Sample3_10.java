package やり直し.SAMPLE3;

public class Sample3_10 {
	public static void main(String[] args) {
		for(int i=0;;i++){//終わる条件がないのでこのままだと無限ループ 
			if(i==3) {
				break;//強制的に抜ける
			}
			System.out.println("i= "+i);
		}
		System.out.println("for文後の処理");
	}
}

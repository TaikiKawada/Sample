package やり直し.SAMPLE3;

public class Sample3_12 {
	public static void main(String[] args) {
		label1:for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(i*j>20) {
					break label1;//label1(iのループ）を終了
				}
				if(i==1) {
					break;//jのループ（1番近い繰り返し処理）を抜け出してiのループが始まる
				}if(j%2==1) {
					continue;//↓の処理をスキップしてｊの次のループが始まる
				}
				System.out.println(i*j);
			}
		}
	}
}

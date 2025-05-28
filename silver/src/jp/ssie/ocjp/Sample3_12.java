package jp.ssie.ocjp;

public class Sample3_12 {
	public static void main(String[] args) {
		label1:for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(i*j>20) {
					break label1;
				}
				if(i==1) {
					break;
				}
				if(j%2==1) {
					continue;
				}
				System.out.println(i*j);
			}
		}
	}
}

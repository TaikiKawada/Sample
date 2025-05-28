package jp.ssie.ocjp.繰り返し;

public class Practice0508_15 {
	public static void main(String[] args) {
		System.out.println("日月火水木金土");
		int day=1;
		int lastday=30;
		int startday=4;
		for(int i=0;i<startday;i++) {
			System.out.print("| ");
		}
		for(int i=startday;day<=lastday;i++) {
			if(day<10) {
			System.out.print(day + " ");
			}else {
			System.out.print(day);
			}
			if(i%7==6) {
				System.out.println();
			}
			day++;
		}
		System.out.println();
	}

}

package jp.ssie.ocjp;

import java.util.Scanner;

public class TicketVendingMachine {
	private static int manageId=1;
	
	//Suicaの発行
	public static Suica publish(int type) {
		int id=manageId;
		manageId++;//発行後に+1
		
		if(type==0) {
			return new Suica(id,1000);
		}else if(type==1) {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("姓：");
			 String last=sc.nextLine();
			 System.out.println("名:");
			 String first=sc.nextLine();
			 System.out.println("年齢：");
			 int age=Integer.parseInt(sc.nextLine());
			 System.out.println("電話番号:");
			 String tel=sc.nextLine();
			 return new Suica(id,1000,last,first,age,tel);
		}else {
			System.out.println("無効です");
			return null;
		}
	}
	
		public static void getInfo(Suica s) {
			if(s!=null) {
				System.out.println("残高："+s.getRemain()+"円");
			}else {
				System.out.println("Suica情報が存在しません");
			}		
	}
}

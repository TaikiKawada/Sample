package jp.ssie.ocjp;

public class Sample6_4 {
	public static void main(String[]args) {
		Staff0v s1=new Staff0v();
		System.out.println("-------スーパークラス--------");
		System.out.println("名前："+s1.getName());
		
		System.out.println();
		Manager0v m1=new Manager0v();
		
		System.out.println("-------サブクラス-------");
		m1.setName("田中");
		System.out.println("名前；"+m1.getName());
		System.out.println("給与"+m1.getSalary());
	}
}

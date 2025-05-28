package やり直し.SAMPLE5;

public class Sample5_3 {
	public static void main(String[] args) {
		//佐藤さんオブジェクトをインスタンス化しメソッドを呼び出し名前を記入
		Teacher s1=new Teacher();
		s1.setName("佐藤さん");
		
		//田中さんオブジェクトをインスタンス化しメソッドを呼び出し名前を記入
		Teacher s2=new Teacher();
		s2.setName("田中さん");
		
		//名前を表示
		System.out.println("名前："+s1.getName());
		System.out.println("名前:"+s2.getName());
	}
}

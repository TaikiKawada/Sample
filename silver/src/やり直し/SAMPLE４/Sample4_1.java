package やり直し.SAMPLE４;

public class Sample4_1 {
	public static void main(String[] args) {
		int[]iar=new int[5];//配列の宣言
		
		iar[0]=12;//配列の初期化
		iar[1]=3;//異なるデータ型の挿入はコンパイルエラーになる
		iar[2]=28;//例えば、iar[2]=2.25
		iar[3]=427;//確保した領域外への代入は、実行時エラーになる
		iar[4]=33;//例えば、iar[5]=15
				
		System.out.println("iar[0]の値は"+iar[0]+"です");
		System.out.println("iar[1]の値は"+iar[1]+"です");
		System.out.println("iar[2]の値は"+iar[2]+"です");
		
	String[]sar= {"One","Two","Three"};
	
		System.out.println("iar[0]の値は"+iar[0]+"です");
		System.out.println("iar[1]の値は"+iar[1]+"です");
		System.out.println("iar[2]の値は"+iar[2]+"です");
		
		int len=sar.length;
		System.out.println(len);
	}
}

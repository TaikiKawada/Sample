package やり直し.SAMPLE2;

public class Sample2_10 {
	public static void main(String[] args) {
		String str="きつね";
		
		System.out.println(str.charAt(0));//strの（）文字目の文字を返す//0スタート
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		
		System.out.println(str.indexOf("つ"));//（）が最初に出現する位置を返す
		System.out.println("何文字？>>>>>>"+str.length());//文字数を返す
		System.out.println(str.toString());//strが参照している文字
	}
}

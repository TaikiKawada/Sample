package jp.ssie.ocjp;

public class Sample2_11 {
	public static void main(String[] args) {
		StringBuilder sb =new StringBuilder();
		//文字追加
		System.out.println(sb.append("きつね"));
		//位置を指定して文字追加
		System.out.println(sb.insert(0, "きた"));
		//逆に並び替える
		System.out.println(sb.reverse());
		//4文字以上５文字目未満の文字を削除
		System.out.println(sb.delete(3,5));	
		System.out.println(sb.replace(1, 2, "ま"));	
		System.out.println(sb.substring(0,2));	
		System.out.println(sb.substring(0));		
	}
}

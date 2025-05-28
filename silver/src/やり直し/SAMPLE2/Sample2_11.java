package やり直し.SAMPLE2;

public class Sample2_11 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		
		System.out.println(sb.append("きつね"));
		//文字を追加
		System.out.println(sb.insert(0,"きた"));
		//０番目に「きた」を挿入
		System.out.println(sb.reverse());
		//逆に並び替える
		System.out.println(sb.delete(3,5));
		//スタート位置からエンド位置の1つ前まで削除
		System.out.println(sb.replace(1, 2, "ま"));
		//2文字目以上3文字目未満を間の文字を”ま”に変換する
		System.out.println(sb.substring(0,2));
		//0文字以上2文字未満の文字を取り出す
		System.out.println(sb.substring(0));
		//0番目の文字から取り出す
	}
}

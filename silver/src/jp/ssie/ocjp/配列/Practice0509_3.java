package jp.ssie.ocjp.配列;

public class Practice0509_3 {
	public static void main(String[] args) {
		String[]array= {"りんご","みかん","ばなな"};
		
		for(String s:array) {
			if(s.equals("りんご")) {
				System.out.println("りんご（apple）");
			}else if(s.equals("みかん")){
				System.out.println("みかん（orange）");
			}else if(s.equals("ばなな")){
				System.out.println("ばなな（banana）");
			}
				
		}
	}
}

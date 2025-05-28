package jp.ssie.ocjp.配列;

public class Sample5_2 {
	public static void main(String[] args) {
		
		//ArrayList<Dog>Dogs=new ArrayList<>();
		//Dogs.add(new Dog("メロン","柴犬"));
		//Dogs.add(new Dog("ポチ","ミニチュアダックス"));
		//Dogs.add(new Dog("まさお","ラブラドール・レトリバー"));
		
		//Dog dog1=new Dog("メロン","柴犬");
		//Dog dog2=new Dog("ポチ","ミニチュアダックス");
		//Dog dog3=new Dog("まさお","ラブラドール・レトリバー");
		
		//配列
		Dog[]Dogs= {
				new Dog("メロン","柴犬"),
				new Dog("ポチ","ミニチュアダックス"),
				new Dog("まさお","ラブラドール・レトリバー")
		};
		
		for(Dog dog:Dogs) {
			//System.out.println("名前は"+dog.getName()+"で、犬種は"+dog.getKensyu()+"です");
			dog.showInfo();
		}
		
		
		//System.out.println("名前は"+dog1.getName()+"で、犬種は"+dog1.getKensyu()+"です。");
		//System.out.println("名前は"+dog2.getName()+"で、犬種は"+dog2.getKensyu()+"です。");
		//System.out.println("名前は"+dog3.getName()+"で、犬種は"+dog3.getKensyu()+"です。");
		
		System.out.println("数:"+Dog.count+"匹です。");
	}
}

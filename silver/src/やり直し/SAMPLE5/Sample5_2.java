package やり直し.SAMPLE5;

public class Sample5_2 {
	public static void main(String[] args) {
		
		Dog dog1=new Dog("メロン","柴犬");
		Dog dog2=new Dog("ポチ","ミニチュアダックス");
		Dog dog3=new Dog("まさお","ラブラドールレトリバー");
		
		System.out.println("名前は"+dog1.getName()+"で、犬種は"+dog1.getKensyu());
		System.out.println("名前は"+dog2.getName()+"で、犬種は"+dog2.getKensyu());
		System.out.println("名前は"+dog3.getName()+"で、犬種は"+dog3.getKensyu());
		
		//static変数はインスタンス化しなくてもよい
		System.out.println("数："+Dog.count+"匹です。");
	}
}

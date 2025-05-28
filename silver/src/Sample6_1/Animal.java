package Sample6_1;

public class Animal {
	private String voice;
	private String name;
	
	public Animal() {
		System.out.println("動物を登録しました。");
	}
	public void setAnimal(String n,String v) {
		name=n;
		voice=v;
	}
	public void showAnimal() {
		System.out.println("名前は"+name+"で"+voice+"と鳴きます。");
	}
}

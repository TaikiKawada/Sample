package jp.ssie.ocjp.配列;

public class Dog {
	static int count;
	String name;
	String kensyu;
	
	public Dog(String n,String k) {
		name=n;
		kensyu=k;
		count++;
	}
	String getName() {
		return name;
	}
	String getKensyu() {
		return kensyu;
	}
	
	void showInfo(){
		System.out.println("名前は"+name+"で、犬種は"+kensyu+"です");}
	}

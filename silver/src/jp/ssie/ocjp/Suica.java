package jp.ssie.ocjp;

public class Suica {
	//プロパティ
	private int id;
	private int remain;
	private String last;
	private String first;
	private int age;
	private String tel;

	//コンストラクタ
	public Suica(int id, int remain, String last, String first, int age, String tel) {
		this.id = id;
		this.remain = remain;
		this.last = last;
		this.first = first;
		this.age = age;
		this.tel = tel;
	}
	
	public int getId()	{
		return id;
	}
	public int getRemain(){		
		return remain;
	}
	
	public String fullName(){
		return last+" "+first;
	}
	
	public int getAge(){	
		return age;
	}
	public String getTel(){
		return tel;
	}
}

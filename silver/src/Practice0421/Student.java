package Practice0421;

public class Student {
	String name;
	int kokugo;
	int sugaku;
	int eigo;
	static int count=0;
	/**
	 * @param name
	 * @param kokugo
	 * @param sugaku
	 * @param eigo
	 */
	public Student(String name, int kokugo, int sugaku, int eigo) {
		this.name = name;
		this.kokugo = kokugo;
		this.sugaku = sugaku;
		this.eigo = eigo;
		count++;
	}
	public void show() {
		System.out.println("名前:"+name+"国語:"+kokugo+"点"+"数学:"+sugaku+"点"+"英語"+eigo+"点");
		
	}
	public int all() {
		return kokugo+sugaku+eigo;
	}
	public int bunkei(){
		return kokugo+eigo;
	}
	public int rikei(){
		return sugaku+eigo;
	}
	
}

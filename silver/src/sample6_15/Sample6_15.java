package sample6_15;

public class Sample6_15 {
	public static void main(String[] args) {
		subject s1=new Blueschool();
		s1.japanese();
		s1.history();
		
		BlueSchool bs1=(BlueSchool)s1;
		bs1.ensoku();
	}
}

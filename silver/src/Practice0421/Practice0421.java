package Practice0421;

import java.util.ArrayList;

public class Practice0421 {
	public static void main(String[] args) {
		Student s1=new Student("森下",60,60,60);
		Student s2=new Student("田中",50,40,20);
		Student s3=new Student("佐藤",40,50,20);
		
		ArrayList<Student>students=new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		for(Student s:students) {
			s.show();
		}
		
		//国語＋英語のトップを探す
		Student bunkeiTop=students.get(0);
		for(Student s:students) {
			if(s.bunkei()>bunkeiTop.bunkei()) {
				bunkeiTop=s;
			}
		}
		
		//数学+英語のトップを探す
		Student rikeiTop=students.get(0);
		for(Student s:students) {
			if(s.rikei()>rikeiTop.rikei()) {
				rikeiTop=s;
			}
		}
		
		//各科目の平均点を表示
		int totaljp=0,totalmath=0,totalen=0;
		for(Student s:students) {
			totaljp+=s.kokugo;
			totalmath+=s.sugaku;
			totalen+=s.eigo;
		}
		int count=students.size();
		
		System.out.println("平均点＝"+"国語:"+(totaljp/count)+"数学:"+(totalmath/count)+"英語:"+(totalen/count));
		}
		
		
		
	}
}

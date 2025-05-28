package jp.ssie.ocjp;

public class Sample7_4 
	public static void main(String[] args) {
		double x=15.0;
		double y=0.0;
		try {
			Sample7_4 obj=new Sample7_4();
			double z=obj.doubleDivide(x,y);
			System.out.println("x/y:"+z);
		}catch(Exception ae) {
			System.out.println("-------発生した例外--------");
			System.out.println(ae);
		}
		System.out.println("x-y:"+(x-y));
	}
	static double doubleDivide(double x,double y) throws IOException {
		if(y==0.0) {
			throw new IOException(
					"数字は０では割れません。");
			
		}else {
			return x/y;
		}
	}
}

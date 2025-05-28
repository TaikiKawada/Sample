package jp.ssie.ocjp.lambda;

public class Main_1 {
	public static void main(String[] args) {
		ISample sample=new Concrete();
		int result=sample.sum(1, 10);
		System.out.println("Main_1の結果"+result);
	}
}

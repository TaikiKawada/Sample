package jp.ssie.ocjp.配列;

public class Practice0509_2 {
	public static void main(String[] args) {
		int[]array= {7,3,1,9,1};
		
		int sum=0;
		int max=array[0];
		int min=array[0];
		
		for(int num:array){
			sum+=num;
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}	
		}
		double average=(double)sum/array.length;
		
		System.out.println(sum);
		System.out.println(max);
		System.out.println(min);
		System.out.println(average);
	}
}

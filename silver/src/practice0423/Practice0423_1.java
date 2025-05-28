package practice0423;

public class Practice0423_1 {
	public class Fukusyu{
		int rensyu() {
			int sum=0;
			for(int number=1;number<=10;number++) {
				sum+=number;
			}
			return sum;
		}
		int rensyu2(int max) {
			int sum=0;
			for(int number=1;number<=max;number++) {
				sum+=number;
			}
			return sum;
		}
		
		void rensyu3(int baisu) {
			for(int number=1;number<=100;number++) {
				if(number%baisu==0);
				System.out.print(number+" ");
			}
		}
		
	}
}

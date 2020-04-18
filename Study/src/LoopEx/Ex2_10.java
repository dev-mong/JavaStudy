package LoopEx;


public class Ex2_10 {

	public static void main(String[] args) {
//		12345의 각 자리 수 합

		int num = 12345;
		int sum = 0;
		
		int value;
		
		for(int i=10000;i>=1;i/=10) {
			value = (num/i) % 10;
			sum +=value;
		}
		System.out.println("Sum: "+ sum);
		
	}

}

package Operator;

public class Calculate2 {

	public static void main(String[] args) {

		//3+6,3+6+9,3+6+9+12 연산 결과 
		int num, sum;
		sum = 0;
		num = 3;

		for (int x = 2; x < 5; x++) {

			sum = num + x * 3;
			num = sum;
		}
		System.out.println(sum);
		
		// 다른 풀이
		int a=3+6;
		int b=a+9;
		int c=b+12;
		System.out.println("연산 결과 : "+c);

	}

}

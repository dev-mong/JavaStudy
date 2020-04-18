package Operator;

public class Calulate2 {

	public static void main(String[] args) {

		int num, sum;
		sum = 0;
		num = 3;

		for (int x = 2; x < 5; x++) {

			sum = num + x * 3;
			System.out.println(sum);
			num = sum;
		}

	}

}

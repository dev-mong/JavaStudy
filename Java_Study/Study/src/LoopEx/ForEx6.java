package LoopEx;

public class ForEx6 {

	public static void main(String[] args) {

		int A, B;
		int num1, num2;
		int result = 0;

		for (int i = 1; i < 9; i++) {
			A = i;
			B = 9 - A;
			num1 = A * 10 + B;
			num2 = B * 10 + A;
			result = num1 + num2;

			if (result == 99) {
				System.out.println("A 값 : " + A + " B 값 : " + B);

			}

		}

	}

}

package algorithm;

public class ForEx {

	public static void main(String[] args) {
		int num = 12345;

		int sum = 0;

		int value;

		for (int i = 10000; i >= 1; i /= 10) {

			value = (num / i) % 10;

			sum += value;

		}
		System.out.println("Sum: " + sum);

	}

}

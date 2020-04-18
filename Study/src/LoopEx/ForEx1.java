package LoopEx;

public class ForEx1 {

	public static void main(String[] args) {

		int result = 1;

		for (int i = 1; i <= 10; i++) {
			result *= i;
		}
		System.out.println("1부터 10까지의 곱 : " + result);
	}

}

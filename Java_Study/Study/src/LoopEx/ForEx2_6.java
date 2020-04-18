package LoopEx;

public class ForEx2_6 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				sum = i + j;
				if (sum == 6) {
					System.out.println("dic1 : " + i + " dic2 : " + j);
				}
			}
		}

	}

}

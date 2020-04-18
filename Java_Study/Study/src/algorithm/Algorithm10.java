package algorithm;

import java.util.Random;

public class Algorithm10 {

	public static void main(String[] args) {
//	1,-2,3,-4 ... -100 합 구하기

		int[] num = new int[101];
		int result, sum = 0, totla = 0;

		for (int i = 1; i < num.length; i++) {
			num[i] = i;

			result = num[i] % 2;
			if (result == 0) {
				sum += num[i] * -1;
			} else {
				sum += num[i];
			}
		}
		System.out.println(sum);
		

	}

}

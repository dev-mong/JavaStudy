package LoopEx;

public class ForEx2_4 {

	public static void main(String[] args) {
//		1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 
//		몇까지 더해야 총합이 100이상이되는지 구하시오.

		int num = 1;
		int sum = 0;

		while (true) {

			if (num % 2 == 0) {
				sum += num * -1;

			}
			if (sum >= 100) {
				System.out.println("더한 값 : " + num);
				System.out.println("총 합: " + sum);
				break;
			}
			sum += num;
			num++;
		}
	}

}

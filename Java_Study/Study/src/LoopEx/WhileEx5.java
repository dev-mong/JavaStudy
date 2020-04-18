package LoopEx;

public class WhileEx5 {

	public static void main(String[] args) {
//		자연수 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해 나간다. 
//		그리고 그 합이 언제 (몇을 더했을 때) 1000이 넘어서는지, 
//		그리고 1000이 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성.
//		무한 루프 이용

		int i = 1;
		int sum = 0;
		while (true) {

			if (i % 2 != 0) {
				sum += i;
			} else if (i % 3 == 0) {
				System.out.println(i);
				sum += i;
			}
			if (sum > 1000) {
				System.out.println("마지막으로 더한 수: " + i);
				System.out.println("합 :" + sum);
				break;
			}
			i++;
		}

	}

}

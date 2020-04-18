package algorithm;

public class Algorithm5 {

	public static void main(String[] args) {
//		세 수중 큰수 찾기  

//		int num1, num2, num3, max;
//
//		num1 = 10;
//		num2 = 20;
//		num3 = 30;
//
//		boolean b = num1 > num2;
//
//		if (b == true) {
//			max = num1;
//			if (max > num3) {
//				System.out.println(max);
//			} else {
//				System.out.println(num3);
//			}
//		} else {
//			max = num2;
//			if (max > num3) {
//				System.out.println(max);
//			} else {
//				System.out.println(num3);
//			}
//		}

//		for문 사용
		int num[] = { 10, 20, 30 };
		int max = 0;

		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println(max);

	}

}

package algorithm;

public class Ex2_15 {

	public static void main(String[] args) {
//		회문수 프로그램

		int number = 12321;
		int tmp = number;
		int result = 0; // 변수를 거꾸로 변환해서 담을 변수

		while(tmp != 0) {
			
			int j = 1;
			for (int i = 10000; i >= 1; i /= 10) {
				tmp = number / i % 10 * j;
				j = j*10;
				result +=tmp;
			}
			System.out.println(result);
			break;
		}	
		
		if (number == result) {
			System.out.println(number + "는 회문수 입니다.");
		} else {
			System.out.println(number + "는 회문수가 아닙니다.");
		}
	}

}

package algorithm;


public class Ex2_9 {

	public static void main(String[] args) {
//		문자열이"12345"라면, ‘1+2+3+4+5’의 결과인 15

		String str = "12345";
		int sum = 0;
		int num;
		
		for(int i=0;i<str.length();i++) {
			num= str.charAt(i); // char 문자의 숫자 아스키 코드 값
			sum += num - 48;
		}System.out.println(sum);
		
	}

}

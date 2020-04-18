package Operator;

public class Calculate4 {

	public static void main(String[] args) {
		int x = 2;

		int y = 5;

		char c = 'A'; // 'A'의문자코드는 65

		System.out.println(y+= 10 - x++); //y+10 - x++
		
		System.out.println(x+=2); // x = x+2

		System.out.println(!('A' <= c && c <='Z')); // 대문자 유니코드 사이 일 때 false

		System.out.println('C'-c); // 'C' - 'A'

		System.out.println('5'-'0'); // '5' - '0'

		System.out.println(c+1); // 65 +1

		System.out.println(++c); // 증감 연산자는 char형 유지, 출력 전 증가

		System.out.println(c++); // 출력 후 증가 

		System.out.println(c); 
		
	}

}

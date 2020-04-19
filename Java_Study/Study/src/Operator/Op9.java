package Operator;

public class Op9 {

	public static void main(String[] args) {
	
//		문자형 변수ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만
//		변수b의 값이true가 되도록 하는 코드이다.
		
		char ch = '1';
		boolean b = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <='z') || (ch >= '0' && ch <= '9');
		
		System.out.println(b);

	}

}

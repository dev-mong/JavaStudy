package Operator;

public class Op4 {

	public static void main(String[] args) {
	
//		변수num의 값에 따라 ‘양수’,‘음수’,‘0’을 출력하는 코드
//		삼항연산자 사용
		
		int num = 10;
		
		//System.out.println((num == 0) ? "0" : (num > 0) ? "참" : "거짓");
		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));
		
	}

}

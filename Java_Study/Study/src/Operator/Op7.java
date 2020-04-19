package Operator;

public class Op7 {

	public static void main(String[] args) {
	
//		화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
//		변환공식이 'C =5/9 ×(F - 32)'라고 할 때,(1)에 알맞은 코드를 넣으시오.
//		단, 변환 결과값은 소수점셋째 자리에서 반올림해야 한다.
		
		int fahrenheit = 100;
		
		// 결과 값 반올림 수 구하기 
		float celcius =  (int)((5 / 9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;
		
		System.out.println("Fahrenheit" + fahrenheit);
		System.out.println("Celcius" + celcius);
		
		
	}

}

package ifEx;

public class IfEx1 {

	public static void main(String[] args) {
		int num = 120;
		
		//짝수 중 양수 인 값 , 둘다 참일 때 출력 
		if(num>0 && (num % 2) == 0) {
			System.out.println("양수이면서 짝수");
		}

	}

}

package method;

public class CaculateMain {
	
	static int result = 0;

	public static void main(String[] args) {
		
		System.out.println("두 수의 합: "+sum(20,10));
		System.out.println("두 수의 차: "+sub(20, 10));
		System.out.println("두 수의 곱: "+mul(20, 10));
		System.out.println("두 수의 몫: "+div(20, 10));
		System.out.println("두를 나눈 나머지: "+remain(20, 10));

	}
	

	static int sum(int num1,int num2) {
		result = num1 + num2;
		return result;
	}

	static int sub(int num1,int num2) {
		if (num1 > num2) {
			result = num1 - num2;
		} else {
			result = num2 - num1;
		}
		return result;
	}

	static int mul(int num1,int num2) {
		result = num1 * num2;
		return result;
	}

	static int div(int num1,int num2) {
		if(num1<num2) {
			System.out.println("다른 수를 입력하세요");
		}
		result = num1 / num2;
		return result;
	}

	static int remain(int num1,int num2){
		result = num1 % num2;
		return result;
	}

}

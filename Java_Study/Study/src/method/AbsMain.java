package method;

public class AbsMain {
	
	public static void main(String args[]) {
		

		System.out.println("두 수의 절대값 : " + result(10));

		System.out.println("두 수의 절대값 : " + result(-2));
		
	}
	
	static int result(int num) {
		int result = Math.abs(num);
		return result;	
	}
	
}

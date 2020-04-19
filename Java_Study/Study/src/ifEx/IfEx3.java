package ifEx;

public class IfEx3 {

	public static void main(String[] args) {

		int num1 = 50, num2 = 100;
		int big, diff;

		if (num1 > num2) {
			big = num1;
			System.out.println(big);		
			diff = num1 - num2;
			System.out.println(diff);
		} else {
			diff = num2 - num1;
			System.out.println(diff);
		}
		
		
	}

}

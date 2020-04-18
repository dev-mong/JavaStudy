package method;

public class PrimeNum {


	public static void main(String[] args) {

		System.out.println("1이상 100이하의 소수");
		for (int i = 1; i <= 100; i++) {
			if (prime(i) == true) {
				System.out.print(i + " ");
			} 
		} 
	}

	static boolean prime(int i) {
		int count = 0;
		boolean b = true;
		for (int j = 1; j <= i; j++) {
			if (i % j == 0) {
				count++;
			}
		}
		if (count == 2) {
			b = true;
		} else if (count > 0) {
			b = false;
		}
		return b;

	}
}

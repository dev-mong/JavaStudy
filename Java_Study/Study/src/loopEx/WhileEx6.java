package loopEx;

public class WhileEx6 {

	public static void main(String[] args) {
		//* 출력 

		int i = 0;
		while (true) {

			if (i >= 10) {
				break;
			} else {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			i++;
		}

	}

}

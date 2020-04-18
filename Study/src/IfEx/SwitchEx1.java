package IfEx;

public class SwitchEx1 {

	public static void main(String[] args) {

		int num = 100;
		int x = 0;
		if (num < 0) {
			System.out.println("0미만");
		} else {
			if (num >= 300) {
				x = 1;
			} else if (num >= 200) {
				x = 2;

			} else if (num >= 100) {
				x = 3;

			} else if (num >= 0) {
				x = 4;

			}
		}

		switch (x) {
		case 1:
			System.out.println("300이상");
			break;
		case 2:
			System.out.println("200이상 300미만");
			break;
		case 3:
			System.out.println("100이상 200미만");
			break;
		case 4:
			System.out.println("0이상 100미만");
			break;
		}

	}

}

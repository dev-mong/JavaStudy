package ifEx;

public class IfEx6 {

	public static void main(String[] args) {

		int x = 15;
		if ((10 < x) && (x < 20)) {
			System.out.println("ture");
		}

		char ch = '1';
		if (!(ch == '\t' || ch == ' ')) {
			System.out.println("true");
		}

		char ch2 = ' ';
		if (ch == 'x' || ch == 'X') {
			System.out.println("true");
		}

		char ch3 = ' ';
		if (ch >= '0' && ch <= '9') {
			System.out.println("true");
		}

		char ch4 = ' ';
		if ((ch >= 'a' && ch <= 'x') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("true");
		}

		int year = 400;
		if (((year % 400 == 0) || (year % 4 == 0)) && year % 100 != 0)
			System.out.println("true");
		
		boolean powerOn = false;
		if(powerOn == false)
			System.out.println("true");
		
		
		String str = "yes";
		if(str == "yes") {
			System.out.println("true");
		}
		
	}

}

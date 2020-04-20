package ifEx;

public class IfEx6 {

	public static void main(String[] args) {

		//x가 10보다 크고 20보다 작을 때
		int x = 15;
		if ((10 < x) && (x < 20)) {
			System.out.println("ture");
		}

		//ch가 공백이나 탭이 아닐 때 
		char ch = '1';
		if (!(ch == '\t' || ch == ' ')) {
			System.out.println("true");
		}

		//ch가 x X일때
		char ch2 = ' ';
		if (ch == 'x' || ch == 'X') {
			System.out.println("true");
		}

		//ch가 '0'~'9'
		char ch3 = ' ';
		if (ch >= '0' && ch <= '9') {
			System.out.println("true");
		}

		//대소문자 
		char ch4 = ' ';
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("true");
		}

		//400으로 나눠 떨어지거나 또는 4로 나눠 떨어지고 100으로 나눠 떨어질 
		int year = 400;
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
			System.out.println("true");
		
		//false일 때 true인 조건식
		boolean powerOn = false;
		if(!powerOn)
			System.out.println("true");
		
		//문자열 참조변수 
		String str = "yes";
		if(str.equals("yes")) {
			System.out.println("true");
		}
		
	}

}

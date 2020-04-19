package stringex;

public class StringEx {

	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLMN";
		
		System.out.println("문자열 : "+str);
		
		for(int i=str.length()-1;i>=0;i--) {
		System.out.print(str.charAt(i));
		}
	}

}

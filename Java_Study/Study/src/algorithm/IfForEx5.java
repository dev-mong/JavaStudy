package algorithm;


public class IfForEx5 {

	public static void main(String[] args) {
//		문자열이"12345"라면, ‘1+2+3+4+5’의 결과인 15

		String str = "12345";
		int sum = 0;
		int num; //문자열 숫자로 변환 후 저장 할 변수 
		
		for(int i=0;i<str.length();i++) { //문자열 길이만큼 반복 
			num= str.charAt(i); // charAt(인덱스) 
			sum += num - 48;
		}System.out.println(sum);
		
	}

}

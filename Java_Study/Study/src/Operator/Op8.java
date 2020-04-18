package Operator;

public class Op8 {

	public static void main(String[] args) {
		// 틀린 부분 찾기 
	
		byte a = 10;

		byte b = 20;

		//byte c = a + b;
		byte c = (byte)(a + b);  

		char ch = 'A';
		//ch = ch + 2;
		ch = (char)(ch + 2);
		
		//float f = 3/2;
// 		float f = (float)(3 / 2);    
		float f = 3/2f;
		
// 		long l = 3000 * 3000 * 3000; 
		long l = 3000 * 3000 * 3000l; // 접미사 위치는 상관 없음    

		float f2 = 0.1f;

		double d = 0.1;
		
// 		boolean result = d=f2;   
		boolean result = d!=f2;    

		System.out.println("c="+c);

		System.out.println("ch="+ch);

		System.out.println("f="+f);

		System.out.println("l="+l);

		System.out.println("result="+result);
		
	}

}

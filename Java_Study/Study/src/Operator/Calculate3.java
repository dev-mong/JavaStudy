package Operator;

public class Calculate3 {

	public static void main(String[] args) {
		
		//a>b>c 값 비교
		
		int a,b,c;
		
		a = (((25+5) + (36/4))-72) * 5;
		b = (((25*5) + (36-4))-71) / 4;
		c = (128/4)*2;
		
		//a>b>c 값 비교, 둘다 참 
		if (a > b && b > c)
		{
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}

}

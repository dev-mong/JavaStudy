package method;

public class CircleMain {

	static double result;
	static final double PI = 3.14;
	
	public static void main(String[] args) {
	
		System.out.println("원의 넓이 : " + area(10));
		System.out.println("원의 넓이 : " + round(10));
		
	}
	
	static double area(double r) {
		
		result = 2*PI*r;
		return result;		
	}
	
	static double round(double r) {
		result = PI*r*r;
		return result;
	}
}

package algorithm;


public class IfForEx5 {

	public static void main(String[] args) {
//		2x+4y=10의 모든 해
//		0<=x<=10,  0<=y<=10 
		
		int result = 0;
		for (int x = 0; x <= 10; x++) {		
			for (int y = 0; y <= 10; y++) {
				result = (2 * x) + (4 * y);
				if(result == 10) {
					System.out.println("x: " + x +" y: "+y);
				}
			}
		}
	}

}

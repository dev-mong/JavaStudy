package loopEx;

public class DoWhileEx1 {

	public static void main(String[] args) {
		
		int i=0;
		
		do {
			i++;
			System.out.println(i); 
		}while(i<100); 
		// do while문은 꼭 한번은 실행, 100이상이면 101까지 출력 
		
		i=100;
		do {
			i--;
			System.out.println(i);
		}while(i>1);
		

	}

}

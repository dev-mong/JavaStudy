package loopEx;

public class WhileEx3 {

	public static void main(String[] args) {

		 int i = 1;
		  int sum = 0;
		  while (i <= 1000) {
		   if ((i % 2 == 0) && (i % 7 == 0)) {
		    System.out.println("2의배수이면서 7의 배수인 수: " +i);
		    sum += i;
		   }
		   i++;
		  }
		  System.out.println("총 합:" + sum);

		}

	}


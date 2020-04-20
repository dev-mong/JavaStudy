package loopEx;

public class ForEx10 {

	public static void main(String[] args) {
//		 1+(1+2)+(1+2+3)+...+(1+2+3+...+10)

// 		int sum = 0;
// 		int total = 0;
		
// 		for (int i = 1; i <= 10; i++) {
// 			sum += i;
// 			total += sum;
// 		}
// 		System.out.println("1+(1+2)+(1+2+3)+ .. +(1+2+3+...+10) = "+total);
		
		int total=0;
		
		for(int i=1;i<=10;i++){
			int sum=0;
			for(int j=1;j<=i;j++){
				sum+=j;
			}
			total += sum;
		}
		System.out.println("1+(1+2)+(1+2+3)+ .. +(1+2+3+...+10) = "+total);

	}

}

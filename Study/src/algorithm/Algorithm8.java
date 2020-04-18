package algorithm;

public class Algorithm8 {

	public static void main(String[] args) {
//		작은 수에서 큰 수 까지의 합 구하기 
		
		int num[] = {10,20,40,30};
		int max = num[0];
		int sum = 0;
		
		for(int i = 0; i < num.length;i++) {			
			if(max < num[i]) {
			   max = num[i];
			   num[i] = max;
			}
			sum += num[i];
		}
		System.out.println(sum);
		
	}

}

package algorithm;

public class Algorithm6 {

	public static void main(String[] args) {
		// 최대값 찾기 
		
		int num[] = {10,6,30,3,35};
		int max = num[0];

		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println(max);
	}

}

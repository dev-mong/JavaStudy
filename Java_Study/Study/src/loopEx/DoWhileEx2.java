package loopEx;

public class DoWhileEx2 {

	public static void main(String[] args) {
		
		int i = 0;
		int sum =0;
		do {
			i++;
			sum += i;
		}while(i<99); // 98까지 해야 반복됬을때 99까지 계산 됨 
		System.out.println("1부터 99까지의 합: " + sum);
	}

}

package LoopEx;

public class WhileEx1 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		while(i<=99) {
			sum += i;
			System.out.println(i);
			i++;
		}
		System.out.println("1부터 99까지의 합 : "+ sum);

	}

}

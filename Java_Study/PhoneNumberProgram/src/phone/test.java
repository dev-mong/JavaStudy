package phone;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int num = sc.nextInt();
		System.out.println(num);
		
//		double s = sc.nextDouble();
//		System.out.println(s);
		
		String b = sc.nextLine(); // 여기까지 입력된 값이 나오고 끝남
		System.out.println(b);
		
//		System.out.println("문자 입력");
//		int i = sc.nextInt();
//		System.out.println(i);
		

		Scanner input2 = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println(name);
	}

}

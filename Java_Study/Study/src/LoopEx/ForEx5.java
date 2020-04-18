package LoopEx;

public class ForEx5 {

	public static void main(String[] args) {
		// 짝수 단(2,4,8)만 출력

		for(int i=1;i<=9;i++) {
			if(i%2==0) {
				System.out.println(i + "단");
				for(int j=0; j<=9; j++) {
					System.out.println(i+"*"+j+"="+i*j);
				}
			}
		}

	}

}

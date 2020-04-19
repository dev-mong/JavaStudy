package loopEx;

public class ForEx5 {

	public static void main(String[] args) {
		// 짝수 단(2,4,8)만 출력

//		for(int i=1;i<=9;i++) {
//			if(i%2==0) {
//				System.out.println(i + "단");
//				for(int j=0; j<=9; j++) {
//					System.out.println(i+"*"+j+"="+i*j);
//				}
//			}
//		}
		
		//2단 2*2까지, 4단 4*4단까지 8단 8*까지
		
		for(int i=1;i<=9;i++) {
				for(int j=0; j<=9; j++) {
					if(i%2==0&&j<=i)
					System.out.println(i+"*"+j+"="+i*j);
				}
			}
		}
		
	}


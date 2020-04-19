package loopEx;

public class ForEx3 {

	public static void main(String[] args) {

//		int num=0;
//		int count=0;
//		
//		while((num++)<100){
//			if(num%5!=0 || num%7!=0)
//		continue;
//		count++;
//		System.out.println(num);
//		}
//		System.out.println("count: " + count);
		
		int count = 0;
		for(int num=1; num<100; num++) {
			if(num%5!=0 || num%7!=0) // 5와 7의 배수가 아니면 증감식으로 이동
				continue;
			count ++;
			System.out.println(num);
		}
		System.out.println("count: " + count);

	}

}

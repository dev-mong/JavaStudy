package arraystudy;

import java.util.Scanner;

public class MaxMin {

//	int arr[] =new int[5];
	
	MaxMin(){
//		this.arr=arr;
	}
	
	public static int miniValue(int[] arr) {
		
		int min=100;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
		
	}
	
	public static int maxValue(int[] arr) {
		
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("숫자를 입력하세요: ");
			arr[i]=sc.nextInt();
		}
		
		//최소값
		int min = MaxMin.miniValue(arr);
		System.out.println("최소값: "+min);
		//최대값
		int max = MaxMin.maxValue(arr);
		System.out.println("최대값: "+max);
		
		

	}

}

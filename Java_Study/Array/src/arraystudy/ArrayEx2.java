package arraystudy;

import java.util.Scanner;

public class ArrayEx2 {

	int[][] arr = new int[3][3];
	
	int[][] data(int[][] arr, int add) {
		arr[0][0] = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] += add;
				add++;
				this.arr = arr;
				System.out.print(arr[i][j]);
			} System.out.println();
		}
		return arr;
	}
	
	void change() {
		
		int change[][] = new int[3][3];
			
			for(int i=0;i<arr[0].length;i++) {			
				change[0][i] = this.arr[2][i];
				System.out.print(change[0][i]+" ");
			}System.out.println();
			
			for(int i=1;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
				change[i][j] = this.arr[i-1][j];
				System.out.print(change[i][j]+" ");
				}System.out.println();
			}
		
	}
	
	
	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];

		ArrayEx2 array = new ArrayEx2();
		
		array.data(arr, 1);
		System.out.println("-------------");
		array.change();
		
	}
}

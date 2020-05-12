package CrainGame;

import java.util.Scanner;

public class Solution2 {
	

	  public static int board[][]=new int[5][5]; // 인형이 담긴 보드
	
	 public static int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        return answer;
	  }

    
    
	public static void main(String[] args) {
		

//		  int board[][]=new int[5][5]; // 인형이 담긴 보드
		  int moves[]=new int [10];//크레인 움직 일 수 있는 수 1000 이상 

	    
	    //인형의 종류는 100개 
		  int doll=0;
	    
	    //크레인 움직이는 위치 입력 저장 변수 
	    int crain=0;
	    
	    Scanner sc=new Scanner(System.in);

	    //마지막 인덱스 저장 
	    int top=0;
	    
	    //보드에 인형 넣기 
	    for(int i=0;i<board.length;i++) {
	    	
	    	for(int j=0;j<board[i].length;j++) {
	    		  doll = (int)(Math.random()*101); //랜덤 함수 0~100 
	    			board[i][j]=doll;
	    		  	System.out.print(board[i][j] +" "); //배열의 랜덤 값 출력
	    		  	top=j;
		    	}System.out.println("\t");
	    }
	    
	    
	    
	    

	}

}

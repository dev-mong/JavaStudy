package CrainGame;

import java.util.Scanner;
import java.util.Stack;

public class Solution {


	 public static int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        return answer;
	    }
	

	
	public static void main(String[] args) {

		int board[][]=new int[5][5]; // 인형이 담긴 보드
		int moves[]=new int [10];//크레인 움직 일 수 있는 수 1000 이상 
		  

	    
	    //인형의 종류는 100개 
	    int doll=0; 
	    
	    //크레인 움직이는 위치 입력 저장 변수 
	    int crain=0;
	    
	    Scanner sc=new Scanner(System.in);
	    
	    for(int i=0;i<board.length;i++) {
	    	for(int j=0;j<board[i].length;j++) {
      		    doll = (int)(Math.random()*101); //랜덤 함수 0~100 
    			board[i][j]=doll;
    		  	System.out.print(board[i][j] +" "); //배열의 랜덤 값 출력
	    	}System.out.println("\t");
	    }
	    
	    //크레인 1000번 이동 
	    for(int m=0;m<moves.length;m++) {
	     	System.out.println("크레인을 움직일 위치를 입력하세요. 1~5사이에 입력"); //예외처리 하기 ------
	    	crain =sc.nextInt();
	    	sc.nextLine();
	    	moves[m]=crain-1;
	    }  	
	    System.out.print("[");
	    for(int k=0;k<moves.length;k++) {
	    System.out.print(moves[k]+",");
	    }System.out.print("]");

	    solution(board,moves);
	    
	}

}

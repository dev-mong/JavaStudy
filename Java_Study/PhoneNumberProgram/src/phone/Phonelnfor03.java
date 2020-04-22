package phone;

import java.util.Scanner;

public class Phonelnfor03 {
	
	String name;
	String phoneNumber;
	String birthDay;
	String[][] data = new String[2][3];
	
	Phonelnfor03() {}
	
	// 이름, 번호, 생년월일 입력 
	Phonelnfor03(String name,String phoneNumber, String birthDay){
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birthDay=birthDay;
	}
	
	// 이름, 번호 입력
	Phonelnfor03(String name,String phoneNumber){
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birthDay="입력없음 ";
	}
			
	public static void main(String[] args) {
		
		Phonelnfor03 ph =new Phonelnfor03(); // 객체 생성
		Scanner input = new Scanner(System.in);
		
		
		String name = null;
		String phoneNumber=null;
		String birthDay=null;	
		String data[][] = new String[2][3]; // 데이터 저장 할 공간
		
		
		System.out.println("<<<<전화번호부 프로그램>>>");
		
		while(true) {
		
		System.out.println();	
		System.out.println("----------메뉴를 선택하세요----------");	
		System.out.println("1.저장 2.전체 검색 3.검색 4.수정 5.삭제");
		
		//메뉴 입력
		int menu = input.nextInt();

		
		// 데이터 저장 
		if(menu == 1) {
			System.out.println("----------정보를 입력하세요----------");
			
		for(int i=0;i<2;i++) {			
			
			System.out.println("이름을 입력하세요");
			name = input.next(); 
			
			System.out.println("전화번호를 입력하세요");
			phoneNumber = input.next();
			
			System.out.println("생년월일을 입력하세요(없음입력가능)");
			birthDay = input.next(); //공백이외의 값을 입력해야함 

			
			ph=new Phonelnfor03(name,phoneNumber,birthDay);
			if(birthDay.equals("없음")) {
				ph = new Phonelnfor03(name,phoneNumber);
				
			}
			
			data[i][0] = ph.name;		
			data[i][1] = ph.phoneNumber;
			data[i][2] = ph.birthDay;
			
			if(i<1) { // 반복횟수가 끝나면 출력 안함 
				System.out.println("==========추가 할 정보를 입력하세요========");
				}
			
		}// 데이터 저장 for문 
		
		} //menu 1
		
		
		// 데이터 전체 출력 
		if(menu==2) { 
			System.out.println("----------저장 된 전체 전화 번호----------");
		for(int i=0;i<2;i++) {
			System.out.print("이름 : "+data[i][0]+" ");
			System.out.print("전화번호 : "+data[i][1]+" ");
			System.out.print("이름 : "+data[i][2]);
			System.out.println();
		}
		}//menu 2

		
		//데이터 검색
		if(menu==3) { 
			System.out.println("=====이름을 입력하세요=====");
			String nameSelect = input.next();
			for(int i=0;i<data.length;i++) {
			if(data[i][0].equals(nameSelect)) {
				System.out.println(nameSelect);
			}
			}		
		}//menu3
		
		
		//데이터 수정 
		if(menu==4) {
			
			System.out.println("=====수정 할 이름을 입력하세요=====");
			String nameUpdate=input.next();
			System.out.println(nameUpdate+" 선택되었습니다.");
			
			for(int i=0;i<data.length;i++) {
				if(data[i][0].equals(nameUpdate)) { // 입력한 이름으로 데이터 수정
					for(int j=0;j<data[i].length;j++) {
					
//						if(j<data[i].length-1) {
							System.out.println();
							System.out.println("----------\""+nameUpdate+"\" 수정 할 메뉴를 선택하세요----------");	
//						}					
							
					System.out.println("1.이름 2.전화번호 3.생년월일");
					int num = input.nextInt();
					
					
					if(num==1) { //이름을 변경
						System.out.println();
						System.out.println("====="+nameUpdate+"의 수정 할 이름을 입력하세요======");
						String update = input.next();
						data[i][0] = update;
						System.out.print(nameUpdate+"이름이"+data[i][0]+"로 변경되었습니다. ");//변경 된 값 출력
						System.out.println();
					}//이름 변경 if	
					
					if(num==2) { //전화번호 변경
						System.out.println();
						System.out.println("====="+nameUpdate+"의 수정 할 전화번호을 입력하세요======");
						String update = input.next();
						data[i][1] = update;
						System.out.print(nameUpdate+"전화번호가"+data[i][1]+"로 변경되었습니다. ");//변경 된 값 출력 

					}// 전화번호 변경 if
					
					 if(num==3) { //생년월일 변경
						System.out.println();
						System.out.println("====="+nameUpdate+"의 수정 할 생년월일을 입력하세요======");
						String update = input.next();
						data[i][2] = update;	
						System.out.print(nameUpdate+"생년월일이"+data[i][2]+"로 변경되었습니다. ");//변경 된 값 출력 

					}//생년월일 변경 if	
					 
				}//이름열 for문
					
			}//변경 할 이름을 입력 if문 
			
		}//배열의 행 for문	
	
			
			System.out.println("----------데이터 수정 내용----------");
			for(int k=0;k<data.length;k++) {
				for(int m=0;m<data[k].length;m++) {
					System.out.print(data[k][m]+" ");	
				}
			}
	
		
			}//menu4
		
		
		
		//데이터 삭제
		if(menu==5) {
			
			System.out.println("----------삭제할 이름을 입력하세요----------");
			String nameDelete = input.next();
			for(int i=0;i<data.length;i++) {
				
			}
			
			break;
			
		}//menu5
		

		}//while문 
	}//main 
}//class 


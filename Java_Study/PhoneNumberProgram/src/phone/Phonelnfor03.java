package phone;

import java.util.Scanner;

public class Phonelnfor03 {
	
	String name;
	String phoneNumber;
	String birthDay;
	
	Phonelnfor03(){
		
	}
	
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
	
	
	String data() {
		String setData = this.name+this.phoneNumber+this.birthDay;
		System.out.println(setData);
		return setData;
	}
	
	void show() {
		String[] dataa = new String[2];
		System.out.println(data());
//		for(int i=0;i<dataa.length;i++) {
//			dataa[i] = data();
//			
//		}System.out.println();
	}
	

	public static void main(String[] args) {

		Phonelnfor03 ph = new Phonelnfor03();
		
		String name = null;
		String phoneNumber=null;
		String birthDay=null;	
		
		Scanner input = new Scanner(System.in);
		
		int i =0;		
		while(i<2) {
		
		System.out.println("이름을 입력하세요");
		name = input.nextLine();
		System.out.println("전화번호를 입력하세요");
		phoneNumber = input.nextLine();
		System.out.println("생년월일을 입력하세요");
		birthDay = input.nextLine();

		// 생년월일 정보 저장
		ph = new Phonelnfor03(name,phoneNumber,birthDay);
		if(birthDay.equals(""))
			ph = new Phonelnfor03(name,phoneNumber);
		
		i++;
		
		ph.show();
		}
		
		
		

	}

}

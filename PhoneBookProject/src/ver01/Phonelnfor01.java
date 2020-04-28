package ver01;

import java.util.Scanner;

public class Phonelnfor01 {

	String name;
	String phoneNumber;
	String birthDay;

	Phonelnfor01() {
		
	}
	
	Phonelnfor01(String name,String phoneNumber, String birthDay){
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birthDay=birthDay;
	}
	
	Phonelnfor01(String name,String phoneNumber){
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birthDay="입력없음 ";
	}
	
	void data() {
		System.out.println("이름: "+name+"전화번호:"+phoneNumber+"생년월일 :"+birthDay);
	}
	
	
	public static void main(String[] args) {

		Phonelnfor01 ph = new Phonelnfor01("손흥민","01012345678","900505");
		Phonelnfor01 ph1 = new Phonelnfor01("박지성","01056789658");
		Phonelnfor01 ph2 = new Phonelnfor01("기성용","01045671234","800710");

		ph.data();
		ph1.data();
		ph2.data();
		
	
	}

}

package phone;

import java.util.Scanner;

public class Phonelnfor {

	String name;
	String phoneNumber;
	String birthday;
	String data[];
	
	Phonelnfor(){}
	
	@Override
	public String toString() {
		return "Phonelnfor [name=" + name + ", phoneNumber=" + phoneNumber + ", birthday=" + birthday + "]";
	}
	
	
//	String[] data() 
	void data(){
	
		
		int i =0;
		Scanner sc = new Scanner(System.in);
		
		while(i<2) {
		System.out.println("이름을 입력하세요");
		name = sc.nextLine();
		System.out.println("전화번호를 입력하세요");
		phoneNumber = sc.nextLine();
		System.out.println("생년월일을 입력하세요");
		birthday = sc.nextLine();
		if(birthday == " ")
			continue;
		i++;
		}
		
//		for(int j=0;j<3;j++) {
//			data[j] = toString();
//			System.out.println(data[j]);
//		}
//		return data;
	}

	
	public static void main(String[] args) {

		
		Phonelnfor ph = new Phonelnfor();
		ph.data();
		System.out.println(ph);

	
	}

}

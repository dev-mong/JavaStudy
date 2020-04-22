package PhoneBook;

import java.util.Scanner;

public class PhoneBookManager {
	
	Scanner sc;
	PhoneBookData data; //PhoneBookData 참조변수
	PhoneBookData[] phoneData; //PhoneBookData의 객체를 저장한 배열 
	int count;
	
	//Manager 생성자 
	public PhoneBookManager(){
		sc=new Scanner(System.in);
		data=null;
		phoneData=new PhoneBookData[100];
		count=0;
		
	}

	
	//Data 객체 생성 
	PhoneBookData instance() {
		
		System.out.println("이름을 입력하세요");
		String name=sc.nextLine();
		System.out.println("전화번호를 입력하세요");
		String phoneNumber=sc.nextLine();
		System.out.println("생년월일을 입력하세요");
		String birthday=sc.nextLine();
		
		//객체 생성 
		data = new PhoneBookData(name,phoneNumber,birthday);
		if(birthday==null||birthday.trim().isEmpty()){ //생일 입력값이 없음,공백을제거
			data=new PhoneBookData(name,phoneNumber);
		}		
		return data;
	}//instance 
	

	//데이터 저장
	void insertData() {
		phoneData[count] = instance();
		count++;
	}
	
	//데이터 전체 출력 
	void showAllData() {
		for(int i=0;i<count;i++) {
			phoneData[i].showData();
		}
	}
	
	//데이터 검색
	void selectData() {
		
		System.out.println("검색 할 이름을 입력하세요");
		String nameInput= sc.nextLine();
		 
		int index = -1; // index를 이용하여 배열 참조
		
		//객체 배열에 이름이 존재하는지 확인 
		for(int i=0;i<count;i++) { //phoneData 배열 반복
			if(phoneData[i].name(nameInput)) { //phoneData객체 배열에 이름이 같을 때 
				System.out.println(nameInput+"님이 검색되었습니다."); // 출력
				index = i; // index값을 변경 
			}
		}

		//index값을 이용하여 검색된 이름의 데이터 값 출력 
		if(index<0) {
			System.out.println("찾으시는 이름이 없습니다.");
		}else {
			phoneData[index].showData();//객체 배열의 index값에 저장된 주소값을 참조하여 출력 메서드 호출 
		}

	}
	
	//데이터 수정
	void update() {
		
		System.out.println("수정할 이름을 입력하세요");
		String nameInput = sc.nextLine();
		
		int index = -1;
		for(int i=0;i<count;i++) {
			if(phoneData[i].name(nameInput)) {
				System.out.println(nameInput+"님이 검색되었습니다.");
				index = i;
			}
		}
		
		if(index<0) {
			System.out.println("찾으시는 이름이 없습니다.");
		}else {
			System.out.println("수정할 이름을 입력하세요");
			String updateName = sc.nextLine();
			System.out.println("수정할 번호를 입력하세요");
			String updatePhoneNumber = sc.nextLine();
			System.out.println("수정할 생년월일을 입력하세요");
			String updateBirthday = sc.nextLine();
			
			phoneData[index].name = updateName;
			phoneData[index].phoneNumber = updatePhoneNumber;
			phoneData[index].birthday = updateBirthday;
			
			System.out.println(nameInput+"님의 정보가 수정되었습니다.");
			phoneData[index].showData();
			System.out.println("---------------------------");
			
		}
		
	}
	
	//데이터 삭제
	void delete() {
		
		System.out.println("삭제할 이름을 입력하세요");
		String deleteName = sc.nextLine();
		
		int index = -1;
		
		for(int i=0;i<count;i++) {
			if(phoneData[i].name(deleteName)) {
				System.out.println(deleteName+"님이 검색되었습니다.");
				index=i;
			}
		}
		
		if(index<0) {
			System.out.println("찾으시는 이름이 없습니다.");
		}else {
			
			phoneData[index].showData();
			System.out.println("삭제하겠습니까? Yes or No");
			String delete = sc.nextLine();
			
			if(delete=="Yes" && delete=="yes") {
				System.out.println(deleteName+"님의 정보가 삭제되었습니다.");
			} else if(delete=="No" && delete=="no") {
				return;
			}
			
		}
		
		
	}
	
}



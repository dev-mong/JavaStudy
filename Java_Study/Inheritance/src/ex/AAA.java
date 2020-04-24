package ex;

public class AAA {

//	void a() {
//		System.out.println("aaa의 1");
//	}
	void b() {
		System.out.println("aaaaa");
	}
	public static void main(String[] args) {

		BBB k = new BBB();
		// 변수  상->하 : 반드시 명시적 형변환
//		((AAA) k).b();    // b() 메서드만 사용 , 형변환을 해도 오버라이딩을 해서 오버라이딩 된 값만 출력 됨 
	
		//다형성 
		AAA C = new CCC();
		AAA B = new BBB();
		AAA A = new AAA();
		B.b(); //
		C.b();
//		((CCC)C).b();
		((BBB)B).nnn();
		
		A.b();

		
		//다형성 
//		AAA a = new BBB();
//		BBB b = new AAA(); //하위 타입으로 상위 타입을 선언 못함 왜냐면 하위 타입은 상위를 상속 하고 있기떄문에 
		
		
//		a.a();
//		((BBB)a).a();
//		
//		a.b(); //a는 타입이 AAA니까 참조 불가능
//		((BBB)a).b();//형변환을 해서 b메소드를 호출 
		
		
//		k.a();
//		

	}

}

class BBB extends AAA {

	void b() {
//		super.a();
		System.out.println("bbbb");
	}
	void nnn() {
		System.out.println("1111");
	}
}

class CCC extends BBB{
	void b() {
		System.out.println("ccc");
	}
}


package user;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import Ticket.TicketManager;
import user.exception.EmptyStringException;
import user.exception.OverlapException;

public class InfoManager {

	// 회원가입 (회원 추가)
	// 회원 탈퇴
	// 회원 수정
	// 로그인
	// 회원정보 출력 (회원정보+보유금액+포인트)

	String emptyString() throws EmptyStringException {
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				EmptyStringException e = new EmptyStringException();
				throw e;
			}
		}
		return str;
	}

	public static InfoManager getManager() {
		return manager;
	}

	TicketManager tm = new TicketManager();
	private HashMap<String, MemberInfo> member;
	private HashMap<String, NoMemberInfo> noMember;



	public Scanner sc;

	// 싱글톤 화
	private InfoManager() {
		member = new HashMap<>();
		noMember = new HashMap<String, NoMemberInfo>();
		sc = new Scanner(System.in);
	}

	private static InfoManager manager = new InfoManager();

	// InfoManager 객체 생성할 땐 이 메서드를 들고가세여
	public static InfoManager getInst() {
		return manager;
	}

	boolean OverlapKey(String id) {
		return member.containsKey(id);
	}

	public HashMap<String, MemberInfo> getMember() {
		return member;
	}

	public HashMap<String, NoMemberInfo> getNoMember() {
		return noMember;
	}
	// 비회원 예매
	
	public void creatNoMember() {
		NoMemberInfo noMember = null;
		String phoneNum=null;
		System.out.println("========비회원 예매를 시작합니다========");
		while(true) {
			System.out.println("전화번호를 입력해주세요. >>");
			try {
				phoneNum=emptyString();
			} catch (EmptyStringException e) {
				System.out.println(e.getMessage());
				continue;
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다. \n다시 입력해주세요.");
				continue;
			}

			noMember = new NoMemberInfo(phoneNum);
			break;
		}
	}
	
	// 회원 가입
	public void creatId() {

		MemberInfo member = null;
		String id = null, pw = null, name = null, phoneNum = null, email = null;
		while (true) {
			System.out.println("아이디를 입력하세요 >> ");
			try {
				id = emptyString();
				if (OverlapKey(id)) {
					OverlapException e = new OverlapException();
					throw e;
				}
				System.out.println("패스워드를 입력하세요 >> ");
				pw = emptyString();
				System.out.println("이름을 입력하세요 >> ");
				name = emptyString();
				System.out.println("전화번호를 입력하세요 >> ");
				phoneNum = emptyString();
				System.out.println("이메일을 입력하세요 >> ");
				email = emptyString();

			} catch (OverlapException e) {
				System.out.println(e.getMessage());
				continue;
			} catch (EmptyStringException e) {
				System.out.println(e.getMessage());
				continue;
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다. \n다시 입력해주세요.");
				continue;
			}
			break;
		}
		member = new MemberInfo(id, pw, name, phoneNum, email);
		addInfo(id, member);
	}

	// 생성된 인스턴스를 추가
	public void addInfo(String id, MemberInfo m) {
		member.put(id, m);
	}
	
	public void addNoMemberInfo(String phoneNum, NoMemberInfo m) {
		noMember.put(phoneNum, m);
	}

	// 회원 id를 기준으로 검색
	public void searchInfo(String id) {
		member.get(id).showBasicInfo();
		member.get(id).showMoney();
	}

	// 회원 id를 기준으로 탈퇴
	public void deleteInfo(String id) {
		member.remove(id);
	}

	// 회원 정보 수정
	public void editInfo(String id) {

		String editId = id; String pw; String name; String phoneNum; String email;
		System.out.println("회원 정보를 수정합니다.");
		System.out.println("아이디 : " + editId);
		while (true) {
			try {
				System.out.println("패스워드를 입력해주세요 >> ");
				pw = emptyString();
				System.out.println("이름을 입력해주세요 >>");
				name = emptyString();
				System.out.println("전화번호를 입력해주세요 >> ");
				phoneNum = emptyString();
				System.out.println("이메일을 입력해주세요 >> ");
				email = emptyString();
			} catch (EmptyStringException e) {
				System.out.println(e.getMessage());
				continue;
			}
			break;
		}
		member.remove(id);
		member.put(id, new MemberInfo(editId, pw, name, phoneNum, email));

	}

	//회원 전체 정보 출력
	public void showAllMemberInfo() {
		Iterator<String> itr = member.keySet().iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			member.get(key).showBasicInfo();
			System.out.println("---------------------------");
		}
	
	}
	
	//비회원 전체 정보 출력
	public void showAllNoMemberInfo() {
		Iterator<String> itr = noMember.keySet().iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			noMember.get(key).showResevInfo();
			System.out.println("---------------------------");
		}
	
	}

	// 회원 id와 pw를 입력하여 접속
	public boolean login(String id, String pw) {
		boolean result=false;

		try {
			result= member.get(id).getPw().equals(pw);
		} catch (Exception e) {
			System.out.println("존재하지 않는 회원정보입니다.\n다시 입력해주세요");
			
		}
		return result;

	}

	
	public boolean adminCreat(String id, String pw) {
		
		boolean result=false;
		try {
			result=id.equals("admin") && pw.equals("admin");			
		} catch (Exception e) {
			System.out.println("존재하지 않는 회원정보입니다.\n다시 입력해주세요");
		}
		return result;
		
	}
	
	
	public void showMyTicket(String id) {
		member.get(id).showTicket();
	}
	
	
	
	public void showNoMemberTicket(String phoneNum) {
		noMember.get(phoneNum).showTicket();
	}

}

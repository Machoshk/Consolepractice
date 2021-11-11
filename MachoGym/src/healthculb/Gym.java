package healthculb;

import java.time.*;
import java.util.*;



public class Gym {
	private MemberDAO dao;
	
	public Gym() {
	this.dao = new MemberDAO();
}
	// 1. 회원 정보 입력
	public void memberjoin(Scanner scanner) {
		System.out.println("성함을 입력해주세요");
		String name = scanner.next();
		System.out.println("전화번호를 입력해주세요");
		String phone = scanner.next();
		System.out.println("성별을 입력해주세요");
		String sex = scanner.next();
				
		
		try {
				Member m = new Member();
				m.setName(name);
				m.setPhone(phone);
				m.setSex(sex);
				dao.memberAdd(m);
				System.out.println("회원가입에 성공했습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	// 시스템의 오늘 날짜를 얻는 사용자 정의 메소드(생략)
	// 2. 회원 정보(전체)출력
	public void membercheck() {
		List<Member> members = dao.memberList();
		this.memberPrint(members);
		}
	
	private void memberPrint(List<Member> members) {
		// 건수 출력
		System.out.printf("총: %s건%n", members.size());
		// 명단 출력
		System.out.println("[이름]  [연락처]  [성별]");
		for (Member m : members) {
			System.out.printf("%s %s %s", m.getName(), m.getPhone(),m.getSex(),m.getRegDate());
		}
		System.out.println("\n===========================");
		System.out.println();
	}

	
	// 3. 회원 정보 검색
	public void membersearch(Scanner scanner) {
		while(true) {
			// 메인 메뉴 출력
			System.out.println("--------------------------");
			System.out.println("3. 회원정보검색");
			System.out.println("--------------------------");
			System.out.println("1. 이름 2. 전화번호 3. 성별");
			int menu = scanner.nextInt();
		}
	}
	// 4. 가격확인 메서드
	public void price() {
		System.out.println("∠('-'*) Macho Gym ∠('-'*)");
		System.out.println("1개월 : 10만원");
		System.out.println("3개월 : 18만원");
		System.out.println("6개월 : 36만원");
		System.out.println("12개월 : 60만원");
		System.out.println("라커 + 운동복 : 1만원(1개월)");
		System.out.println("* PT는 별도문의 부탁드립니다.");
		System.out.println("∠('-'*) Macho Gym ∠('-'*)");
	}
	
	// 5. 종료 메서드
	public void end() {	// 프로그램 종료 메서드
		System.out.println("프로그램이 종료됩니다.");
		System.exit(0);
}
}
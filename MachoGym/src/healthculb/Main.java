package healthculb;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//콘솔환경 외부입력처리 -> 스캐너클래스
		Scanner scanner = new Scanner(System.in);
		
		Gym g = new Gym();
		
		while(true) {
			System.out.println("=================== Macho Gym =================== ");
			System.out.println("1. 회원가입  2. 회원정보확인 3. 회원정보검색 4. 가격확인 5. 종료");
			System.out.println("================================================= ");
			System.out.println("▶");
			int action = scanner.nextInt();
			
			switch(action) {
			case 1:
				// 1. 회원 정보 입력
				g.memberjoin(scanner);
				break;
			case 2:
				// 2. 회원 정보 확인
				g.membercheck();
				break;
			case 3:
				// 3. 회원 정보 검색
				g.membersearch(scanner);
				break;
			case 4:
				// 4. 가격 확인
				g.price();
				break;
			case 5:
				// 4. 종료메서드
				g.end();
				break;
			default:
				System.out.println("1~4번을 입력해주세요.");
				break;
			}
		}
	
	}
}

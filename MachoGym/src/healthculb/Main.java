package healthculb;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Gym g = new Gym();
		
		while(true) {
			System.out.println("=================== Macho Gym =================== ");
			System.out.println("1. 회원가입  2. 회원정보확인 3. 가격확인 4. 날짜확인 5. 종료");
			System.out.println("================================================= ");
			System.out.println("▶");
			int action = scanner.nextInt();
			
			switch(action) {
			case 1:
				// 1. 회원정보입력
				g.memberjoin(scanner);
				break;
			case 2:
				// 2. 회원정보확인
				g.membercheck();
				break;
			case 3:
				// 3. 가격확인
				g.price();
				break;
			case 4:
				// 4. 날짜확인
				g.Calendar();
				break;
			case 5:
				// 5. 종료
				g.end();
				break;
			default:
				System.out.println("1~5번을 입력해주세요.");
				break;
			}
		}
	
	}
}

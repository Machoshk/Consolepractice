package healthculb;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//�ܼ�ȯ�� �ܺ��Է�ó�� -> ��ĳ��Ŭ����
		Scanner scanner = new Scanner(System.in);
		
		Gym g = new Gym();
		
		while(true) {
			System.out.println("=================== Macho Gym =================== ");
			System.out.println("1. ȸ������  2. ȸ������Ȯ�� 3. ȸ�������˻� 4. ����Ȯ�� 5. ����");
			System.out.println("================================================= ");
			System.out.println("��");
			int action = scanner.nextInt();
			
			switch(action) {
			case 1:
				// 1. ȸ�� ���� �Է�
				g.memberjoin(scanner);
				break;
			case 2:
				// 2. ȸ�� ���� Ȯ��
				g.membercheck();
				break;
			case 3:
				// 3. ȸ�� ���� �˻�
				g.membersearch(scanner);
				break;
			case 4:
				// 4. ���� Ȯ��
				g.price();
				break;
			case 5:
				// 4. ����޼���
				g.end();
				break;
			default:
				System.out.println("1~4���� �Է����ּ���.");
				break;
			}
		}
	
	}
}

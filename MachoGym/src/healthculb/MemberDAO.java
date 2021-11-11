package healthculb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberDAO {
	private List<Member> members;
	
	public MemberDAO() {
		this.members = new ArrayList<Member>();
		this.init();
	}
	public void init() {
		Member m1 = new Member();
		m1.setName("Chris");
		m1.setPhone("010-2324-1111");
		m1.setSex("M\n");
		m1.setRegDate("2021-10-15");
		this.members.add(m1);
		
		Member m2 = new Member();
		m2.setName("Keun");
		m2.setPhone("010-5545-2323");
		m2.setSex("F\n");
		m2.setRegDate("2016-04-11");
		this.members.add(m2);

		Member m3 = new Member();
		m3.setName("Moon");
		m3.setPhone("010-7765-4342");
		m3.setSex("M\n");
		m3.setRegDate("2018-01-11");
		this.members.add(m3);
	}
	
	public List<Member> memberList(){
		List<Member> result = null;
		
		result = this.members;
		return result;
	}
	
	// 회원 정보 저장 메서드
	public void memberAdd(Member m)throws Exception{
		if(this.memberCheck(m)) {
			this.members.add(m);
		} else {
			throw new Exception("이미 존재하는 회원입니다.");
		}
	}
	
	// 중복 회원 검사 private 메소드
	private boolean memberCheck(Member m) {
		boolean result = true;
	
		// 기존 회원들의 정보와 전달받은 member 객체의 정보를 비교하는 과정
		for(Member member : this.members) {
			if(member.getName().equals(m.getName()) && member.getPhone().equals(m.getPhone()) && member.getSex().equals(m.getSex())) {
				result = false;
			}
		}
		
		return result;
	}
}

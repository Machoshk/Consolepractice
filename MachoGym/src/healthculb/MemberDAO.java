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
		m1.setName("홍두깨");
		m1.setPhone("010-2324-1111");
		m1.setSex("남성\n");
		this.members.add(m1);
		
		Member m2 = new Member();
		m2.setName("문가인");
		m2.setPhone("010-5545-2323");
		m2.setSex("여성\n");
		this.members.add(m2);

		Member m3 = new Member();
		m3.setName("최두식");
		m3.setPhone("010-7765-4342");
		m3.setSex("남성\n");
		this.members.add(m3);
	}
	
	public List<Member> memberList(){
		List<Member> result = null;
		
		result = this.members;
		return result;
	}
	
	// 회원정보저장 메서드
	public void memberAdd(Member m)throws Exception{
		if(this.memberCheck(m)) {
			this.members.add(m);
		} else {
			throw new Exception("이미 존재하는 회원입니다.");
		}
	}
	
	// 중복회원검사 private 메소드
	private boolean memberCheck(Member m) {
		boolean result = true;
	
		for(Member member : this.members) {
			if(member.getName().equals(m.getName()) && member.getPhone().equals(m.getPhone()) && member.getSex().equals(m.getSex())) {
				result = false;
			}
		}
		
		return result;
	}
}

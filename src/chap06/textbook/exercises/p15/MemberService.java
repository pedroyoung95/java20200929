package chap06.textbook.exercises.p15;

public class MemberService {
	String name;
	String id;
	String password;
	int age;
	
	boolean login(String id, String password) {
		if(id == "hong" && password == "12345") {
			return true;
		}
		return false;
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}

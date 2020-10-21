package chap11.textbook.s110301;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
//목적: id가 같은 문자열인 경우, 같은 객체로 보려고 함
//단계 1. id의 hashCode() 리턴값을 동일하게 만듬
//※String의 hashCode 리턴값은 같은 리터럴이면 같은 값이 나오므로
//※String타입인 id에 바로 hashCode()를 실행
//단계 2. hashCode() 리턴값이 같으면, equals() 리턴값을 비교하게 함
//※equals() 재정의 시 parameter의 타입은 최상위 부모인 Object
//※id필드를 사용하기 위해 자식 클래스 Member로 강제 변환해야 함
//단계 3. instanceof로 강제 변환 가능 여부를 먼저 판단
//단계 4. 강제 변환 후, 원래 목적대로 id 문자열이 같을 때 true를 리턴
}

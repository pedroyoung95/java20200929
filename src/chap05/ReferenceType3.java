package chap05;

public class ReferenceType3 {
	public static void main(String[] args) {
		int i=30;
		int j=30;
		
		String str1="java";
		String str2="java";
//참조변수의 스트링 리터럴이 완전히 동일하면, 기존 인스턴스를 재사용
//새로운 인스턴스 생성X, 기존 인스턴스의 주소값을 갖음

		System.out.println(i==j);
		System.out.println(str1==str2);
//동일 인스턴스 주소값을 갖으므로 true 출력
	}
}

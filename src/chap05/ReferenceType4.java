package chap05;

public class ReferenceType4 {
	public static void main(String[] args) {
		
		String str1="java";
		String str2="java";
//동일한 스트링 리터럴->동일한 주소 값
		String str3=new String("java");
//java가 저장된 별개의 새로운 인스턴스 생성->새로운 주소 값 저장
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str3);
//== 연산자는 참조타입에서는 변수에 직접 저장된 값을 비교
//str1,2,3는 주소 값이 직접 저장되어있으므로, 주소 값을 비교하게 됨
		
		System.out.println(str1.equals(str3));
//equals() method는 인스턴스가 가진 문자열을 비교
	}
}

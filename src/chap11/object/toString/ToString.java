package chap11.object.toString;

public class ToString {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		String s = o1.toString();
//toStirng(): 객체의 문자 정보(객체를 문자열로 표현한 값)를 리턴
		System.out.println(s);
		
		MyClass o2 = new MyClass();
		String s2 = o2.toString();
		System.out.println(s2);
		
		System.out.println(s2.toString());
		System.out.println(s2);
//System.out.println();에 객체만 넣으면 자동으로 toString()된 결과 출력
		
	}
}

package chap07.lecture.casting;

public class MyApp {
	public static void main(String[] args) {
		SuperClass o1 = new SubClass();
//부모클래스 변수에다가 자식클래스의 인스턴스를 바로 생성해서 할당해도 됨

		SuperClass[] arr = new SuperClass[3];
		arr[0] = new SubClass();
		method3(new SubClass());
		
		o1.method1();
		
		SubClass o2 = (SubClass)o1;
//기본타입 강제변환처럼 ()안 변환하고자 하는 클래스 타입을 기입
//		o1.method2(); -> 부모클래스타입이라 자식클래스의 메소드 사용X
		o2.method2();
		
		
	}
	
	public static void method3(SuperClass s) {
		s.method1();
	}
	
}

package chap08.lecture.casting;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		MyInterface i1 = o1;
		i1.method1();
//		i1.method2();
//i1은 인터페이스 타입이므로, method2 메소드를 읽을 수 없음
		MyClass o2 = (MyClass) i1;
		o2.methdo2();
		
		System.out.println(i1 instanceof MyInterface);
		System.out.println(i1 instanceof MyClass);
	}
}

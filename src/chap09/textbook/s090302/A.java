package chap09.textbook.s090302;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
//특정 클래스의 멤버에 접근하려면 그 클래스의 인스턴스를 만들어서 접근
//
		}
	}
	
	static class C {
		void method() {
			field1 = 10;
			method1();
//정적 멤버는 객체 없이 실행 가능해서 정적 멤버 안에서 인스턴스 멤버 사용X
//인스턴스 멤버를 사용하려면 인스턴스를 만들어서 접근
//따라서 정적 멤버 클래스도 내부 인스턴스 멤버를 사용X
			
			field2 = 10;
			method2();
		}
	}
}

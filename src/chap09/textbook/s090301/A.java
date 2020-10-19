package chap09.textbook.s090301;

public class A {
	B field1 = new B();
	C field2 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	static B field3 = new B(); 
//정적 멤버는 객체 없이 실행 가능해서 정적 멤버 안에서 인스턴스 멤버 사용X 
//따라서, 정적 필드는 인스턴스 멤버를 담을 수 없음.
	static C filed4 = new C();
	
	static void method2() {
		B var1 = new B();
//정적 멤버는 객체 없이 실행 가능해서 정적 멤버 안에서 인스턴스 멤버 사용X
//따라서, 정적 메소드로는 인스턴스 멤버를 실행할 수 없음.
		C var2 = new C();
	
	}
	class B {}
	static class C {}
}

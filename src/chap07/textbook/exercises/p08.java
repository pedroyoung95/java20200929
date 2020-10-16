package chap07.textbook.exercises;

class A {}
class B extends A {}
class D extends B {}
class E extends B {}

public class p08 {
	public static void main(String[] args) {
		B b = new B();
		B b1 = (B) new A(); 
//부모클래스의 인스턴스를 자식클래스로 강제변환 시 오류 발생 할 수 있음 
		B b2 = new D();
		B b3 = new E();
	}
	
	
	
	
}

package chap07.textbook.s070701;

class A {}
class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
//D는 B의 자식, E는 C의 자식
//B와 C는 A의 자식이므로, D와 E도 A의 자식
//따라서, D와 E의 인스턴스는 A클래스 타입의 참조변수에 할당 가능 
//자식클래스 타입에서 부모클래스 타입으로 자동 형변환
		
		B b1 = d;
		C c1 = e;
		
		//B b3 = e;
		//C c2 = d;
	}

}

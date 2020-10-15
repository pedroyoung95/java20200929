package chap07.textbook.s070601.package2;

import chap07.textbook.s070601.package1.A;

public class D extends A{
	public D() {
		super();
		this.field = "value";
		this.method();
//super()를 통해 부모클래스인 A를 호출했으므로
//this가 지칭하는 인스턴스는 A
	}
//protected의 최대 범위: 다른패키지에 있는 자식클래스까지만
//default 범위 + 타 패키지에 있는 자식클래스까지
}

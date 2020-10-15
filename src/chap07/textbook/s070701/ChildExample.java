package chap07.textbook.s070701;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
//method1은 부모클래스에 있으므로 사용가능
		parent.method2();
//method2는 부모, 자식클래스 모두에 있으므로 사용가능
//단, 자식클래스에서 재정의했고, 자식클래스의 인스턴스가 할당되었으므로
//재정의된 실행문의 실행
		
//		parent.method3;
//method3는 자식클래스에만 있는 메소드여서 부모클래스에서는 사용 불가
	}
}

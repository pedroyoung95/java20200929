package chap07.lecture.superKeyword;

public class ChildClass extends ParentClass{
	@Override
	void method1() {
		super.method1();
//super : 상위 클래스의 인스턴스에 접근하는 키워드(this와 유사)
//상위클래스의 메소드를 super키워드와 .(dot)으로 연결
		
		System.out.println("child method1");
	}
}

package chap07.lecture.superConstructor;

public class ChildClass extends ParentClass{
	public ChildClass() {
//		super();
		super(1);
//this()로 다른 생성자를 호출하듯이
//super()로 상위클래스의 생성자를 호출
//자식클래스에서 argument없는 생성자를 만들면
//부모클래스 생성자를 super()로 호출
//부모클래스에 생성자가 없으면 argument없는 생성자가 자동으로 생성해서 반응
	}
	
	@Override
	void method1() {
		super.method1();
		System.out.println("child method1");
	}
}

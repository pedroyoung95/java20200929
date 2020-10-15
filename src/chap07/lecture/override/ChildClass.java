package chap07.lecture.override;

public class ChildClass extends ParentClass{
	void method2() {
		System.out.println("Child method");
	}
	
	@Override
//@Override는 컴파일러에 힌트를 주는 주석
//@로 표시한 주석은 실행에 영향을 미칠 수 있는 주석, 어노테이션이라고 함
	void method1() {
		System.out.println("child method1!!!!!");
	}
//왼쪽에 삼각형이 뜨면서 override 되었다고 뜸
//부모 클래스의 메소드의 타입, 메소드 명, parameter는 동일하고
//실행문만 다르면 override가 됨.
}

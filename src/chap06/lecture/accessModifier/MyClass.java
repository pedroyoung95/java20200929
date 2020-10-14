package chap06.lecture.accessModifier;

public class MyClass {
	//접근제한자
	//public, protected, (default/package private), private
	//접근제한자를 안 쓰면 default를 갖게 됨
	//필드, 생성자, 메소드 모두 접근제한자 적용 가능
	//범위: public>protected>default>private
	
	//public: 모든 외부 클래스에서 사용 가능
	//(default): 같은 패키지 내의 외부 클래스까지 사용 가능
	//private: 클래스 내에서만 사용 가능
	
	public int var1;
	int var2;
	private int var3;
	
	
	void method1() {
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
//같은 클래스 내에서는 private도 사용 가능
	}
}

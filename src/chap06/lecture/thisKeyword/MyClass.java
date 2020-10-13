package chap06.lecture.thisKeyword;

public class MyClass {
	int var;
	
	void method1() {
		int var = 5;
		System.out.println(this.var);
		System.out.println(var);
	}
	
	void method2() {
		this.method1();
//method에서도 this 키워드를 사용하면 그 method를 사용하는 객체를 지칭
	}
}

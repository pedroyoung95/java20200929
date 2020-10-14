package chap06.lecture.staticKeyword;

public class MyApp {
	public static void main(String[] args) {
//main method 분석
//클래스 멤버인(static) 리턴할 필요가 없는(void) 
//args라는 String 배열을 parameter로 받는 main이라는 이름의 메소드
		MyClass o1 = new MyClass();
		MyClass o2 = new MyClass();
				
		o1.var1 = 99;
		o2.var1 = 77;
		
		o1.method1();
		o2.method1();
		
		o1.var2 = 100;
		System.out.println(o1.var2);
		System.out.println(o2.var2);
//var2는 클래스 필드이므로, 같은 클래스를 공유하는 객체들은 같은 클래스 필드값을 가짐	
		
		o1.var2 = 200;
		System.out.println(o1.var2);
		
		MyClass.var2 = 300;
		System.out.println(o1.var2);
		System.out.println(o2.var2);
		System.out.println(MyClass.var2);
//인스턴스 생성 없이 클래스로 접근해도 클래스 필드 사용 가능
		
		System.out.println("--------------------");
		o1.method2();
		o2.method2();
		MyClass.method2();
		
	}
}

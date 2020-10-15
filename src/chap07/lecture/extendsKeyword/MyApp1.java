package chap07.lecture.extendsKeyword;

public class MyApp1 {
	public static void main(String[] args) {
		SubClass o1 = new SubClass();
		System.out.println(o1.var1);
		o1.method1();
//SubClass는 SuperClass로부터 상속받아서 인스턴스 생성, 필드, 메소드 접근 가능
		System.out.println(o1.var2);
		o1.method2();
	}
}

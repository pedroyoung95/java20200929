package chap12.textbook.s140402;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
//		arg = 31;
//		localVar = 41;
//밑에서 람다식이 로컬 익명 객체를 만들었으므로
//로컬클래스에서 사용되는 메소드의 매개변수, 로컬변수는 final로 정의됨 		
		MyFuntionalInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar" + localVar);		
		};
		fi.method();
	}	
}

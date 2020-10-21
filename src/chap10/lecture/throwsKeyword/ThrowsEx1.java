package chap10.lecture.throwsKeyword;

import java.io.FileReader;

public class ThrowsEx1 {
	public static void main(String[] args) throws ClassNotFoundException{
		method1();
//main 메소드에서도 예외를 떠넘기면 jvm이 예외를 처리하게 됨. 
//jvm은 콘솔에 예외 내용을 출력하는 것으로 예외를 처리
	}
	
	public static void method1() throws ClassNotFoundException{
		method2();
	}
	
	public static void method2() throws ClassNotFoundException{
		method3();
	}
	
	public static void method3() throws ClassNotFoundException{
		method4();
	}
	
	public static void method4() throws ClassNotFoundException, FileNotFoundException {
//method4에서 ClassNotFountException이 발생하면
//method4를 호출한 메소드로 예외를 떠넘김
		Class.forName("java.lang.String2");
		FileReader fr = new FileReader("file.txt");
	}
	
}

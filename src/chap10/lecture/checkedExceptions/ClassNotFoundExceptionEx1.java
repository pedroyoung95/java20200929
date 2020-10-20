package chap10.lecture.checkedExceptions;

public class ClassNotFoundExceptionEx1 {
	public static void main(String[] args) {
		System.out.println("프로그램 실행1");
		try{
			System.out.println("프로그램 실행 try1");
			Class.forName("java.lang.String2");
//try 블럭에서 일단 실행문을 1번 실행
//에러가 없으면 catch블럭만 건너뛰고 순서대로 실행			
//에러가 나면 에러 나는 곳 직전까지 실행되고 catch 블럭으로 넘어감 
			System.out.println("프로그램 실행 try2");
		} catch(ClassNotFoundException e) {
			System.out.println("익셉션 발생!!!");
		} finally {
			System.out.println("무조건 실행");
//예외발생 여부 상관없이 finally 블럭은 무조건 실행
//try, catch에 return이 있어도 finally 블럭 실행
		}
		System.out.println("프로그램 실행2");

	}
}

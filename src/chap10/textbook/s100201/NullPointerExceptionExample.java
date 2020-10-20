package chap10.textbook.s100201;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		System.out.println("프로그램 실행중1");
		
		String data = null;
		
		if(data != null) {
		System.out.println(data.toString());
		}
		
		System.out.println("프로그램 실행중2");
//toString은 String 변수에 있는 문자열 자체를 출력하는 메소드
//data가 null, 즉 문자열 객체가 없기 때문에 메소드 실행 에러 발생
	}
}

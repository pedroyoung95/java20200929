package chap14.lecture.nested;

public class NestedEx1 {
	public static void main(String[] args) {
		final int i = 0;
		
		MyInterface i1 = () -> System.out.println("실행");
		
		MyInterface i2 = new MyInterface() {			
			@Override
			public void method() {
				System.out.println("로컬 변수 값: " + i); 
//				i = 3; 
//람다식은 메인 메소드 안에서 로컬 익명 객체를 만듬. 즉, 로컬클래스를 만드므로
//로컬 변수를 사용하게 되면 그 로컬 변수는 final로 정의됨
				System.out.println("실행2");
			};
		}; 
		
	}
}

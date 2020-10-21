package chap10.textbook.s100701;

public class BalanceInsufficientException extends Exception{
//일반 예외를 만들 시 -> Exception을 상속
//실행 예외를 만들 시 -> RuntimeException 상속
	public BalanceInsufficientException() {	}
//기본 생성자: 예외 객체를 만들기 위해 존재(필수로 있어야 하는 생성자)
	public BalanceInsufficientException(String message) {
		super(message); 
//String 파라미터를 받는 생성자: 예외메시지가 필요할 때 사용
//예외메시지가 필요 없다면 기본 생성자만 있어도 됨.
//부모 클래스인 Exception에 message가 들어감
//Exception클래스 변수인 e의 getMessage()메소드가 message를 읽음
	}
}

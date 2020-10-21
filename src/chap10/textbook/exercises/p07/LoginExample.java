package chap10.textbook.exercises.p07;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	public static void login(String id, String password) throws Exception {
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
//String 타입의 파라미터가 super()로 인해 Exception타입 변수 e의 메시지에 저장
//e.getMessage()가 저장된 파라미터를 읽어옴.
//throw: 예외를 발생시키는 키워드
//throws: 예외를 호출한 곳으로 떠넘기는 키워드
		}
		
		if(!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
//new 연산자 다음은 예외 클래스의 인스턴스 생성,
//즉 예외 생성이므로, throw 키워드가 붙어야 함 
	}
//throws Exception이므로 두 종류의 예외를 모두 떠넘길 수 있음.
}

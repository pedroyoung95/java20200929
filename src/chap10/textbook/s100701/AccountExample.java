package chap10.textbook.s100701;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
//사용자 정의 예외 클래스에서 super(message)의 값을 getMessage가 읽어옴
			System.out.println(message);
			System.out.println();
			
			e.printStackTrace(); 
//예외의 위치를 추적해주는 메소드. 반드시 작성
		}
	}
}

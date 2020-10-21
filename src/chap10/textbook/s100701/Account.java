package chap10.textbook.s100701;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{
		if(money>balance) {
			throw new BalanceInsufficientException("잔고부족:"+(money-balance)+"모자람");
//예외 객체를 만들기 위해 throw 키워드 뒤에 
//'new 예외이름()'형식으로 객체 생성
		}
	}
	
}

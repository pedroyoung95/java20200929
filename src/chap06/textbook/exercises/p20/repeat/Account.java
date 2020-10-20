package chap06.textbook.exercises.p20.repeat;

public class Account {
	String acn;
	String owner;
	int balance;
	
	public Account(String acn, String owner, int balance) {
		this.acn = acn;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAcn() {
		return acn;
	}

	public void setAcn(String acn) {
		this.acn = acn;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}

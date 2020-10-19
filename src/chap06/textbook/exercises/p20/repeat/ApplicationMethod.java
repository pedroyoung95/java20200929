package chap06.textbook.exercises.p20.repeat;

import java.util.Scanner;

public class ApplicationMethod {
	static Account2[] accountArray = new Account2[100];
	static Scanner scanner = new Scanner(System.in);
	static int size;
	
	static void createAccount() {
		System.out.println("--------");
		System.out.println("1.계좌생성 ");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String accountNo = scanner.next();
		System.out.print("계좌주: ");
		String accountOwner = scanner.next();
		System.out.print("초기입금액: ");
		int initialDeposit = scanner.nextInt();
		Account2 account = new Account2(accountNo, accountOwner, initialDeposit);
		
		accountArray[size] = account;
		size++;		
	}
	
	static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		for(int i = 0; i < size; i++) {
			Account2 account = accountArray[i];
			System.out.println(account.getAno() + "\t" + account.getOwner() + "\t" + account.getBalance());
		}
	}
	
	static void deposit() {
		System.out.println("--------");
		System.out.println("입금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String accountNo = scanner.next();
		System.out.print("입금액: ");
		int deposit = scanner.nextInt();
		findAccount(accountNo).setBalance(findAccount(accountNo).getBalance() + deposit);		
	}
	
	static void withdraw() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String accountNo = scanner.next();		
		System.out.print("출금액: ");
		int withdraw = scanner.nextInt();
		findAccount(accountNo).setBalance(findAccount(accountNo).getBalance() - withdraw);
	}
	
	static void balanceCheck() {
		System.out.println("--------");
		System.out.println("잔고확인");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String accountNo = scanner.next();
		for(int i = 0; i < size; i++) {
			if(accountArray[i].getAno().equals(accountNo)) {
				System.out.println(accountArray[i].getBalance());
			}
		}
	};
	
	static Account2 findAccount(String ano) {
		for(int i = 0; i < size; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}
}

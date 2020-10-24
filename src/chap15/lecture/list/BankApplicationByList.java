package chap15.lecture.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import chap06.textbook.exercises.p20.Account;

public class BankApplicationByList {
	static List<Account> accountList = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {		
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.println("---------------");
				System.out.println("계좌생성");
				System.out.println("---------------");
				System.out.print("계좌번호: ");
				String accountNo = scanner.next();
				System.out.print("계좌주: ");
				String accountOwner = scanner.next();
				System.out.print("초기입금액: ");
				int firstDeposit = scanner.nextInt();
				
				Account account = new Account(accountNo, accountOwner, firstDeposit);
				accountList.add(account);						
				
				System.out.println("계좌가 생성되었습니다.");
			}
			
			if(selectNo == 2) {
				System.out.println("---------------");
				System.out.println("계좌목록");
				System.out.println("---------------");
				for(int i = 0; i < accountList.size(); i++) {
					Account account = accountList.get(i);
					System.out.println(account.getAno() + "\t" + account.getOwner() + "\t" + account.getBalance());
				}
			}
			
			if(selectNo == 3) {
				System.out.println("---------------");
				System.out.println("입금");
				System.out.println("---------------");
				System.out.print("계좌번호: ");
				String accountNo = scanner.next();
				System.out.println("입금액: ");
				int deposit = scanner.nextInt();
				int added = findAccount(accountNo).getBalance() + deposit;
				findAccount(accountNo).setBalance(added); 
			}
			
			if(selectNo == 4) {
				System.out.println("---------------");
				System.out.println("입금");
				System.out.println("---------------");
				System.out.print("계좌번호: ");
				String accountNo = scanner.next();
				System.out.println("출금액: ");
				int withdraw = scanner.nextInt();
				int decrease = findAccount(accountNo).getBalance() - withdraw;
				findAccount(accountNo).setBalance(decrease); 
			}
			
			if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
	public static Account findAccount(String ano) {
		for(int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getAno().equals(ano)) {
				return accountList.get(i);
			}
		}
		return null;
	}
	
}

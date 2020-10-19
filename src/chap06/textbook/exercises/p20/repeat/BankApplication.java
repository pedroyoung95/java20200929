package chap06.textbook.exercises.p20.repeat;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
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
				System.out.println("초기입금액: ");
				int firstDeposit = scanner.nextInt();
				Account account = new Account(accountNo, accountOwner, firstDeposit);
				
				for(int i = 0; i < accountArray.length; i++) {
					if(accountArray[i] == null) {
						accountArray[i] = account;	
						break;
					}			
				}					
				System.out.println("계좌가 생성되었습니다.");
			}
			
			if(selectNo == 2) {
				System.out.println("---------------");
				System.out.println("계좌목록");
				System.out.println("---------------");
				for(int i = 0; i < accountArray.length; i++) {
					if(accountArray[i] != null) {
						Account list = accountArray[i];
						System.out.println(list.getAcn() + "\t" + list.getOwner() + "\t" + list.getBalance());
					}
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
				System.out.println("출금");
				System.out.println("---------------");
				System.out.print("계좌번호: ");
				String accountNo = scanner.next();				
				System.out.println("출금액: ");
				int deposit = scanner.nextInt();
				int added = findAccount(accountNo).getBalance() - deposit;
				findAccount(accountNo).setBalance(added);
			}
			
			if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
	public static Account findAccount(String ano) {
		for(int i = 0; i < accountArray.length; i++) {
			if(ano.equals(accountArray[i].getAcn())) {
				return accountArray[i];
			}
		}
		return null;
	}
}

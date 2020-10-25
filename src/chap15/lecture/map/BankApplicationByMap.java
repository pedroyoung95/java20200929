package chap15.lecture.map;

import chap06.textbook.exercises.p20.Account;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BankApplicationByMap {
	private static Map<String, Account> accountMap = new HashMap<>();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------"); 
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				System.out.println("---------------"); 
				System.out.println("계좌생성");
				System.out.println("---------------");
				System.out.print("계좌번호: ");
				String acn = scanner.next();
				System.out.print("계좌주: ");
				String owener = scanner.next();
				System.out.print("초기입금액: ");
				int firstDeposit = scanner.nextInt();
				System.out.print("계좌비밀번호: ");
				String password = scanner.next();
				
				accountMap.put(password, new Account(acn, owener, firstDeposit));				
				System.out.println("계좌생성이 완료되었습니다.");
			}
			if (selectNo == 2) {
				System.out.println("---------------");
				System.out.println("계좌목록");
				System.out.println("---------------");
				Set<String>passwordSet = accountMap.keySet();
				for(String password : passwordSet) {
					Account account = accountMap.get(password);
					System.out.println(account.getAno() + "\t" + account.getOwner() + "\t" + account.getBalance());
				}
			}
			if (selectNo == 3) {
				System.out.println("---------------");
				System.out.println("입금");
				System.out.println("---------------");
				System.out.print("비밀번호: ");
				String password = scanner.next();
				System.out.print("입금액: ");
				int deposit = scanner.nextInt();
				Account account = findAccount(password);
				int added = account.getBalance() + deposit;
				account.setBalance(added);
			}
			if (selectNo == 4) {
				System.out.println("---------------");
				System.out.println("출금");
				System.out.println("---------------");
				System.out.print("비밀번호: ");
				String password = scanner.next();
				System.out.print("출금액: ");
				int withdraw = scanner.nextInt();
				Account account = findAccount(password);
				if(withdraw<account.getBalance()) {
					int withdrew = account.getBalance() - withdraw;
					account.setBalance(withdrew);
				} else {
					System.out.println("한도를 초과했습니다");
				}				
				
			}
			if (selectNo == 5) {
				run = false;
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
	public static Account findAccount(String password) {
		Set<String> passwordSet = accountMap.keySet();
		for(String passwordKey : passwordSet) {
			if(password.equals(passwordKey)) {
				return  accountMap.get(passwordKey);
			}
		}
		return null;
	}

}

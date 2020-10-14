package chap06.textbook.exercises.p20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int size; 
	//static을 써야 현재 클래스에서 사용 가능, 초기값은 0
		
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	//createAccount
	private static void createAccount() {
		System.out.println("---------------");
		System.out.println("계좌생성");
		System.out.println("---------------");	
		
		System.out.print("계좌번호: ");
		String accountNo = scanner.next();
//nextLine으로 하면 해당 줄에 있는 모든 string을 읽어버림
		System.out.print("계좌주: ");
		String accountOwner = scanner.next();			
		System.out.print("초기입금액: ");
		int initialDeposit = scanner.nextInt();
		
		Account account = new Account(accountNo, accountOwner, initialDeposit);
		accountArray[size] = account;
		size++;
		
//accountArray배열에 Account객체를 담음으로써,
//accountArray배열 원소 찾기를 통해 Account객체에 접근 가능
//accountArray[] 괄호 안 인덱스번호를 변수로 할당함으로써, 
//아무런 위치에 Account객체의 참조값이 들어가도록 함.
//계좌를 생성할 때마다 그 다음 인덱스번호에 Account객체를 넣도록 size++추가
//값을 할당하지 않은 int 변수이기 때문에, 초기값 0부터 시작
		
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	
	//acocuntList
	private static void accountList() {
		System.out.println("---------------");
		System.out.println("계좌목록");
		System.out.println("---------------");
		
		for(int i = 0; i < size; i++) {
			Account cur = accountArray[i];
			System.out.println(cur.getAno() + "\t" + cur.getOwner() + "\t" + cur.getBalance());
		}
		
	}
	
	private static void deposit() {
		System.out.println("---------------");
		System.out.println("예금");
		System.out.println("---------------");
				
		System.out.println("계좌번호: ");
		String ano = scanner.next();
		System.out.println("예금액: ");
		int money = scanner.nextInt();
		
		Account cur = findAccount(ano);
		int sum = cur.getBalance() + money;
		cur.setBalance(sum);
		
		System.out.println("예금이 성공되었습니다.");
		
	}
	
	private static void withdraw() {
		System.out.println("---------------");
		System.out.println("출금");
		System.out.println("---------------");
		
		String ano;
		int money;
		
		System.out.println("계좌번호: ");
		ano = scanner.next();
		System.out.println("출금액: ");
		money = scanner.nextInt();
		
		Account cur = findAccount(ano);
		int sum = cur.getBalance() - money;
		if(sum<=0) {
			System.out.println("잔고가 부족합니다");
			return;
		} else {
			cur.setBalance(sum);
		}
		
		System.out.println("출금이 성공되었습니다.");
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		for(int i = 0; i < size; i++) {
//size의 초기값이 0이므로, 계좌를 생성할 때마다 1개씩 증가해서 
//계좌 개수=size임. 따라서 for도 계좌 개수만큼 반복
			if(accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
//리턴타입이 클래스 참조 타입이므로, 참조값이 없을 때의 기본값인 null 사용.
	}
}

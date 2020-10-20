package chap06.textbook.exercises.p20.repeat;

public class BankApplication2 extends ApplicationMethod{		
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.잔고확인 | 6.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}
			
			if(selectNo == 2) {
				accountList();
			}
			
			if(selectNo == 3) {
				deposit();
			}
			
			if(selectNo == 4) {
				withdraw();
			}
			
			if(selectNo == 5) {
				balanceCheck();
			}
			
			if(selectNo == 6) {
				run = false;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}

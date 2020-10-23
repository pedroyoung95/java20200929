package chap15.lecture.list;

import chap06.textbook.exercises.p20.Account;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
	private static List<Account> accountList = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
		}
	}
	
}

package chap04.exercises;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		
//		System.out.println("입력");
//		String line=scanner.nextLine();
//		
//		System.out.println("출력");
//		System.out.println(line);
//		
//		int num = Integer.valueOf(line);
//		기본 타입들은 전부 동명의 클래스를 보유
//		특정 기본 타입으로 값을 변경하고 싶으면///		Double.valueOf(바꾸려는 대상)의 형태로 작성
//		int i = line * 2;
//		System.out.println(i);
		
		boolean run=true;
		
		int balance=0;
		
		Scanner scanner=new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------");
			System.out.print("선택> ");
			
			String line = scanner.nextLine();
			if(line.equals("1")) {
				System.out.print("예금액>");	
				String money1 = scanner.nextLine();
				int num1 = Integer.valueOf(money1);
				balance+=num1;
				System.out.println();
			}
			if(line.equals("2")) {
				System.out.print("출금액>");	
				String money2 = scanner.nextLine();
				int num2 = Integer.valueOf(money2);
				balance-=num2;
				System.out.println();
			}
			if(line.equals("3")) {
				System.out.print("잔고>");	
				System.out.println(balance);
				System.out.println();
			}
			if(line.equals("4")) {
				run=false;
				System.out.println();
				System.out.println("프로그램 종료");
			}
		}
	}
	
	

}

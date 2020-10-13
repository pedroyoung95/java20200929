package myProject.game;

import java.util.Scanner;

public class BlackJack {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int startNum1;
		int startNum2;
		int startSum;
		int DrawNum;
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.DrawCard | 2.UnDraw | 3.double | 4.All in | 5.Balance | 6. GameEnd");
			System.out.println("0.GameStart | 9. GameEnd");
			System.out.println("-------------------------");
			System.out.print("Choose>");
			
			int selectNo = scanner.nextInt();
		
			if(selectNo == 0) {
				startNum1 = (int)(Math.random()*21)+1;
				startNum2 = (int)(Math.random()*21)+1;
				startSum = startNum1 + startNum2;
				if(startSum>=21) {
					System.out.println("카드를 다시 뽑습니다.");				
				} else {
					System.out.println(startNum1);
					System.out.println(startNum2);
				}
			}
			
			if(selectNo == 1) {
				DrawNum = (int)(Math.random()*21)+1;
				if(startSum+DrawNum > 21) {
					run=false;
					System.out.println("21이 넘어 패배했습니다.");
				} else if(startSum+DrawNum == 21) {
					run=false;
					System.out.println("블랙잭, 게임에서 이겼습니다."));
				}
			}
			
			if(selectNo == 9) {
				run=false;
			}
		}
		System.out.println("블랙잭을 종료합니다.");
	}
}

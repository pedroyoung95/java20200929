package myProject.game;

import java.util.Scanner;

public class ThreeSixNineGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int score = 1;
		
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.숫자 외치기 | 2.박수 | 5.종료");
			System.out.println("-------------------------");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1 || selectNo == 2) {
				if(selectNo==1 && score%3==0) {
					run=false;
				} else if(selectNo==2 && score%3!=0) {
					run=false;
				}
				score++;				
			}
			
			if(selectNo == 5) {
				run=false;				
			}
			
		}
		int lastscore = score - 1;
		System.out.println("마지막 숫자 : " + lastscore);
		System.out.println("게임 종료");
		
	}

}

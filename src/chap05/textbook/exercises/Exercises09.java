package chap05.textbook.exercises;

import java.util.Scanner;

public class Exercises09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수>");
				int num1 = scanner.nextInt();
				studentNum += num1;
				scores = new int[studentNum];
				System.out.println();
				
			} else if(selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+ i + "]>");
					int num2 = scanner.nextInt();
					scores[i] += num2;					
				}
				System.out.println();
				
			} else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+ i + "]: " + scores[i]);	
					System.out.println();
				}
				System.out.println();
				
			} else if(selectNo == 4) {
				int max=0;
				int min=100;
				int sum=0;
				for(int i=0; i<scores.length; i++) {			
					max=Math.max(max, scores[i]);
					min=Math.min(min, scores[i]);
					sum+=scores[i];
				}
				System.out.println("최고 점수: " + max);
				System.out.println("최저 점수: " + min);
				double avg = (double)sum / scores.length;
				System.out.println("평균 점수: " + avg);
				System.out.println();
				
			} else if(selectNo == 5) {
				run = false;
			}			
		}
		
		System.out.println("프로그램 종료");
	}
	
}

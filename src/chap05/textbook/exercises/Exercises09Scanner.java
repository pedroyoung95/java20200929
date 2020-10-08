package chap05.textbook.exercises;

import java.util.Scanner;

public class Exercises09Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력>");
		String str = scanner.nextLine();
//		입력값으로 문자열을 받는 scanner
		int val = Integer.valueOf(str);		
		
		System.out.println("출력>");
		System.out.println(str);
		System.out.println(val);
		
		System.out.println("정수입력>");
		val = scanner.nextInt();
//		입력값으로 정수를 받는 scanner
//		nextDouble, nextBoolean 등 기본타입별로 존재
		System.out.println("정수 출력>");
		System.out.println(val);
	}
}

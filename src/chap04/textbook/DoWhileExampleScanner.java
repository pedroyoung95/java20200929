package chap04.textbook;

import java.util.Scanner;

public class DoWhileExampleScanner {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("입력");
		
		String line=scanner.nextLine();
//		enter발견 전까지 입력된 내용을 다 읽는 scanner 객체의 method
//		enter를 입력하면 내용을 읽고 다음 statement를 실행
		
		System.out.println("출력");
		System.out.println(line);
//		scanner가 읽은 내용을 string값으로 갖는 변수의 값을 출력
	}
}

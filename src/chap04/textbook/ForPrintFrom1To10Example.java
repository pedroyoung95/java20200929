package chap04.textbook;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		
//		초기식->조건식->code block->증감식->조건식
//		조건식의 값이 false가 될 때까지 반복
		
		// 1~10
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		//11~20
		for(int i=11; i<21; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		//1~9 홀수만
		for(int i=0; i<5; i++) {
			System.out.println(2*i+1);
		}
		System.out.println();
		
		//10~1
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}
		System.out.println();
		
		//10~2 짝수만
		for(int i=5; i>0; i--) {
			System.out.println(2*i);
		}
	}
}

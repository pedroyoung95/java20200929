package chap04.textbook;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		int i=1;
		for(; i<=100; i++) {
			sum +=i;
		}
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}

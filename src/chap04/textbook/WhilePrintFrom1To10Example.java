package chap04.textbook;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		//11~20
		int j=11;
		while(j<=20) {
			System.out.println(j);
			j++;
		}
		System.out.println();
		
		//1~9 홀수만
		int k=1;
		while(k<=10) {
			System.out.println(k);
			k+=2;
		}
		System.out.println();
		
		//10~1
		int l=10;
		while(l>=1) {
			System.out.println(l);
			l--;
		}
		System.out.println();
		
		//10~2 짝수만
		int m=10;
		while(m>=1) {
			System.out.println(m);
			m-=2;
		}
	}
}

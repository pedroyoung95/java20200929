package chap03.binary;

public class LogicalOperator {
	public static void main(String[] args) {
		//논리연산자
		//&&, & and
		//||, | or
		//^ xor (exclusive or, 배타적 논리합): 서로 다를 때만 true
		System.out.println("====and====");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		
		System.out.println("====or====");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		
		System.out.println("====xor====");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("======= & | =======");
		int a = 3;
		System.out.println(false & false);
		System.out.println(false & true);
		System.out.println((a < 0) & (a++ < 0));
		System.out.println(a);
//		&는 앞 부분이 false여도 뒷부분을 판단함
		
		System.out.println("======= && || =======");
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println((a < 0) && (a++ < 0));
		System.out.println(a);
//		&&는 앞 부분이 false면 뒷부분 판단X
		
	}
}

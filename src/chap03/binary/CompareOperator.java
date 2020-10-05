package chap03.binary;

public class CompareOperator {
	public static void main(String[] args) {
		//비교 연산자
		// == != < <= > >=
		//결과 boolean
		
		int a = 3;
		int b = 5;
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a > b);
		System.out.println(a >= b);
		
		double c = 3.0;
		System.out.println(a == c);
//		다른 type인 경우, 더 큰 type으로 변환해서 비교
		
		float d = 0.1F;
		double e = 0.1;
		System.out.println(d == e);
//		실수 간 비교는 저장공간의 차이로 인해 예상치 못 한 값이 나올 수 있음
	}
}

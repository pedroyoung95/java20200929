package chap03.textbook;

public class CheckOverflowExample {
	public static void main(String[] args) {
//		main method 부분
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
//			safeAdd method의 결과를 값으로 갖는 변수 result
		} catch(ArithmeticException e) {
//			예외 발생시 잡아내서 실행문 실행
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
//			safeAdd method에서 예외를 발생시키므로 출력문 실행
		}
	}
	
	public static int safeAdd(int left, int right) {
//		main method 안 safeAdd method 부분
		if((right>0)) {
			if(left>(Integer.MAX_VALUE - right)) {
//				right 값이 0보다 크므로 하위 if를 실행
//				left + right>Integer.MAX_VALUE 라는 식으로 보면
//				두 값의 합이 int 최대값을 넘는지 확인하는 식
				throw new ArithmeticException("오버플로우 발생");
//				int의 최대값에서 right를 뺀 것이 left보다 크면
//				"오버플로우 발생"이라는 예외를 발생시킴
			}
		}
		return left + right;
//		right 값이 0보다 작을 경우 실행되는 return
	}
}

package chap09.textbook.s090503;

public class Anonymous {
	private int field;
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
//		arg1 = 20;
//		arg2 = 20;
		
//		var1 = 30;
//		var2 = 30;
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
//인터페이스 이름으로 익명 구현 객체를 생성
//익명 구현 객체의 몸통{} 안에서 sum 메소드를 재정의
//익명 구현 객체는 실행되고 사라져버리므로
//로컬클래스처럼 지역변수와 parameter를 final로 인식
		
		System.out.println(calc.sum());
	}
}

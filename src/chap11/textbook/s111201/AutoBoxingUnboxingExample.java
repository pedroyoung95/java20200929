package chap11.textbook.s111201;

public class AutoBoxingUnboxingExample {
	public static void main(String[] args) {
		//자동 Boxing
		Integer obj = 100;
//기본 타입은 참조 타입에 할당X
//단, 8개의 Wrapper클래스는 예외로 자동으로 할당 가능
		System.out.println("value: " + obj.intValue());
		
		//대입 시 자동 Unboxing
		int value = obj;
		System.out.println("value: " + value);
		
		//연산 시 자동 Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}

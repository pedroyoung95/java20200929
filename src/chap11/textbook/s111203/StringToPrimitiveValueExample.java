package chap11.textbook.s111203;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
//사용자로부터 데이터를 받을 때, 문자열 데이터를 받게 됨
//기본타입으로 변환할 필요가 있을 때 'parse+기본타입'메소드 사용
		
		int i = Integer.valueOf("100");
//valueOf(): 참조 타입으로 리턴(Wrapper클래스타입으로 리턴)
//parse~(): 기본 타입으로 리턴
//
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
	}
}

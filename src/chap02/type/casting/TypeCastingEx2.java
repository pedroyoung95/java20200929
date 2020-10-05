package chap02.type.casting;

public class TypeCastingEx2 {
	public static void main(String[] args) {
		int intValue = 3;
		long longValue = 55;
		
//		int intValue2 = intValue + longValue;
		long intValue2 = intValue + longValue;
		//연산 시 더 큰 타입으로 자동변환
		
		double doubleValue = 3.14;
		
//		int intValue3 = intValue + doubleValue;
		double intValue3 = intValue + doubleValue;
		//결과값이 실수이므로 연산값은 실수타입으로 형변환
		
		// 정수의 연산결과는 int(피연산자를 4byte 단위로 저장하기 때문)
		short shortValue1 = 3;
		short shortValue2 = 5;
		
//		short shortValue3 = shortValue1 + shortValue2;
		int shortValue3 = shortValue1 + shortValue2;
		
	}
}

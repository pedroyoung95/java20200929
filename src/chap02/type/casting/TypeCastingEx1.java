package chap02.type.casting;

public class TypeCastingEx1 {
	public static void main(String[] args) {
		// primitive type 8개
		
		// 1byte   2byte  4byte 8byte
		// boolean char
		// byte	   short  int	long
		//			      float double
		
		byte byteValue = 3;
		short shortValue = 129;
		int intValue = 1000000;
		long longValue = 10000000000L;
		
		// 자동 형변환
		shortValue = byteValue;
		intValue = shortValue;
		longValue = intValue;
		
		// 강제 형변환
		longValue = 2300000000L;
		intValue = (int) longValue; 
		// 강제 형변환을 위해서 변환할 타입을 명시
		System.out.println(intValue);
		
		// 자동형변환 (정수 -> 실수)
		float floatValue = 0.0F;
		double doubleValue = 0.0;
		
		doubleValue = intValue;
		floatValue = intValue;
		//같은 4byte이지만 정수 담는 부분에 차이가 있어서 값 손실이 있을 수 있음
		
		longValue = 9223372036854775807L;
		floatValue = longValue;
		System.out.println(floatValue);
		//float은 실수이므로, long보다 표현범위가 넓어서 자동 형변환
		//큰 범위를 표현하지만, 값을 잃어버릴 수 있음
		
		doubleValue = longValue;
		
		// 강제 형변환 (실수 -> 정수)
		intValue = (int) floatValue; //소숫점 이하는 버림
		
	}
}

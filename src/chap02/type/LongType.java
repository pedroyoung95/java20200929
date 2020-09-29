package chap02.type;

public class LongType {
	public static void main(String[] args) {
		// long : 8byte(64bit)
		// 최대값 : 9223372036854775807
		// 최소값 : -9223372036854775808
		
		long longValue;
		longValue = 9223372036854775807L;
		//int 범위를 넘은 리터럴은 입력 불가
		//int가 아닌 long 리터럴임을 표시하기 위해 맨 뒤에 L 추가
		System.out.println(longValue);
		
		longValue = 9_223_372_036_854_775_807L;
		
		longValue = -9223372036854775808L;
		System.out.println(longValue);
	}
}

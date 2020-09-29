package chap02.type;

public class IntType {
	public static void main(String[] args) {
		// int : 4byte(32bit)
		// 최대 : 2147483647
		// 최소 : -2147483648
		
		int intValue = 2147483647;
		System.out.println(intValue);
		
		intValue++;
		System.out.println(intValue); //정수값을 넘어가므로 -값이 나옴
		
		intValue = -2147483648;
		System.out.println(intValue);
		
		//정수 리터럴
		intValue = 2147483647;
		intValue = 2_147_483_647;//comma 대신 밑줄로 자릿수 표기
		intValue = 017777777777;
		System.out.println(intValue);
		
		intValue = 0x7FFFFFFF;
		System.out.println(intValue);
	}
}

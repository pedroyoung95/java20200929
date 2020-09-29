package chap02.type;

public class ByteType {
	public static void main(String[] args) {
		// byte : 정수형
		// 크기 : 1byte(8bit)
		
		// -128 : 1000 0000
		//    :
		// -3 : 1111 1101
		// -2 : 1111 1110
		// -1 : 1111 1111 
		
		//  +           1
		//  = 1'0000 0000' -> 자릿수 초과로 맨 앞 1을 버림
		
		// 0 : 0000 0000
		// 1 : 0000 0001
		// 2 : 0000 0010
		//   :
		// 127 : 0111 1111
		
		// +1
		
		// -128 : 1000 0000
		
		byte byteValue;
		
		byteValue = 0;
		System.out.println(byteValue);
		byteValue = 127;
		System.out.println(byteValue);
//		byteValue = 128; //저장할 수 없는 값이므로 compile 오류
		
		byteValue++;
		System.out.println(byteValue);
	}
}

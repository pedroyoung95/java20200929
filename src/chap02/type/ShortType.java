package chap02.type;

public class ShortType {
	public static void main(String[] args) {
		// short : 2byte
		short shortValue1;
		shortValue1 = 32767;
		System.out.println(shortValue1);
		
//		shortValue1 = 32768; //32767까지만 저장 가능
		shortValue1 = -32768;
		System.out.println(shortValue1);
		
	}
}

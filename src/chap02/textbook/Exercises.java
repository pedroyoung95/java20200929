package chap02.textbook;

public class Exercises {
	public static void main(String[] args) {
		//교제 60~62쪽
		//1번 문제
		int newVar;
//		System.out.println(newVar); 초기값이 없으면 저장X
		
		//2번 문제
		int modelName;
		int $value;
		int _age;
		
		//3번 문제
		//정수타입 : byte / short,char / int / long
		//실수타입 : 				   float / double
		//논리타입 : boolean
		
		//4번 문제
		int age;
		age = 10;
		double price = 3.14;
		//타입 : int, double
		//변수명 : age, price
		//리터럴 : 10, 3.14
		
		//5번 문제
		byte byteValue = 10;
		char charValue = 'A';
		
		int intValue = byteValue;
		int intValue1 = charValue;
		short shortValue = charValue;
		double doubleValue = byteValue;
		
		//6번 문제
		int intValue2 = 10;
		char charValue1 = 'A';
		double doubleValue1 = 5.7;
		String strValue = "A";		
		
		double var = (double)intValue2;
		byte var1 = (byte)intValue2;
		int var2 = (int)doubleValue;
		char var3 = (char)strValue; //참조타입은 기본타입과 형변환 불가
		
		//7번 문제
//		char var4 = ''; -> char 타입은 공백포함 아무 글자라도 가져야 함
		
		//8번 문제
		byte byteValue1 = 10;
		float floatValue = 2.5F;
		double doubleValue2 = 2.5;
		
		byte result = byteValue1 + byteValue1; // 정수결과값은 int로 저장
		int result1 = byteValue1 + byteValue1;
	}
}

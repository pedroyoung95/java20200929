package chap02.type;

public class CharType {
	public static void main(String[] args) {
		// char : 2byte
		// 작은 따옴표를 이용해 하나의 문자를 표현
		
		char charValue;
		charValue = 'a'; 
		System.out.println(charValue);
		
//		charValue = 'ab'; ->작은 따옴표는 단 하나의 문자만 표현 가능
//		charValue = ''; ->작은 따옴표는 반드시 하나의 값을 가져야 함
		charValue = ' ';
		
		charValue = 44032; //유니코드를 값으로 가져서 글자가 반환
		System.out.println(charValue);
		
		charValue = '나';
		System.out.println(charValue);
		
		charValue = '\uac00'; //16진법 ac00=10진법 44032
		System.out.println(charValue);
	}
}

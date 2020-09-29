package chap02.textbook;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041'; //16진법 유니코드: \u + 16진법 수
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		char c7 = '♥' // emoji도 문자로 취급
		
		
		int uniCode = c1; //유니코드 얻기
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
		
	}
}

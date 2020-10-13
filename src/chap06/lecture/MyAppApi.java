package chap06.lecture;

import java.util.Comparator;

public class MyAppApi {
	public static void main(String[] args) {
		String s = new String("java");
//String 클래스는 내장된 클래스 -> 따로 클래스를 만들지 않아도 객체 생성 가능
//String 클래스로 만든 객체는 String 클래스의 필드, 메소드, 생성자 사용 가능
		Comparator<String> a = s.CASE_INSENSITIVE_ORDER;
//java api에 있는 String 클래스의 field
		
		String t = new String(new char[] {'h', 't', 'm', 'l'});
		System.out.println(t);
		char c = t.charAt(1);
//java api에 있는 String 클래스의 method인 charAt
		System.out.println(c);
	}
}

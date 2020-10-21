package chap11.object.toString;

public class ToStringEX2 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		o1.setFields(30, "hong", "123");
//MyClass에서 재정의한 toString()메소드가 실행됨
		
		MyClass o2 = new MyClass();
		o2.setFields(20, "kim", "321");
		
		System.out.println(o1);
		System.out.println(o2);
	}
}

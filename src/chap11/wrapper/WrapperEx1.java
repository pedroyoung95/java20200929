package chap11.wrapper;

public class WrapperEx1 {
	public static void main(String[] args) {
		//byte, short, int, long
		//float, double, char, boolean,
		
		//Wrapper Class 이름
		//Byte, Short, Interger, Long
		//Float, Double, Character, Boolean
		
		int i = 1;
		
		Integer in = Integer.valueOf(i);
//변수 i의 값을 Wrapper클래스인 Integer에 할당(Integer로 Wrapping함)
//Integer클래스는 Object클래스를 부모로 두기 때문에
//Object타입에 할당 가능
//최근 버전은 Wrapper클래스로 감싸는 boxing,
//기본 타입으로 다시 풀어내는 unboxing이 자동처리 됨.
		method1(in);
		
		int j = 2;
		method1(j);
		
		int l = in.intValue();
		int k = in;
		
		Integer in2 = 3;
		int m = in2;
	}
	
	public static void method1(Object o) {
		System.out.println(o);
	}
}

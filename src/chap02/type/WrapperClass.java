package chap02.type;

public class WrapperClass {
	public static void main(String[] args) {
		// Byte, Short, Integer, Long
		// Float, Double
		// Character, Boolean
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		//float, double의 최소, 최대값은 양수만 보여줌.
		System.out.println(Float.MIN_VALUE); 
		System.out.println(Float.MAX_VALUE);
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
	}
}

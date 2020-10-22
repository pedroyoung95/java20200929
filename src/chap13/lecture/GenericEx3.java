package chap13.lecture;

public class GenericEx3 {
	public static void main(String[] args) {
		GenericEx3.<String>method("java");
		method("hello"); //매개값을 보고 타입을 유추
		method(3);
		
		String s = method2();
		int i = method2();
	}
	
	public static <T> T method2() {
		return null;
	}
	
	public static <T> void method(T t) {
		System.out.println(t);
	}
}

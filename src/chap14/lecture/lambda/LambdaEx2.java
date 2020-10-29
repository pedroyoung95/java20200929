package chap14.lecture.lambda;

public class LambdaEx2 {
	public static void main(String[] args) {
		MyInterface o1 = () -> {
			System.out.println("hello");
			System.out.println("world");
		};
		
		MyInterface o2 = () -> System.out.println("java");
		MyInterface o3 = () -> System.out.println("jsp");
		
		o1.method();
		o2.method();
		o3.method();
	}
}


package chap14.repeat.lambda;

public class LambdaEx1 {
	int outterField;
	static int outterField2;
	
	public static void main(String[] args) {
		MyInterface i1 = new MyInterface() {
			
			@Override
			public void method() {
				System.out.println("람다식 사용 안하고 인터페이스 구현 객체 생성 후 재정의");
			}
		};
		i1.method();
		
		MyInterface i2 = () -> System.out.println("람다식으로 간단하게 구현 객체 생성 및 재정의");		
		i2.method();
		
		MyInterface2 i3 = (int i) -> System.out.println(i);
		i3.method(3);
		MyInterface2 i4 = i -> System.out.println(i * 10);
		i4.method(4);
		
		MyInterface3 i5 = (String a, int b) -> {
			System.out.println(a);
			System.out.println(a+b);
		};
		i5.method("java", 8);
		MyInterface3 i6 = (a, b) -> System.out.println(a + b);
		i6.method("html", 9);
		
		MyInterface4 i7 = (x, y) -> {return x * y;};		
		System.out.println(i7.method(3, 5));
		
		MyInterface5 i8 = x -> {
			int y = x * 4;
			return y;
		};
		System.out.println(i8.method(4));
		
		int i = 2;
		MyInterface i9 = () -> {
//			i = 3;
//			args = new String[3];
			outterField2 = 3;
			System.out.println(i);
			System.out.println(args);	
			System.out.println(outterField2);
		};
		i9.method();
	}
	void method() {
		MyInterface i9 = () -> {
			int outterField = 5;
			System.out.println(outterField);
			System.out.println(LambdaEx1.this.outterField);
			System.out.println(LambdaEx1.outterField2);
		};
	}
}

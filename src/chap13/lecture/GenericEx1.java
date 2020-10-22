package chap13.lecture;

public class GenericEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		o1.method1();
		o1.method2(new Object());
		o1.method2("java");
		o1.method2(100);
		
		MyClass<String> o2 = new MyClass<>();
//<T>의 T자리(타입 파라미터)에 특정 타입을 넣어야 완성
//객체 생성 시 T는 앞 쪽 한 개만 적어도 됨 
		o1.method1();
		o2.method2("java");
		//o2.method2(new Object()); //String이 아닌 파라미터는 안 됨
		
		MyClass<Integer> o3 = new MyClass<Integer>();
		o3.method2(100);
		//o3.method2("java"); //Integer가 아닌 파라미터는 안 됨
		
	}
}

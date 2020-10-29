package chap14.lecture.parameter;

public class ParameterEx2 {
	public static void main(String[] args) {
		MyInterface2 o1 = (int a, int b) -> System.out.println(a+b);
		o1.method(3, 10); //parameter가 여러 개인 경우도 한 개인 경우랑 동일
		
		MyInterface2 o2 = (a, b) -> System.out.println(a+b);
		o2.method(15, 5);
		
//		MyInterface2 o3 = a, b -> System.out.println(a+b); 소괄호 생략X
	}
}

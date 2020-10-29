package chap14.lecture.parameter;

public class ParameterEx1 {
	public static void main(String[] args) {
		MyInterface1 o1 = (int a) -> System.out.println(a);
//추상메소드의 파라미터가 있는 경우, ()안에 똑같이 명시하면 됨
		o1.method(9);
		
		MyInterface1 o2 = (i) -> System.out.println(i);
//추상메소드의 파라미터의 타입을 생략하고 변수명만 기입가능
		o2.method(3);
		
		MyInterface1 o3  = x -> System.out.println(x);
//추상메소드의 파라미터가 한 개라면 타입과 소괄호까지 생략 가능
		o3.method(10);
	}
}

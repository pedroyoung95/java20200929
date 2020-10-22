package chap13.lecture;

public class MyClass<T> {
//T = Type parameter -> 타입을 파라미터로 받음
//T에 특정 타입을 넣으면 모든 T는 그 타입을 따르게 됨.
//T에 아무 타입도 넣지 않으면 자동으로 Object 타입이 됨(최상위 클래스이므로)
//클래스, 인터페이스 등에서 T를 정의하면 
//그 멤버들은 T를 타입으로 자유롭게 사용
	public void method1() {
		System.out.println("메소드1");
	}
	
	public void method2(T s) {
		System.out.println(s);
	}
}

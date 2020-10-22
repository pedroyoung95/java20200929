package chap13.lecture;

public class MyClass2<T extends Number> {
//extends로 특정 타입을 T가 상속받으면 그 타입으로 T를 한정
//Number를 상속받았으므로, Number의 메소드를 안전하게 사용 가능
	void method1(T t) {
		System.out.println(t.doubleValue());
	}
}

package chap06.lecture.method;

public class MyClassReturn {
	int var1;
	
	void method1() {
		System.out.println("메소드1 실행");
	}
	
	int method2() {
		System.out.println("메소드2 실행");
		
		//return : method 종료, 오른쪽에 있는 값을 호출한 곳으로 반환
		return var1*2;
//		System.out.println("실행"); -> return 이후는 실행X
//메소드 앞 리턴타입은 리턴값의 타입에 맞는, 변환 가능한 타입이어야 함
//리턴타입이 명시되어있는데 return이 없어도 컴파일 에러
	}
}

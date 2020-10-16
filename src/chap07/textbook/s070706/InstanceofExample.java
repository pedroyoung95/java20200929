package chap07.textbook.s070706;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
//parentA변수는 Child타입의 인스턴스를 할당받았으므로
//method1,2 모두에서 변환 성공
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
//parentB변수는 Parent타입의 인스턴스를 할당받았으므로
//method1,2 모두에서 변환 실패
	}
}

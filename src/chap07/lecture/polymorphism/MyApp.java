package chap07.lecture.polymorphism;

public class MyApp {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.cry();
		KindaCat k1 = t1;
//k1 변수의 클래스가 t1 인스턴스의 부모이므로 t1을 k1에 할당 가능
//그 반대는 불가능
		k1.cry();
//k1은 고양이과 클래스 변수이지만 t1 인스턴스가 대입되었으므로
//인스턴스의 메소드가 실행됨
//		t1 = k1;
		
		Cat c1 = new Cat();
		c1.cry();
		KindaCat k2 = c1;
//		c1 = k2;
		
//		c1 = t1;
//		t1 = c1;
	}
}

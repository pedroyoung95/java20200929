package chap08.lecture.interfaceKeyword;

public class MyApp {
	public static void main(String[] args) {
		KindaCat c1 = new Cat();
		KindaCat c2 = new Tiger();
		
		KindaDog d1 = new Malamute();
		KindaDog d2 = new Wolf();
		
		c1.cry();
		c2.cry();
		
		d1.bark();
		d2.bark();
		
		Pet p1 = new Malamute();
		Pet p2 = new Cat();
//인터페이스 구현이 된 클래스의 인스턴스는 인터페이스 타입변수에 저장 가능 
		
		p1.sit();
		p2.sit();
		
		Cat cat1 = (Cat) p2;
		Malamute mal1 = (Malamute) p1;
//인터페이스에서도 강제 형변환 가능		
		System.out.println(p2 instanceof Cat);
		System.out.println(p1 instanceof Malamute);
//instanceof로 검사 가능
		
		
	}
	
	
}

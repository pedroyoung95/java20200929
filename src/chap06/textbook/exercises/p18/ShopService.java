package chap06.textbook.exercises.p18;

public class ShopService {
	private static ShopService o1 = new ShopService();
//ShopServiced 객체를 만드는 걸 변수 o1에 담음
//private이기 때문에 필드값 변경X

	
	private ShopService() {}
//생성자를 private으로 설정하면 싱글톤 생성가능
	
	static ShopService getInstance() {
		return o1;
	}
//getInstance()를 호출하면 객체 생성이 담긴 변수 o1이 반환되어서 객체 생성
}

//하나의 객체만 만드는 방법: 싱글톤
//1. 생성자를 private으로 만든다
//2. getInstance() 메소드를 만든다
//3. 메소드가 접근불가능한 객체를 만드는 변수를 호출하도록 한다.
//4. new 연산자를 통해 클래스의 객체를 만들고 메소드가 호출할 변수에 담는다.
//5. 다른 클래스에서 getInstance로 동일한 하나의 객체를 생성해서 변수에 담는다.

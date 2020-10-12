package chap06.lecture.field;

public class FieldEx101 {
	public static void main(String[] args) {
		int i;
		i = 3;
		
		Car c1 = new Car();
		c1.name = "kia";
		c1.model = "k7";
		c1.price = 500;
//Car 클래스에 name, model, price라는 필드를 정의해줬기 때문에 값 저장이 가능
//필드는 .(dot)을 통해 변수명과 필드명을 연결
		
		System.out.println(c1.name);
		System.out.println(c1.model);
		System.out.println(c1.price);
		
		Car c2 = new Car();
		System.out.println(c2.name);
//클래스의 필드는 초기화 하지 않아도 초기값이 기본적으로 존재(배열과 동일)
		System.out.println(c2.price);
		c2.name = "ford";
		c2.price = 700;
		
		System.out.println(c2.name);
		System.out.println(c2.price);
	}
}

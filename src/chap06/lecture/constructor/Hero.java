package chap06.lecture.constructor;

public class Hero {
	String name;
	int power;
	
	public Hero(String name, int power) {
		this.name = name;
		this.power = power;
//생성자 parameter의 이름은 필드명과 동일한 것이 좋음
//인스턴스의 필드라는 것을 명시하기 위해 객체 자신을 지칭하는 this 키워드 사용
	}
	
	public Hero(String name) {
		this(name, 100);
//생성자가 초기화하는 초기값을 괄호로 묶어서 동시에 여러개를 줄 수 있음
	}
}

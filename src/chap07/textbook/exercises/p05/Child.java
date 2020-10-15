package chap07.textbook.exercises.p05;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
//		this.name = name;
//name이란 필드가 Child클래스에 존재X
//부모클래스인 Parent클래스의 name필드 값을 초기화 하는 생성자를 가져와야 함
		super(name);
		this.studentNo = studentNo;
	}
}

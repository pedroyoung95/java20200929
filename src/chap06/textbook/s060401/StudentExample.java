package chap06.textbook.s060401;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
//s1은 Student라는 클래스 변수, 클래스 변수이므로 참조 변수
//새로 생성된 Student라는 객체의 참조값을 저장
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}
}

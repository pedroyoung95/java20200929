package chap13.lecture;

import chap13.textbook.s130601.*;

public class GenericEx4Wildcard {
	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<>("일반인", 5);
		Course<Student> courseStudent = new Course<>("학생", 5);
		
		Person person = new Person("일반");	
//		Course<Person> newPerson = (Course<Person>) person;//Person과 Course<Person>간 관계X->변환 불가
//		coursePerson = person;//일반 클래스 타입과 그 클래스로 정해진 제네릭 타입은 완전히 다른 타입
		
		Person p = new Person("일반");
		Student s = new Student("학생");
		
		p = s;
		
		courseStudent.add(new Student("hong"));
		coursePerson.add(new Person("kim"));
		coursePerson.add(new Student("choi"));
		
//		coursePerson = courseStudent;
//Student는 Person의 하위클래스이지만
//Course<Student>는 Course<Person>의 하위 클래스가 아님
//즉, Student의 인스턴스는 Person의 인스턴스오 상속관계이지만
//coursePerson의 인스턴스와 courseStudent의 인스턴스는 아무런 관계가 없음(새로 생성된 객체이므로)
//가능하려면 제네릭 타입 클래스간 관계를 새로 설정하거나 타입을 강제변환해야 함
		coursePerson.add(new Person("lee"));
		
		coursePerson.add(new Person("lee"));
		 
		 System.out.println("종료");
		 
		 System.out.println("wildcard");
		 Course<? super Student> courserW0 = new Course<Object>("a", 1);
		 Course<? super Student> courserW1 = new Course<Person>("a", 1);
		 Course<? super Student> courserW2 = new Course<Student>("a", 1);
//Course<? super Student> courserW3 = new Course<HighStudent>("a", 1); ->Student의 하위이므로 안 됨
		 
		 courserW0.add(new Student("a"));
		 Course<Object> co = (Course<Object>) courserW0;
		 co.add(new Object()); //Object로 강제변환한 후에는 가능
//		 courserW0.add(new Object());
//courserW0은 Student포함 그 상위클래스임은 보장되지만
//그 상위클래스 중 Object라고 확신할 수 없기 때문에 Object 인스턴스를 받을 수 없음
		 courserW1.add(new Student("a"));
		 
		 System.out.println("종료2");
		 
		 Course<? extends Student> courseE1 = new Course<Student>("a", 5);
		 Course<? extends Student> courseE2 = new Course<HighStudent>("a", 5);
//		 Course<? extends Student> courseE3 = new Course<Person>("a", 5);

		 

	}
}

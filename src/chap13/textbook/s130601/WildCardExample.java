package chap13.textbook.s130601;

import java.util.Arrays;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Person("직장인"));
		personCourse.add(new Person("학생"));
		personCourse.add(new Person("고등학생"));
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new Student("고등학생"));
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
//registerCourse는 제네럴 타입에 제한이 없으므로, 모든 인스턴스를 받을 수 있음
		System.out.println();
		
//		registerCourseStudent(personCourse);
//		registerCourseStudent(workerCourse);
//registerCourseStudent는 Student클래스와 그 하위클래스로 제한되어서, Person과 Worker타입은 불가
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);
//		registerCourseWorker(highStudentCourse);
//registerCourseWorker는 Worker클래스와 그 상위클래스로 제한되어서, Student포함 그 이하 타입은 불가
	}
}

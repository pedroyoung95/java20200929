package chap07.textbook.s070301;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
//상위클래스의 생성자가 문자열 두 개를 parameter로 받으므로
//상위클래스 생성자 호출 시 super(문자열1, 문자열2)로 작성
		this.studentNo = studentNo; 
	}

}

package chap07.textbook.exercises.p06;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
//1. Child 클래스 생성하면서 argument없는 Parent클래스의 생성자 호출 
//2. Parent()생성자의 첫 statement로 인해 Parent(String nation) 호출, 실행
//->Parent(String nation) call 출력
//3. parent()생성자 실행: Parent() call 출력 
//4. Child()생성자의 첫 statemnet로 인해 Child(String name) 호출, 실행
//->Child(String name) call 출력
//5. Child()생성자 실행: Child() call 출력
		
	}
}

package chap14.lecture.lambda;

public class LambdaEx1 {
	public static void main(String[] args) {
		//추상메소드가 하나인 인터페이스의 객체를 만들 때 사용
		MyInterface o1 = new MyInterface() {
			
			@Override
			public void method() {
				System.out.println("추상메소드 재정의");
			}
		};
		
		MyInterface o2 = () -> System.out.println("추상메소드 재정의2");
//메소드가 추상메소드 하나밖에 없다는 보장이 있기때문에, 람다식을 사용해서 짧게 작성 가능
//(): 메소드 코드 블럭을 실행시키기 위한 파라미터
//'->' 오른쪽 코드 블럭{}: 메소드를 통해 실행시키고자 하는 내용(추상메소드 재정의)		
		o1.method();  
		o2.method();//만들어진 인터페이스 객체의 메소드를 사용할 수 있게 됨
	}
}

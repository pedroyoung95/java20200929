package chap14.lecture.nested;

public class NestedEx2 {
	private int outterField;
	
	public void method2() {
		MyInterface i1 = () -> {
			int outterField = 3;
			System.out.println("익명 클래스의 객체 (local class)");
			System.out.println(this);
			System.out.println(outterField); //람다식으로 생성한 클래스의 변수인 outterField를 지칭
			System.out.println(NestedEx2.this.outterField);
//바깥 클래스의 변수를 사용하려면 바깥 클래스를 호출해야 함
			
		};
	}
	
	public static void main(String[] args) {
		
	}
}

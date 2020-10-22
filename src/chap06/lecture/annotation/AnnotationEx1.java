package chap06.lecture.annotation;

@MyAnnotation
//클래스, 필드, 메소드 등에 붙일 수 있음
//@Override는 메소드에만 붙일 수 있은 annotation
public class AnnotationEx1 {
	@MyAnnotation
	private int i;
	//주석들...
	
	//annotation: 컴파일러가 보라고 달아놓는 주석
	
	@Override
	@MyAnnotation
//여러 annotation을 중복해서 추가할 수 있음.
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@MyAnnotation
	public static void mymethod() {
		
	}
}

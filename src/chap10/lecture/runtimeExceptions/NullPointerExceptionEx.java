package chap10.lecture.runtimeExceptions;

public class NullPointerExceptionEx {
	public static void main(String[] args) {
		int[] a = null;
		System.out.println(a.length);
//컴파일러가 체크하지 않고, 실행할 때 나타나는 실행 예외
	}
}

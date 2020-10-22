package chap13.textbook.s130501;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
//		String str = Util.compare("a", "b");
//compare()메소드의 파라미터의 타입인 T가 Number를 상속받아 한정되었기 때문에
//String 타입의 파라미터는 올 수 없음
		
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);
	}
}

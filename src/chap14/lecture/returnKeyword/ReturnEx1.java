package chap14.lecture.returnKeyword;

public class ReturnEx1 {
	public static void main(String[] args) {
		MyInterface o1 = (x) -> {
			int y = x * 2;
			return y;
		}; //추상메소드의 리턴 타입이 존재하면, 반드시 return문을 작성해야 함
		System.out.println(o1.method(3));
		
		MyInterface o2 = x -> {return x * 2;}; //리턴키워드를 사용하면 반드시 {}로 감싸야 함
		System.out.println(o2.method(10));
		
		MyInterface o3 = x -> x * 2; //리턴키워드를 생략하면 {}도 생략 가능
		System.out.println(o3.method(15));
		
	}
}

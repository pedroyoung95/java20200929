package chap14.textbook.s140304;

public class MyFuntionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> {return x + y;};
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> x + y;
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> sum(x, y);
//리턴 타입이 동일한 다른 메소드를 실행할 수도 있음. return 생략 가능 
//fi = (x, y) -> {return sum(x, y);}; 에서 return을 생략
		System.out.println(fi.method(2, 5));
	}
	public static int sum(int x, int y) {
		return (x + y);
	}
}

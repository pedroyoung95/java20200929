package chap03.binary;

public class DivideByZero {
	public static void main(String[] args) {
		int x = 5;
		int y = 0;
		
//		int z = x / y;
//		int z = x % y;
//		프로그램이 종료되어서 이후 실행문 실행X
		System.out.println("어떤 실행문.....");
		
		double a = 5.0;
		double b = -0.0;
		
		double c = a / b; //실수타입으로 나누면 Infinity 생성
		System.out.println(c);
		
		double d = a % b; //나머지는 NaN(Not a Number)
		System.out.println(d);
	}
}

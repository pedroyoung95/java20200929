package chap03.textbook;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		double a = x % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println(Double.isInfinite(a));
		System.out.println(Double.isNaN(a));
		
		System.out.println(z + 2);
	}
}

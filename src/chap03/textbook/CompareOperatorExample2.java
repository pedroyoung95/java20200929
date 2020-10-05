package chap03.textbook;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); 
		
		double v4 = 0.1;
		float v5 = 0.1F;
		System.out.println(v4 == v5); 
//		실수는 정확하게 저장되지 않으므로 다른 타입이면 다른 숫자로 인식
		System.out.println((float)v4 == v5);
		System.out.println((int)(v4*10) == (int)(v5*10));
	}
}

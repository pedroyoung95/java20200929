package chap03.binary;

public class ConcatOperator {
	public static void main(String[] args) {
		//연결연산자 concatenate
		int a = 3;
		int b = 5;
		int c = a + b;
		
		String s = "9";
		String d = a + s; //'숫자 + 문자열 = 문자열'이므로 String으로 저장
		
		System.out.println(d);
		
		String e = a + b + s;
//		a+b=8(정수계산), 8+s=89(정수+문자열 계산)
		System.out.println(e);
		
		String f = s + b + a;
//		s+b=95(문자+정수), 95(문자)+a(정수)=953
		System.out.println(f);
	}
}

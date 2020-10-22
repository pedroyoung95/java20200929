package chap13.textbook.s130501;

public class Util {
	public static  <T extends Number> int compare(T t1, T t2) {
//T에 부모를 둠으로써 그 부모포함 하위 클래스 타입까지만으로 범위 한정
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}

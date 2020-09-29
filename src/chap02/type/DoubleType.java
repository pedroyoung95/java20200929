package chap02.type;

public class DoubleType {
	public static void main(String[] args) {
		//double : 8byte(64bit)
		
		double doubleValue = 3.14;
		System.out.println(doubleValue);
		
		doubleValue = 3e6;//3.0*10^6
		System.out.println(doubleValue);
		
		// 실수형 계산시 주의
		double d1 = 0.1;
		double d2 = 0.2;
		double d3 = d1 + d2;
		System.out.println(d3);
		//눈에보이지 않는 근사치 값이 나올 수 있음
		//컴퓨터가 2진법으로 저장하기 때문에, 완벽한 0.1로 저장되지 않음
	}
}

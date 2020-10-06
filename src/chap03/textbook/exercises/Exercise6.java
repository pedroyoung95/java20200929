package chap03.textbook.exercises;

public class Exercise6 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double)((lengthTop+lengthBottom) * height)/ 2;
//		윗변, 아랫변, 높이 전부 int이므로 산술값도 연산
//		소수점 계산을 위해 2.0으로 나누거나, 값을 double로 변환해야 함
		System.out.println(area);
	}
}

package chap03.textbook.exercises;

public class Exercise8 {
	public static void main(String[] args) {
		double x2 = 5.0;
		double y2 = 0.0;
		
		double z2 = x2 % y2;
				
		if(Double.isNaN(z2)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result1 = z2 + 10;
			System.out.println("결과:" + result1);
		}
	}
}

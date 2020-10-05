package chap03.textbook;

public class Exercises101Page {
	public static void main(String[] args) {
//		1번 문제
		
//		2번 문제
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);
		
//		3번 문제
		int score = 85;
		String result = (!(score>90) ? "가" : "나");
		System.out.println(result);
		
//		4번 문제
		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		//남은 연필 수
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		
//		5번 문제
		int value = 356;
		System.out.println(value - (value % 100));
		
//		6번 문제
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double)((lengthTop+lengthBottom) * height)/ 2;
		System.out.println(area);
		
//		7번 문제
		int x1 = 10;
		int y1 = 5;
		
		System.out.println((x1>7) && (y1<=5));
		System.out.println((x1%3 == 2) || (y1%2 != 1));
		
//		8번 문제
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

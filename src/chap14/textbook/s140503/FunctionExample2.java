package chap14.textbook.s140503;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	);
	
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double)sum / list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg(student -> student.getEnglishScore());
//avg()매개값이 Funtion이므로 똑같이 람다식이 들어갈 수 있음
//'ToIntFunction<Student> function = student -> student.getEnglishScore()'가 등호 기준으로 분리
		System.out.println("영어 평균 점수: " + englishAvg);
		
		System.out.println("수학 평균 점수: " + avg(student -> student.getMathScore()));
	}
}

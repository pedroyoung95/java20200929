package chap03.textbook;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
//		score > 90의 결과는 'A' 아니면 ((score > 80) ? 'B' : 'C')
//		score > 80의 결과는 'B' 아니면 'C'
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}
}

package chap14.textbook.s140504;

import java.util.function.IntBinaryOperator;

public class OpreratorExampole {
	private static int[] scores = {92, 95, 87};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(score, result);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int max = maxOrMin((x, y) -> Math.max(x, y));
		System.out.println("최대값: " + max);
		
		int min = maxOrMin((x, y) -> Math.min(x, y));
		System.out.println("최소값: " + min);
	}
}

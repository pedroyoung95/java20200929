package chap05.textbook.exercises;

public class Exercises08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int all = 0;
		
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
				sum +=array[i][j];
			}
			all += array[i].length;
		}
		avg = (double) sum / all;
			
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}

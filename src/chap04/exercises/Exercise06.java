package chap04.exercises;

public class Exercise06 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {			
			for(int j=0; j<=i; j++) {				
				System.out.print("*");
//				print에서 'ln'을 빼면 줄 바꿈 안 일어남
			}
			System.out.println();
		}
	}
}

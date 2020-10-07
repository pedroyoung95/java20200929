package chap04.exercises;

public class LoopPractice {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------");
		
		for(int i=5; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			for(int k=5; k>i; k--) {
				System.out.print("#");
			}
			System.out.println();							
		}
		System.out.println("---------------");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("#");
			}
			for(int k=5; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();							
		}
		System.out.println("---------------");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=5; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();							
		}
		System.out.println("---------------");
		
		for(int i=0; i<5; i++) {
			for(int k=5; k>i; k--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();							
		}
		System.out.println("---------------");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("---------------");
		
		for(int i=0; i<5; i++) {
			for(int j=i; j<i+5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("---------------");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("---------------");
		
		int k=0;
		for(int i=0; i<5; i++) {			
			for(int j=0; j<=i; j++) {
				System.out.print(k%10);
				k++;
			}
			System.out.println();
		}
	}
}

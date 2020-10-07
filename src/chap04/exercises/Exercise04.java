package chap04.exercises;

public class Exercise04 {
	public static void main(String[] args) {			
		
		while(true) {
			int val1=(int)(Math.random()*6)+1;
			int val2=(int)(Math.random()*6)+1;
			System.out.println("("+val1+", "+val2+")");
			if((val1+val2)==5) {
				break;
			}
			
		}
	}
}

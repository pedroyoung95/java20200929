package chap03.textbook.exercises;

public class Exercise2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);
	}
}

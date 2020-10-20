package chap10.textbook.s100202;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		
		if(args.length>=2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
		}		
//String배열인 args에 값이 들어가있지 않으므로 배열 인덱스를 사용X
		System.out.println("프로그램 종료");
	}
}

package chap05.textbook;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
//main method의 parameter인 args라는 이름의 String array에 0,1번 값을 변수로 지정
//args[0], args[1]이 null인 상태로, 실행하면 if 조건문이 참, 코드블럭 실행		
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
	}
}

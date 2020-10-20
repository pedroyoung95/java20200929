package chap10.textbook.s100203;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
//Integer클래스의 parseInt메소드는 parameter를 Int타입으로 변환하는 기능
//data2는 Int로 변환 불가능한 값이기 때문에 NumberFormatException 발생
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	}
}

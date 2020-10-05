package chap03.textbook;

public class InputDatCheckNaNExample1 {
	public static void main(String[] args) {
		String input = "3.14";
		double v = Double.valueOf(input);
//		Double.valueOf(parameter)
//		수로 표현되는 String parameter의 값을 double 타입으로 변환
//		double v = (double)input;
//		문자열은 참조타입이라 기본타입과 변환불가
		System.out.println(v);
		
		
		String userInput = "NaN";
//		NaN, Infinity는 문자열이지만 double 타입여어서 double로 변환 가능
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		}
		
		currentBalance += val;
		System.out.println(currentBalance);
	}
}

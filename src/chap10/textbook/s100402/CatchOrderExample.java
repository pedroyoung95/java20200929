package chap10.textbook.s100402;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
//다중catch블럭에서, 앞선 catch가 예외를 잡아내면 뒤 catch블럭은 실행X
//앞선 catch가 잡은 예외가 해결되어야 뒤 catch블럭 실행됨
		} catch(Exception e) {
			System.out.println("실행에 문제가 있습니다.");
//다중catch블럭 사용 시, 상위 예외 클래스가 더 위에 있으면
//하위 예외 클래스는 쓸모가 없어짐. 상위 예외 클래스일수록 나중에 작성
//예외 클래스 순서가 잘못되면 컴파일 에러남
		} finally {
			System.out.println("다시 실행하세요.");
		}		
	}
}

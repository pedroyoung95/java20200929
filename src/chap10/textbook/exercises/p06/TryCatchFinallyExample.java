package chap10.textbook.exercises.p06;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String[] strArray = {"10", "2a"};
		int value = 0;
		for(int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
//다중catch블럭에서, 앞선 catch가 예외를 잡아내면 뒤 catch블럭은 실행X
//앞선 catch가 잡은 예외가 해결되어야 뒤 catch블럭 실행됨
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			} finally {
				System.out.println(value);
//i=0일 때 value에 10이 할당되었고, finally의 실행문이기 때문에
//value에 새로운 값이 할당되지 않는 이상 value는 10이고
//반복될때마다 10이 찍혀나옴.
			}
		}
	}
}

package chap05;

public class EnhancedFor {
	public static void main(String[] args) {
		int[] arr = {4, 5, 6, 7, 8};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("---------------");
		
		for(int n : arr) {
			System.out.println(n);
		}
		
//for(type var : arrayName) {} 의 형태
//arrayName이라는 배열을 탐색해서, 배열의 각 값을 var라는 변수가 받음
//0번째 값부터 마지막 값까지 var에 대입, 모든 값의 대입이 끝날 때 까지 statement 실행
//python for문의 작동 원리와 유사한 형태의 java array for문

	}
}

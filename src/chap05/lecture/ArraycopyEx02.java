package chap05.lecture;

public class ArraycopyEx02 {
	public static void main(String[] args) {
		int[][] arr1 = { {3, 4}, {88, 99}, {2, 1} };
		int[][] arr2 = new int[arr1.length][];
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		arr1[0][0] = 100;
//arr2는 arr1의 참조값을 복사한 것이므로, 값이 변경되면 따라 변경 됨
		
		for(int[] arr: arr2) {
			for(int n : arr) {
				System.out.println(n);
			}
		}
//배열 안 배열의 향상된 for문의 경우, 상위 배열 반복은 type을 배열 type으로 작성
	}
}

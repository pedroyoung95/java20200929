package chap05;

public class ArrayCopyEx01 {
	public static void main(String[] args) {
		int[] arr1 = {5, 6, 7};
		
		int[] arr2 = new int[arr1.length];
//arr2는 arr1을 복사했지만, new를 사용해서 만든 또다른 인스턴스임.
		
//		arr2[0] = arr1[0];
//		arr2[1] = arr1[1];
//		arr2[2] = arr1[2];
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int n : arr2) {
			System.out.println(n);
		}
	}
}

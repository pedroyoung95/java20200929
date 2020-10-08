package chap05;

public class ArrayEx05Length {
	public static void main(String[] args) {
		int[] arr1 = {99, 88, 77, 66};
		int[] arr2 = {5, 4, 3, 2, 1};
		
		System.out.println(arr1.length);
//arr1 참조변수가 가리키는 인스턴스는 length필드(속성)값으로 3을 가짐
		System.out.println(arr2.length);
//arr2 참조변수가 가리키는 인스턴스는 length필드(속성)값으로 5을 가짐
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
			
	}
}

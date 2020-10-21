package chap05.lecture;

public class ArrayEx02 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		arr1[0] = 99;
		arr1[1] = 77;
		arr1[2] = 55;
		
		int[] arr2 = new int[] {88, 66, 44};
//값 목록을 {}로 묶어서 붙여서 array를 생성하면, 값을 갖은 상태로 생성
//값이 주어지므로, 길이는 입력X
		for(int i=0; i<3; i++) {
			System.out.println(arr2[i]);
		}
		
		double[] arr3 = new double[] {3.14, 6.5, 9.9};
		for(int i=0; i<3; i++) {
			System.out.println(arr3[i]);
		}
		
		String[] arr4 = new String[] {"java", "css", "html", "jquery"};
		for(int i=0; i<4; i++) {
			System.out.println(arr4[i]);
		}
	}
}

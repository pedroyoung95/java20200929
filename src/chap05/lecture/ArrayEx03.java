package chap05.lecture;

public class ArrayEx03 {
	public static void main(String[] args) {
		int a = mymethod(3);
		System.out.println(a);
		
		a = mymethod(4);
		System.out.println(a);
		
		int b = 50;
		a = mymethod(b);
		System.out.println(a);
		
		int[] arr1 = new int[] {9, 8, 7};				
		a = mymethod2(arr1);
		System.out.println(a);
		
		int[] arr2 = new int[] {99, 88, 77};
		a= mymethod2(arr2);
//array를 parameter로 받는 경우, 배열 변수를 직접 넣은 경우
		System.out.println(a);
		
		a = mymethod2(new int[] {22, 33, 44});
		System.out.println(a);
//array를 parameter로 받는 경우, 새 배열을 생성해서 직접 젛은 경우
		System.out.println(mymethod2(new int[] {22, 33, 44}));



	}
	
	public static int mymethod2(int[] arr) {
//class는 method를 여러 개 가질 수 있음
//int array 타입의 parameter를 가짐
//mymethod2 실행할 때 parameter로 array 이름을 넣어야 작동함
		System.out.println("---- mymethod2 시작 ----");
		int sum = 0;
		for(int i=0; i<3; i++) {
//			System.out.println(arr[i]);
			sum +=arr[i];
		}
		System.out.println("---- mymethod2 종료 ----");
		return sum;
	}
	
	public static int mymethod(int i) {
		return i * 2;
	}
}

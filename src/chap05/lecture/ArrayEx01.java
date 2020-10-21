package chap05.lecture;

public class ArrayEx01 {
	public static void main(String[] args) {
		int i1 = 30;
		int i2 = 50;
		int i3 = 20;
		int i4 = 70;
		
		int[] arr1;
//arr1 변수는 integer 배열 타입. 즉, 참조타입.
//arr1은 배열 값들이 저장된 인스턴스의 주소 값이 저장됨
//배열에 들어간 값들은 인스턴스에 저장(arr1에 저장X)
		arr1 = new int[3];
//arr1에 길이가 3인 배열을 선언(new 연산자)
//길이는 저장할 수 있는 값의 개수
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
//int array에 아무 값도 안 넣으면 자동으로 0이 들어감
		
		arr1[0] = 99;
		arr1[1] = 88;
		arr1[2] = 77;
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		int[] arr2;
		arr2 = arr1;
//string과 마찬가지로, arr2는 arr1이 가진 주소 값을 저장
		arr2[0] = 55;
		
		System.out.println(arr2[0]);
		System.out.println(arr1[0]);
//arr2[0]을 55로 변경했으므로, 같은 인스턴스를 참조하는 arr1도 55로 변경
		
	}
}

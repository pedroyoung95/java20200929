package chap05.lecture;

public class ArraycopyEx03 {
	public static void main(String[] args) {
		int[][] arr1 = { {3, 4}, {88, 99}, {2, 1} };
		int[][] arr2 = new int[arr1.length][];
		
		for(int  i = 0; i < arr1.length; i++) {
			int[] newArr = new int[arr1[i].length];
			
			for(int j = 0; j < arr1[i].length; j++) {
				newArr[j] = arr1[i][j];
			}
			arr2[i] = newArr;
		}
//참조값만 복사하는 것이 아닌, 값 자체를 복사할 경우
//하위 배열이 되는 새로운 배열을 만들어서 
//하위 배열의 길이와 각각의 값을 복사한 후, 복사본배열의 하위배열로 대입
		
		arr1[0][0] = 100;
//값 자체를 복사했기 때문에, 복사 이후 원본 배열의 값을 변경해도 
//복사본 배열의 값은 변경X
		
		for(int[] arr : arr2) {
			for(int n : arr) {
				System.out.println(n);
			}
		}		
	}
}

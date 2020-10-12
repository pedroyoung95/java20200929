package chap05;

public class MatrixArrayEx01 {
	public static void main(String[] args) {
		int[][] matrix = new int[3][2];
//int array를 저장하는 int array(배열을 저장한 배열)
		
		int[] arr = new int[3];
		System.out.println(arr.length);
		
		System.out.println(matrix[0].length);
//배열의 각 원소는 배열
		System.out.println(matrix[1].length);
		System.out.println(matrix[2].length);
//int[a][b] -> [a]에 해당하는 배열이 가장 상위 배열(행렬의 행 해당)
//int[a][b] -> [b]에 해당하는 배열이 [a]배열의 각 원소에 해당하는 배열(행렬의 열 해당)
//ex>int[3][2]
//int[0]은 길이가 2인 int 배열의 참조값 저장
//int[1]은 길이가 2인 또다른 int 배열의 참조값 저장
//int[2]는 길이가 2인 또다른 int 배열의 참조값 저장
//다차원 배열은 열에 해당하는 배열에 일반 값이 들어있음
//행에 해당하는 배열은 열에 해당하는 배열의 참조값이 저장
		arr[0] = 99;
		arr[1] = 88;
		arr[2] = 77;
		
		matrix[0][0] = 9;
		matrix[2][0] = 1;
//가장 상위 배열: index num = 0,1,2 (길이 3)
//하위 배열: index num = 0,1 (길이 2)
//int[a][b] -> a: 행 번호, b: 열 번호
				
		
	}
}

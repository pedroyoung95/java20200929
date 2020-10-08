package chap05.textbook;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
//배열 값들의 총합을 구하는 방법1
//방법1은 배열 생성하고 총합을 구한 후 출력
		int[] scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);

		
//배열 값들의 총합을 구하는 방법2
//방법2는 총합 구하는 함수를 생성하고 그 함수를 직접 출력하는 방법
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합 : " + sum2);
		
		int sum3 = add(new int[] {1, 2, 3});
		System.out.println(sum3);
		
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}

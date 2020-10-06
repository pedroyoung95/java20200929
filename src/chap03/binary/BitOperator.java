package chap03.binary;

public class BitOperator {
	public static void main(String[] args) {
		// ~ 반전(단항)
		int i = 10;
		int j = ~i;
		System.out.println(j);
		
		// 이항 
		//& and : 같은 자리의 bit가 1인 경우만 1, 나머지 0
		//| or : 같은 자리 bit가 0인 경우만 0, 나머지 0
		//^ xor : 같은 자리 bit가 다를 경우 1, 나머지 0
		//피연산자 : integer
		//결과 : integer 
		int a = 45;
		int b = 25;
		int c = a & b;
		System.out.println(c);
		
		c = a | b;
		System.out.println(c);
		
		c = a ^ b;
		System.out.println(c);
		
		// bit shift 연산자
		// << : 각 bit를 왼쪽으로 옮김, 빈자리는 0으로 채움
		// << b : 2의 b제곱을 곱하는 것과 동일
		
		// >> : 각 bit를 오른쪽으로 옮김, 빈자리 msb(최상위 부호 비트)로 채움
		// >> b : 2의 b제곱으로 나누는 것과 동일
		
		// >>> : 각 bit를 오른쪽으로 옮김, 빈자리는 0으로 채움
		
		//이동해서 버려지는 맨 왼쪽/오른쪽 비트는 버려짐
		
		int val = 3; //0001
		int res = val << 2; //0010
		System.out.println(res);
		
		val = 98;
		res = val >> 2;
		System.out.println(res);
		
		val = -17;
		res = val >> 1;
		System.out.println(res);
		
		val = 98;
		res = val >>> 2;
		System.out.println(res);
		
		val = -17;
		res = val >>> 1;
		System.out.println(res);
	}
}

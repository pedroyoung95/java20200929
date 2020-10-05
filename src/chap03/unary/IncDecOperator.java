package chap03.unary;

public class IncDecOperator {

	public static void main(String[] args) {
		//증가연산자 increment
		// ++
		//변수 값에서 1 더한 후 변수에 다시 대입
		
		//감소연산자 decrement
		// --
		//변수 값에서 1 뺀 후 변수에 다시 대입
		
		int var1 = 5;
		int var2 = 5;
		
		var1++;
		var2--;
		System.out.println(var1);
		System.out.println(var2);
		
		//연산자의 위치
		//연산자가 뒤에 오면 대입 후 실행
		//연산자가 앞에 오면 실행 후 대입
		
		int var3 = 5;
		int var4 = 5;
		
		int var5 = 3 + (var3++);
		System.out.println(var5);
		System.out.println(var3);
		
		int var6 = 3 + (++var4);
		System.out.println(var6);
		System.out.println(var4);
		//언제 더해지는지 읽기 쉽게 윗줄 혹은 아랫줄에 따로 기입
				
	}

}

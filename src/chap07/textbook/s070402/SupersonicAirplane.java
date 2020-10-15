package chap07.textbook.s070402;

public class SupersonicAirplane  extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;	
//normal, supersonic 등의 string 값을 직접 넣지 않고
//int 타입 값의 변수를 생성함으로써 
//계산은 int값으로 하되, 입력은 마치 문자열을 넣는 것처럼 활용하게 함
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly();
		}
	}
}

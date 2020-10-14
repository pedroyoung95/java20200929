package chap06.textbook.s061101;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
//상수로 쓰이는 변수, 필드 명은 대문자로 작성, 단어 사이는 '_' 로 연결
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}

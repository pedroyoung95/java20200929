package chap06.textbook.s061204.mycompany;

import chap06.textbook.s061204.hankook.*;
import chap06.textbook.s061204.hyundai.Engine;
import chap06.textbook.s061204.kumho.*;
//클래스를 적고, ctrl + Shift + o(영문자 o) 누르면 자동으로 import 생성

public class Car {
	//field
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	chap06.textbook.s061204.hankook.Tire tire3 = new chap06.textbook.s061204.hankook.Tire();
//클래스이름이 같은 경우, 패키지까지 풀네임을 적어서 구분
//혹은 둘 중 하나만 import 해옴
	chap06.textbook.s061204.kumho.Tire tire4 = new chap06.textbook.s061204.kumho.Tire();

}

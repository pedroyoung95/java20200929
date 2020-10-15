package chap07.lecture.polymorphism.sample;

public class WaterGun extends Gun{
	@Override
	public void fire() {
		System.out.println("물을 쏩니다.");
	}
}

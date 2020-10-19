package chap08.lecture.sample;

public class Hero {
	private Gun gun;
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public void attack() {
		gun.fire();
	}
}

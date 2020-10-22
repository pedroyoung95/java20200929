package chap13.lecture.s130301;

class Tv {}
class Car {}

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		Tv tv = product1.getkind();
		String tvModel = product1.getmodel();
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getkind();
		String carModel = product2.getmodel();
	}
}


package chap10.textbook.s100501;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
//read 메소드 실행 후
//try-with-resources로 인해 항상 자동으로 close 메소드 실행	
			throw new Exception(); 
//new 키워드를 통해 새로운 예외 인스턴스를 생성
//새로 만들어진 예외 인스턴스를 throw키워드로 예외를 호출한 곳으로 보냄
		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
	}
	
}

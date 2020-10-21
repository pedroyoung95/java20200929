package chap11.object.equals;

public class Book {
	private int barCode;
	
	public Book(int barCode) {
		this.barCode = barCode;		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + barCode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
//인스턴스 참조값의 동일여부 비교
		if (obj == null)
			return false;
//비교할 인스턴스가 없는 경우
		if (getClass() != obj.getClass())
			return false;
//인스턴스의 클래스 타입을 비교하는 부분
		Book other = (Book) obj;
		if (barCode != other.barCode)
			return false;
//각 인스턴스의 필드값 비교 부분
		return true;
	}
//Source -> Generate hashCode() and equals() 선택
//자동으로 hashCode와 equals 메소드 재정의 
	
//	@Override
//	public int hashCode() {
//		return barCode;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		Book o = (Book) obj;
//		return this.barCode == o.barCode;
//	}
	
	
}

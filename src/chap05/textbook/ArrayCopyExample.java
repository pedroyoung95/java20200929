package chap05.textbook;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
//System.arraycopy(원본배열이름, 원본배열시작인덱스, 복사본배열이름, 복사본배열시작인덱스, 복사하고싶은수)
		
		for(String str : newStrArray) {
			System.out.print(str + ", ");
		}
	}
}

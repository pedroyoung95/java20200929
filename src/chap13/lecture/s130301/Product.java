package chap13.lecture.s130301;

public class Product<T, M> {
	//멀티 타입 파라미터 가능. comma로 나열
	//T를 갖는 요소는 T와 동일한 타입을, M을 갖는 요소는 M과 동일한 타입을 갖게 됨
		private T kind;
		private M model;
		
		public T getkind() {
			return this.kind;
		}
		public M getmodel() {
			return this.model;
		}
		
		public void setKind(T kind) {
			this.kind = kind;
		}
		public void setModel(M model) {
			this.model = model;
		}
}

package chap06.lecture.annotation;

import java.lang.reflect.Method;

public class AnnotationEx2 {
	public static void main(String[] args) throws Exception {
		Class clazz = MyClass.class;
		Method method = clazz.getMethod("method1");
		boolean anno = method.isAnnotationPresent(MyAnnotation.class);
//isAnnotationPresent(AnnotationName.class): 어노테이션 적용 여부 판별
		System.out.println(anno);
	}
}

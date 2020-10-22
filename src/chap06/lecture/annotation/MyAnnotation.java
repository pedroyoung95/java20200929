package chap06.lecture.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
//MyAnnotation이라는 annoatation을 필드, 타입, 메소드에 붙일 수 있게 됨
@Retention(RetentionPolicy.RUNTIME)
//@Retantion(RetentionPolicy.~): 어노테이션이 유지되는 단계를 선택
public @interface MyAnnotation {
	
}

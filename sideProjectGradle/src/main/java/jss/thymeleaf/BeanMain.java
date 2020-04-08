package jss.thymeleaf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanMain {
	public static void main(String[] args ) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigTest.class);
		Student2 student = context.getBean("student3", Student2.class);
		System.out.println("student");
		
	}

}

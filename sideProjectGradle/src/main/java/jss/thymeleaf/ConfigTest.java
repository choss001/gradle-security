package jss.thymeleaf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigTest {
	
	@Bean
	public Student student() {
		return new Student();
	}
	
	@Bean
	public Student2 student3() {
		return new Student2();
	}

}

package com.annospring.in.annotationBasedSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.annospring.in.annotationBasedSpring")
public class AppConfig {
	
	@Bean
	public Mediatek mediatek() {
		return new Mediatek(1);                   //constructor injection
	}
	
	@Bean
	public Snapdragon snapdragon() {              //constructor injection
		return new Snapdragon(2);
	}

	@Bean
	public Samsung samsung() {
		return new Samsung("galaxy");
		}
}

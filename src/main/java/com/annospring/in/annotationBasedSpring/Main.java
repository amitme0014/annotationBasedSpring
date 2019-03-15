package com.annospring.in.annotationBasedSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
	
	public static void main(String[] args) {
	
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
  // System.out.println(applicationContext.getBean(Samsung.class));
	Samsung s7=applicationContext.getBean(Samsung.class);
	s7.toString();
	System.out.println(s7.toString());
	
	//Samsung s7=new Samsung();
	//s7.toString();
	
    ((AbstractApplicationContext) applicationContext).close();
    
	}

}

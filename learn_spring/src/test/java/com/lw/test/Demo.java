package com.lw.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lw.entity.Student;

public class Demo {
	private ApplicationContext ioc;
	
	@Before
	public void init() {
		ioc = new ClassPathXmlApplicationContext("spring-config/applicationContext.xml");
	}
	
	@Test
	public void test() {
		Student student = ioc.getBean("student",Student.class);
		student.toString();
	}
	
}

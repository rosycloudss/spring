package com.lw.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lw.dao.StudentLoginInfoDao;
import com.lw.entity.StudentLoginInfo;

public class JdbcTest {
private ApplicationContext ioc;
	
	@Before
	public void init() {
		ioc = new ClassPathXmlApplicationContext("spring-config/applicationContext.xml");
	}
	
	@Test
	public void test() {
		StudentLoginInfoDao studentLoginInfoDao = ioc.getBean("studentLoginInfoDao",StudentLoginInfoDao.class);
		StudentLoginInfo studentLoginInfo  = new StudentLoginInfo();
		studentLoginInfo.setPassword("123456");
		studentLoginInfo.setStudentNo(2016);
		studentLoginInfo.setLoginTime(new Date().getTime());
		System.out.println(studentLoginInfoDao.add(studentLoginInfo));
	}
}

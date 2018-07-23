package com.lw.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.lw.dao.StudentDaoInterface;
import com.lw.dao.StudentMybatisDao;
import com.lw.entity.Student;

public class StudentMybatisTest {

	public void test() {
		StudentMybatisDao smd = new StudentMybatisDao();
		Student stu = smd.query("20162430219");
		System.out.println("----->" + stu);
		stu.setName("张三");

//		smd.add(stu);
//		smd.delete("20162430213");
		smd.update(stu);
		smd.close();
	}

	private static StudentDaoInterface studentDaoInterface;
	private static SqlSession sqlSession;
	static {
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config/mybatis-configuration.xml");
			SqlSessionFactory sqlSessionFatory = new SqlSessionFactoryBuilder().build(inputStream);
			sqlSession = sqlSessionFatory.openSession();
			studentDaoInterface = sqlSession.getMapper(StudentDaoInterface.class);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test2() {
		Student stu = new Student();
		stu.setStudentNo("20162430219");
		List<Student> stuList = studentDaoInterface.query(stu);
		System.out.println(stuList);
//		stu = stuList.get(0);
//		
//		stu.setStudentNo("20162430201");
//		stu.setName("李四");
//		studentDaoInterface.add(stu);
//		sqlSession.commit();
		System.out.println(studentDaoInterface.queryOne("20162430201"));
		System.out.println(studentDaoInterface.delete("20162430201"));
		sqlSession.commit();
	}
}

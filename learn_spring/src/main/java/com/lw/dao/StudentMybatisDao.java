package com.lw.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.lw.entity.Student;

public class StudentMybatisDao {
	private static SqlSession sqlSession;

	public StudentMybatisDao() {
		InputStream inputStream;
		try {
			//加载mybatis的配置文件 (通是加载关联的映射文件)
			inputStream = Resources.getResourceAsStream("mybatis-config/mybatis-configuration.xml");
			//构建SQLSession的工厂
			SqlSessionFactory sqlSessionFatory = new SqlSessionFactoryBuilder().build(inputStream);
			//创建能执行映射文件中SQL的sqlsession
			sqlSession = sqlSessionFatory.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void add(Student stu) {
		/*
		 * 映射sql的标识字符串
		 * com.lw.entity.Student是StudentMapper.xml 文件中Mapper标签的namespace属性的值.
		 * add 是insert 标签的id属性值,通过insert标签的id属性值就可以找到要执行的sql
		 */
		String statement = "com.lw.entity.Student.add";//映射sql的标识字符串 
		sqlSession.insert(statement, stu);
		sqlSession.commit();//提交事务
	}

	public Student query(String stuNo) {
		String statement = "com.lw.entity.Student.query";
		Student stu = (Student) sqlSession.selectOne(statement, stuNo);
		return stu;

	}
	
	public void delete(String stuNo) {
		String statement = "com.lw.entity.Student.delete";
		sqlSession.delete(statement, stuNo);
		sqlSession.commit();
	}
	
	public void update(Student stu) {
		String statement = Student.class.getName() + ".update";
		sqlSession.update(statement, stu);
		sqlSession.commit();
	}
	public void close() {
		if(sqlSession != null) {
			sqlSession.close();
		}
	}
}

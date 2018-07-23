package com.lw.dao;

import java.util.List;

import com.lw.entity.Student;

public interface StudentDaoInterface {

	public void add(Student stu);
	
	public int delete(String stuNo);
	
	public int update(Student stu);
	
	public Student queryOne(String stuNo);
	
	public List<Student> query(Student stu);
	
}

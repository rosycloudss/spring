package com.lw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lw.dao.StudentDao;
import com.lw.entity.Student;

/**
 * Student 的服务类
 * @author liwei
 *
 */
@Service("studentService")
public class StudentService {
	
	@Autowired
	private StudentDao stuDao;
	
	/**
	 * 添加学生信息 并返回添加的行数
	 * @param stu
	 * @return
	 */
	public int addStudent(Student stu) {
		int flag = 0;
		if(stu != null) {
			flag = stuDao.addStudent(stu);
		}
		return flag;
	}
	
	/**
	 * 修改学生信息 并返回修改的行数
	 * @param stu
	 * @return
	 */
	public int updateStudent(Student stu) {
		int flag = 0;
		if(stu != null) {
			flag = stuDao.updateStudent(stu);
		}
		return flag;
	}
	/**
	 * 删除学生信息 并返回删除的行数
	 * @param stuNo
	 * @return
	 */
	public int removeStudent(String stuNo) {
		int flag = 0;
		if(stuNo != null) {
			flag = stuDao.removeStudent(stuNo);
		}
		return flag;
	}
	
	/**
	 * 查找学生信息  并返回学生信息的列表
	 * @param stuNo
	 * @return
	 */
	public List<Student> queryStudent(String stuNo){
		if(stuNo != null) {
			return stuDao.queryStudent(stuNo);
		}else {
			return stuDao.queryAllStudents();
		}
	}
}

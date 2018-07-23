package com.lw.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.lw.entity.Student;

@Component("studentDao")
public class StudentDao {
	@Autowired
	JdbcTemplate jt;

	/**
	 * 添加学生信息
	 * 
	 * @param stu
	 * @return
	 */
	public int addStudent(Student stu) {
		String sql = "insert into stu_info value(?,?,?,?,?,?,?,?)";
		return jt.update(sql, stu.getStudentNo(), stu.getName(), stu.getSex(), stu.getBirthday(), stu.getSchool(),
				stu.getMajor(), stu.getEmail(), stu.getNational());
	}

	/**
	 * 修改学生信息
	 * 
	 * @param stu
	 * @return
	 */
	public int updateStudent(Student stu) {
		String sql = "update stu_info set stu_name=?,sex=?,birthday=?,school=?,major=?,email=?,national=? where stu_no=?";
		return jt.update(sql, stu.getName(), stu.getSex(), stu.getBirthday(), stu.getSchool(), stu.getMajor(),
				stu.getEmail(), stu.getNational(), stu.getStudentNo());
	}

	/**
	 * 通过学号删除学生信息
	 * 
	 * @param stuNo
	 * @return
	 */
	public int removeStudent(String stuNo) {
		String sql = "delete from stu_info where stu_no = ?";
		return jt.update(sql, stuNo);
	}

	/**
	 * 通过 学号查找学生信息
	 * 
	 * @param stuNo
	 * @return
	 */
	public List<Student> queryStudent(String stuNo) {
		List<Student> stuList = new ArrayList<Student>();
		if (stuNo != null) {
			String sql = "select stu_no , stu_name , sex , birthday , school , major , email ,  national from stu_info where stu_no=?";
			stuList = jt.query(sql, new StudentRowMapper(), stuNo);
		}
		return stuList;
	}
	/**
	 * 查找所有学生信息
	 * @return
	 */
	public List<Student> queryAllStudents() {
		String sql = "select stu_no , stu_name , sex , birthday , school , major , email ,  national from stu_info";
		return jt.query(sql, new StudentRowMapper());
	}

	/**
	 * Student 的 RowMapper 实现类
	 * 
	 * @author liwei
	 *
	 */
	class StudentRowMapper implements RowMapper<Student> {

		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student stu = new Student();
			stu.setStudentNo(rs.getString("stu_no"));
			stu.setName(rs.getString("stu_name"));
			stu.setSex(rs.getString("sex"));
			stu.setBirthday(rs.getString("birthday"));
			stu.setSchool(rs.getString("school"));
			stu.setMajor(rs.getString("major"));
			stu.setEmail(rs.getString("email"));
			stu.setNational(rs.getString("national"));
			return stu;
		}

	}
}

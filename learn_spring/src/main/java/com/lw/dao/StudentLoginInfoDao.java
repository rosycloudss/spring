package com.lw.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.lw.entity.StudentLoginInfo;

@Component("studentLoginInfoDao")
public class StudentLoginInfoDao {
	@Autowired
	private JdbcTemplate jt;
	
	public int add(StudentLoginInfo studentLoginInfo) {
		String sql = "insert into stu_login_info value(?,password(?),?)";
		
		return jt.update(sql,studentLoginInfo.getStudentNo(),studentLoginInfo.getPassword(),
				studentLoginInfo.getLoginTime());
	}
}	

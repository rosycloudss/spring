package com.lw.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import org.junit.Test;

import com.lw.util.DBUtil;

public class DBUtilTest {
	
	@Test
	public void dbutilTest() {
		DBUtil dbu = DBUtil.getDBUtil();
		Connection conn = dbu.getConnection();
		System.out.println(conn);
		Statement stat = dbu.getStatement(conn);
		String insertSql = "insert into stu_login_info value(20162430211,password('1759840027')," + new Date().getTime() + ")";
		try {
			stat.executeUpdate(insertSql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

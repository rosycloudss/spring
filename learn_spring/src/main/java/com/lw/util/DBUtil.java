package com.lw.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBUtil {
	private final String USERNAME="liwei";
	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String PASSWORD = "1759840027";
	private final String URL = "jdbc:mysql://localhost:3306/student_mananger";
	private static DBUtil dbu = null;
	private Connection conn = null;
	private DBUtil() {
	}
	
	/**
	 * 获取DBUtil对象
	 * @return
	 */
	public static DBUtil getDBUtil() {
		if(dbu == null) {
			dbu = new DBUtil();
		}
		return dbu;
	}
	/**
	 * 获取数据库链接
	 * @return
	 */
	public Connection getConnection() {
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			System.out.println("驱动出现错误:" + e);
		} catch (SQLException e) {
			System.out.println("connection 出现错误:" + e);
			e.printStackTrace();
		}
		
		return conn;
	}
	
	/**
	 * 获取Statement对象
	 * @param conn
	 * @return
	 */
	public Statement getStatement(Connection conn) {
		Statement stat = null;
		if(conn != null) {
			try {
				stat = conn.createStatement();
			} catch (SQLException e) {
				System.out.println("获取 Statement 错误" + e);
			}
		}
		return stat;
	}
	
	public void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("关闭Connection 失败" + e);
		}
	}
	
	public void close(Statement stat) {
		try {
			stat.close();
		} catch (SQLException e) {
			System.out.println("关闭 Statement 失败" + e);
		}
	}
	
	public void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			System.out.println("关闭 ResultSet 失败" + e);
		}
	}
	
	
}

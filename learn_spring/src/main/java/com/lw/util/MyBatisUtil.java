package com.lw.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {

	
	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config/mybatis-configuration.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("加载核心配置文件失败" + e.getMessage());
		}
	}
	/**
	 * 获取Session
	 * @return
	 */
	public static SqlSession getSession() {
		return sqlSessionFactory.openSession();
	}
	/**
	 * 关闭Session
	 * @param session
	 */
	public static void close(SqlSession session) {
		if(session != null) {
			session.close();
		}
	}
}	

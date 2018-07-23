package com.lw.entity;

import org.springframework.stereotype.Component;

/**
 * 
 * @author liwei
 *
 */
@Component
public class StudentLoginInfo {
	
	private long studentNo;
	
	private String password;
	
	private long loginTime;
	/**
	 * @return the loginTime
	 */
	public long getLoginTime() {
		return loginTime;
	}
	/**
	 * @param loginTime the loginTime to set
	 */
	public void setLoginTime(long loginTime) {
		this.loginTime = loginTime;
	}
	/**
	 * @return the studentNo
	 */
	public long getStudentNo() {
		return studentNo;
	}
	/**
	 * @param studentNo the studentNo to set
	 */
	public void setStudentNo(long studentNo) {
		this.studentNo = studentNo;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StudentLoginInfo [studentNo=" + studentNo + ", password=" + password + ", loginTime=" + loginTime + "]";
	}
	
}

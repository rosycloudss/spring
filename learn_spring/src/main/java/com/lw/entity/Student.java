package com.lw.entity;

import java.util.List;

public class Student {
	private String studentNo;
	private String name;
	private String sex;
	
	private String birthday;
	private String major;
	private String school;
	private String email;
	private String national;
	
	private List<StudentLoginRecord> loginRecordList;
	/**
	 * @return the loginRecordList
	 */
	public List<StudentLoginRecord> getLoginRecordList() {
		return loginRecordList;
	}
	/**
	 * @param loginRecordList the loginRecordList to set
	 */
	public void setLoginRecordList(List<StudentLoginRecord> loginRecordList) {
		this.loginRecordList = loginRecordList;
	}
	/**
	 * @return the studentNo
	 */
	public String getStudentNo() {
		return studentNo;
	}
	/**
	 * @param studentNo the studentNo to set
	 */
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the birthday
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}
	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}
	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}
	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the national
	 */
	public String getNational() {
		return national;
	}
	/**
	 * @param national the national to set
	 */
	public void setNational(String national) {
		this.national = national;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [studentNo=").append(studentNo).append(", name=").append(name).append(", sex=")
				.append(sex).append(", birthday=").append(birthday).append(", major=").append(major).append(", school=")
				.append(school).append(", email=").append(email).append(", national=").append(national)
				.append(", loginRecordList=").append(loginRecordList).append("]");
		return builder.toString();
	}
	
	
	
}
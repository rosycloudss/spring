<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改学生信息</title>
</head>
<body>
<div align="center">
	<h1>修改学生信息</h1>
</div>
	<div align="center">
		<form action="/learn_spring/student/update" method="post">
			<input name="studentNo" type="hidden" value="${stu.getStudentNo() }">
			<span>学号:</span><input type="text" disabled="disabled" placeholder="请输入学号" value="${stu.getStudentNo() }"><br>
			<span>姓名:</span><input type="text" name="name" placeholder="请输入姓名" value="${stu.getName() }"><br>
			<span>性别:</span><input type="radio" checked name="sex" value="男">男&nbsp;&nbsp;&nbsp;<input type="radio" ${stu.getSex().equals("女") ? "checked" : ""} name="sex" value="女" >女 <br>
			<span>生日:</span><input type="text" name="birthday" placeholder="yyyy-mm-dd" value="${stu.getBirthday() }"><br>
			<span>学校:</span><input type="text" name="school" value="${stu.getSchool() }"><br>
			<span>专业:</span><input type="text" name="major" value="${stu.getMajor() }"><br>
			<span>邮箱:</span><input type="text" name="email" value="${stu.getEmail() }"><br>
			<span>民族:</span><input type="text" name="national" value="${stu.getNational() }"><br>
			<input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置">
		</form>
	</div>
</body>
</html>
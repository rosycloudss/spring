<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加学生信息</title>
</head>
<body>
<div align="center">
	<h1>添加学生信息</h1>
</div>
	<div align="center">
		<form action="/learn_spring/student/add" method="post">
			<span>学号:</span><input type="text" name="studentNo" placeholder="请输入学号"><br>
			<span>姓名:</span><input type="text" name="name" placeholder="请输入姓名"><br>
			<span>性别:</span><input type="radio" name="sex" value="男">男&nbsp;&nbsp;&nbsp;<input type="radio" name="sex" value="女" >女<br>
			<span>生日:</span><input type="text" name="birthday" placeholder="yyyy-mm-dd"><br>
			<span>学校:</span><input type="text" name="school"><br>
			<span>专业:</span><input type="text" name="major"><br>
			<span>邮箱:</span><input type="text" name="email"><br>
			<span>民族:</span><input type="text" name="national"><br>
			<input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置">
		</form>
	</div>

</body>
</html>
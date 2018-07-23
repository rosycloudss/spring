<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生列表</title>
</head>
<body>
<!-- 学生信息列表 -->
<div id="studentTable" align="center">
		<table style="width: 70%;align:center;align-content: center;border: solid;">
			<thead>
				<tr>
					<th>学号</th><th>姓名</th><th>民族</th><th>性别</th><th>生日</th><th>学校</th><th>专业</th><th>邮箱</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${stuList }" var="stu">
					<tr align="center">
						<td>${stu.getStudentNo() }</td>		
						<td>${stu.getName() }</td>
						<td>${stu.getNational() }</td>
						<td>${stu.getSex() }</td>
						<td>${stu.getBirthday() }</td>
						<td>${stu.getSchool() }</td>
						<td>${stu.getMajor() }</td>
						<td>${stu.getEmail() }</td>
						<td><a href="/learn_spring/student/remove?stuNo=${stu.getStudentNo() }">删除</a>&nbsp;&nbsp;<a href="stuList?stuNo=${stu.getStudentNo() }&flag=update">修改</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div align="center" style="border: solid;background-color: green;width: 80px;">
			<a  href="/learn_spring/view/stu/addStu.jsp">继续添加</a>  
		</div>
</div>

</body>
</html>
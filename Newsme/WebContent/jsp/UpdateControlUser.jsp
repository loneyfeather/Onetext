<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h2>修改用户</h2>
<hr>
	<form action="../UpdateUserControlServelet" method="post">
		<table border="1" align="center">
			<!-- 用户名 -->
			<tr>
				<td>用户名</td>
				<td><input type="text" name="username" value=<%=request.getParameter("username") %> ></td>
			</tr>
			
			<!-- 密码 -->
			<tr>
				<td>密码</td>
				<td><input type="text" name="password" value=<%=request.getParameter("password") %> ></td>
			</tr>
			
			<!-- 性别 -->
			<tr>
				<td>性别</td>
				<td><input type="text" name="sex" value="1是男的，0是女的" ></td>
			</tr>
			
			<!-- 职业 -->
			<tr>
				<td>职业</td>
				<td><input type="text" name="profession" value=<%=request.getParameter("profession") %> ></td>
			</tr>
			
			<!-- 爱好 -->
			<tr>
				<td>爱好</td>
				<td><input type="text" name="favourite" value=<%=request.getParameter("favourite") %> ></td>
			</tr>
			
			<!-- 简介 -->
			<tr>
				<td>简介</td>
				<td><textarea rows="15" cols="50" name="note"><%=request.getParameter("note") %></textarea></td>
			</tr>
			
			<input type="hidden" name="id" value="<%=request.getParameter("id") %>" >
			
			<tr>
				<td colspan="2">
					<input type="submit" value="提交">
					<input type="reset" value="重置">
				</td>
			</tr>
		</table>
	</form>
	

</body>
</html>
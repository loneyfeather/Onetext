<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

修改新闻
<hr>
<form action="../UpDateServelt" method="post">
<table border="1" align="center">

<tr>
	<td>新闻题目：</td>
	<td><input type="text" name="title" value=<%=request.getParameter("title") %> ></td>
</tr>

<tr>
	<td>新闻内容：</td>
	<td><textarea rows="15" cols="50" name="content"><%=request.getParameter("content") %></textarea></td>
</tr>

<tr>
	<td>发布人：</td>
	<td><input type="text" name="username" value="<%=request.getParameter("username") %>" disabled="disabled"> </td>
</tr>

<tr>
	<td>发布时间：</td>
	<td><input type="text" name="pubtime" value="<%=request.getParameter("pubtime") %>" disabled="disabled"></td>
</tr>

<input type="hidden" name="id" value="<%=request.getParameter("id") %>">

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
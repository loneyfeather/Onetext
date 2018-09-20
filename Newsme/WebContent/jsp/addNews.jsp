<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="com.cn.model.*"%>
  <%
      
  String path = request.getContextPath();      
  // 获得项目完全路径（假设你的项目叫MyApp，那么获得到的地址就是 http://localhost:8080/MyApp/）:      
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";      
  %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href=" <%=basePath%>">  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%User u=(User)session.getAttribute("user"); %>
添加新闻
<hr>
<form action="AddNewsServlet" method="post">
<table border="1" align="center">
<tr>
<td>新闻题目：</td>
<td><input type="text" name="title" ></td>
</tr>
<tr>
<td>新闻内容：</td>
<td><textarea rows="15" cols="50" name="content"></textarea></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="提交">
<input type="reset" value="重置">
</td>
</tr>
</table>
<input type="hidden" name="userid" value="<%=u.getId()%>">
</form>


</body>
</html>
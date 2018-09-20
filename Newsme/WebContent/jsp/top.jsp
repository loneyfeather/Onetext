<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="com.cn.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
 <%  User u=(User)session.getAttribute("user"); %>
 欢迎<%=u.getUsername() %>
 <%

 if(u.getType().equals("1") ){

%><p>类型:管理员</p><%
 }else{

	 }
 %>
</body>
</html>
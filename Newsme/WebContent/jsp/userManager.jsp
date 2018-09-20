<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*,com.cn.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<%List<User> user=(List<User>)session.getAttribute("user"); %>


<br/>
<br/>

<input type="text" value="请输入关键字搜索" id="key" onfocus="empty()" /><input type="button" value="搜索" onclick="serch()">
<hr>
<table border="1">
<tr>
<td>序号</td>
<td>用户名</td>
<td>密码</td>
<td>性别</td>
<td>职业</td>
<td>爱好</td>
<td>简介</td>
<td>操作</td>
</tr>
<%
if(user!=null){
for(int i=0;i<user.size();i++){ 
  User user_1=user.get(i);
%>
<tr>
<td><%=i+1 %></td>
<td><%=user_1.getUsername() %></td><!-- 名字 -->
<td><%=user_1.getPassword() %></td><!-- 密码 -->
<!-- 性别 -->
<td>
<%if(user_1.getSex().equals("0") ){
%><p>女</p><%}else{ %><p>男</p><%} %>
</td>

<td><%=user_1.getProfession() %></td><!-- 职业 -->
<td><%=user_1.getFavourite() %></td><!-- 爱好 -->
<td><%=user_1.getNote() %></td><!-- 简介 -->

<td>

	
	<a href="UpdateControlUser.jsp?id=<%=user_1.getId() %>&username=<%=user_1.getUsername()%>&password=<%=user_1.getPassword()%>&sex=<%=user_1.getSex()%>&profession=<%=user_1.getProfession()%>&note=<%=user_1.getNote()%>&favourite=<%=user_1.getFavourite() %>&type=<%=user_1.getType()%>">修改   </a>
	<a href="../DeleteUserControlServelet?id=<%=user_1.getId() %>">删除</a>
</td>
</tr>
<%}
}
%>

</table>




</body>
<script type="text/javascript" charset="utf-8">

function serch(){
	
	var key=document.getElementById("key").value;
	
	window.location.href = '../FindControlUserServlet?key='+key;
	
}
function empty(){
document.getElementById("key").value="";	
}


</script>
</html>
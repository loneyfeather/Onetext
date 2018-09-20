<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"  import="com.cn.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<% User u = (User)session.getAttribute("user"); %>
<h3>密码修改</h3>
	<form action="../UpdateUPServlet" method="post">
		<table border="1" align="center">
			
			<tr>
				<td>旧密码</td>
				<td><input type="password" name="oldpassword" id="oldpassword"></td>
			</tr>
		
			<tr>
				<td>新密码</td>
				<td><input type="password" name="newpassword1" id="newpassword1"></td>
			</tr>
			
			<tr>
				<td>确认密码</td>
				<td><input type="password" name="newpassword2" id="newpassword2"></td>
			</tr>
			
			<tr>
				<td><input type="hidden" name = "id" value="<%=u.getId() %>" ></td>
				<td><input type="submit" value="提交"  onclick="return check()"></td>
				
			</tr>
		</table>
		
	</form>


</body>
<script type="text/javascript">
	function check(){
		var oldpassword = document.getElementById("oldpassword").value;
		var newpassword1 = document.getElementById("newpassword1").value;
		var newpassword2 = document.getElementById("newpassword2").value;
		
		if(oldpassword != <%=u.getPassword() %>){
			alert("你输入的密码有错！！！");
			return false;
		}else if(newpassword1.length == 0){
			alert("新密码不能为空！！！");
			return false;
		}else if(newpassword1 != newpassword2 ){
			alert("两次密码输入不一致！！！");
			return false;
		}else{
			return true;
		}
	}
</script>

</html>




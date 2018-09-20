<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*,com.cn.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%List<News> news=(List<News>)session.getAttribute("news"); %>
<%  User u=(User)session.getAttribute("user"); %>
<a href="addNews.jsp">添加新闻</a><br/>
<br/>
<br/>

<input type="text" value="请输入关键字搜索" id="key" onfocus="empty()" /><input type="button" value="搜索" onclick="serch()">
<hr>
<table border="1">
<tr>
<td>序号</td>
<td>新闻标题</td>
<td>新闻作者</td>
<td>新闻内容</td>
<td>发表时间</td>
<td>操作</td>
</tr>
<%
if(news!=null){
for(int i=0;i<news.size();i++){ 
  News news_1=news.get(i);
%>
<tr>
<td><%=i+1 %></td>
<td><%=news_1.getTitle() %></td>
<td><%=news_1.getUsername() %></td>
<td><%=news_1.getContent() %></td>
<td><%=news_1.getPubtime() %></td>

<td>

<%if(u.getType().equals("1")||u.getUsername().equals(news_1.getUsername())){%>


	<a href="showNews.jsp?title=<%=news_1.getTitle()%>&content=<%=news_1.getContent() %>">查看详情</a>
	<a href="UpdateNews.jsp?id=<%=news_1.getId() %>&title=<%=news_1.getTitle()%>&content=<%=news_1.getContent()%>&username=<%=news_1.getUsername()%>&title=<%=news_1.getTitle()%>&pubtime=<%=news_1.getPubtime()%>">修改   </a>
	<a href="../DeleteNewsServlet?id=<%=news_1.getId() %>">删除</a>
</td>
</tr>
<%}else{ %>
<a href="showNews.jsp?title=<%=news_1.getTitle()%>&content=<%=news_1.getContent() %>">查看详情</a>
<% }
}
}%>

</table>


</body>
<script type="text/javascript" charset="utf-8">

function serch(){
	
	var key=document.getElementById("key").value;
	
	window.location.href = '../FindNewsServlet?key='+key;
	
}
function empty(){
document.getElementById("key").value="";	
}


</script>
</html>
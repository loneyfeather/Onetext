<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="com.cn.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="../css/nav.css">
    <link rel="stylesheet" type="text/css" href="../font/iconfont.css">
    <script type="text/javascript" src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../js/nav.js"></script>
</head>
<body>
 <div class="nav">
        <div class="nav-top">
            <div id="mini" style="border-bottom:1px solid rgba(255,255,255,.1)"><img src="../img/mini.png" ></div>
        </div>
        <ul>
            <li class="nav-item">
                <a href="javascript:openNews()"><i class="my-icon nav-icon icon_1"></i><span>新闻管理</span><i class="my-icon nav-more"></i></a>
            </li>
            <%User u=(User)session.getAttribute("user");
              if(u.getType().equals("1")){
            %>
            <li class="nav-item">
                <a href="javascript:openUser()" ><i class="my-icon nav-icon icon_2"></i><span>用户管理</span><i class="my-icon nav-more"></i></a>
            </li>
            <%} %>
            <li class="nav-item">
                <a href="javascript:Logout()" ><i class="my-icon nav-icon icon_3"></i><span>退出登录</span><i class="my-icon nav-more"></i></a>
   
            </li>
             <li class="nav-item">
                <a href="javascript:openUUP();"><i class="my-icon nav-icon icon_3"></i><span>修改密码</span><i class="my-icon nav-more"></i></a>
   
            </li>
        </ul>
    </div>
</body>
<script type="text/javascript">
function openNews(){
	window.open('newsManager.jsp',"main");
}

function openUser(){
	window.open('../FindControlUserServlet',"main");
}
function openUUP(){
	window.open('UpdateUP.jsp',"main");
}

function Logout(){
	window.open('../LogoutServlet',"_top");
}
</script>

</html>
package com.cn.servelet;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.bean.AddUserBean;
import com.cn.model.User;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("username");
		String password=request.getParameter("password");
	    String sex=request.getParameter("sex");
	    String fav[]=request.getParameterValues("favourite");
	    String profession=request.getParameter("profession");
	    String note=request.getParameter("note");
	    String favourite="";	    
	    for(int i=0;i<fav.length;i++) {
	    	if(i==0) {
	    		favourite=fav[0];
	    	}else {
	    		favourite=favourite+","+fav[i];
	    	}
	    }
	    User u=new User();
	    u.setUsername(name);
	    u.setPassword(password);
	    u.setSex(sex);
	    u.setFavourite(favourite);
	    u.setProfession(profession);
	    u.setNote(note);
	    u.setType("0");
	    
	    AddUserBean addbean=new AddUserBean();
	    int i=addbean.addUser(u);
	    if(i>0) {
	    	response.sendRedirect("Login.html");
	    	//System.out.println("¹§Ï²Äú£¬×¢²á³É¹¦");
	    	
	    }else {
	    	
	    	//System.out.println("±§Ç¸£¬×¢²áÊ§°Ü£¬ÇëÖØÐÂÌîÐ´");
	    	response.sendRedirect("error.jsp");
	    }
	}

	

}

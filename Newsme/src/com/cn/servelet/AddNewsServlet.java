package com.cn.servelet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.bean.AddNewsBean;
import com.cn.model.News;
import com.cn.model.User;

/**
 * Servlet implementation class AddNewsServlet
 */
@WebServlet("/AddNewsServlet")
public class AddNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewsServlet() {
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
		String userid=request.getParameter("userid");
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		News news=new News();
		news.setUserid(Integer.parseInt(userid));
		news.setContent(content);
		news.setTitle(title);
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String pubtime=sdf.format(date);
		news.setPubtime(pubtime);
//调用bean将news存入数据库		
	AddNewsBean  addbean=new AddNewsBean();
	int i=addbean.addNews(news);
		if(i>0) {
			response.sendRedirect("jsp/newsManager.jsp");
		}else {
			response.sendRedirect("error.jsp");
		}
	}

}

package com.cn.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.bean.UpdateNewsBean;
import com.cn.model.News;


/**
 * Servlet implementation class UpDate
 */
@WebServlet("/UpDateServelt")
public class UpDateServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpDateServelt() {
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
		int id = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		News news = new News();
		news.setId(id);
		news.setTitle(title);
		news.setContent(content);
		
		//bean
		UpdateNewsBean un = new UpdateNewsBean();
		int i= un.updateNews(news);
		
		

		if (i >= 0) {
			response.sendRedirect("jsp/newsManager.jsp");
		} else {
			response.sendRedirect("erroor.jsp");
		}
		
		
	}

}

package com.cn.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.bean.DeleteNewsBean;
import com.cn.bean.FindNewsBean;

/**
 * Servlet implementation class DeleteNewsServlet
 * @param <News>
 */
@WebServlet("/DeleteNewsServlet")
public class DeleteNewsServlet<News> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteNewsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		DeleteNewsBean delete=new DeleteNewsBean();
		int i=delete.deleteNews(id);
		if(i>=0) {
			FindNewsBean fbean=new FindNewsBean();
			fbean.FindNews("");
			//request.getSession().setAttribute("news", news);
			response.sendRedirect("jsp/newsManager.jsp");
			
		}else {
			response.sendRedirect("error.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}

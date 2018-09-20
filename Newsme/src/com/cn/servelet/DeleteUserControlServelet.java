package com.cn.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.bean.DeleteUserBean;
import com.cn.bean.FindUserBean;

/**
 * Servlet implementation class DeleteUserControlServelet
 */
@WebServlet("/DeleteUserControlServelet")
public class DeleteUserControlServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteUserControlServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		DeleteUserBean dub = new DeleteUserBean();
		int i=dub.deleteUser(id);
		if(i>=0) {
			FindUserBean fub = new FindUserBean();
			fub.FindUser("");
			response.sendRedirect("success.jsp");
		}else {
			response.sendRedirect("error.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

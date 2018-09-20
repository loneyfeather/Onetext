package com.cn.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.bean.UpdateUserBean;
import com.cn.model.User;

/**
 * Servlet implementation class UpdateUserControlServelet
 */
@WebServlet("/UpdateUserControlServelet")
public class UpdateUserControlServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateUserControlServelet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("id"));

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String sex = request.getParameter("sex");
		String profession = request.getParameter("profession");
		String favourite = request.getParameter("favourite");
		String note = request.getParameter("note");

		User user = new User();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		user.setSex(sex);
		user.setFavourite(favourite);
		user.setProfession(profession);
		user.setNote(note);

		UpdateUserBean uu = new UpdateUserBean();
		int i=uu.updateUser(user.getId(),user.getUsername(),user.getPassword(),user.getSex(),user.getFavourite(),user.getNote());
		System.out.println(i);
		if (i > 0) {
			response.sendRedirect("success.jsp");
		} else {
			response.sendRedirect("error.jsp");
		}
	}

}

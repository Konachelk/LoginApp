package org.konach.mf;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.konach.mf.dto.User;
import org.konach.mf.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String login,password;

	login = request.getParameter("login");
	password = request.getParameter("password");
	
	LoginService loginService = new LoginService();
	boolean result = loginService.authenticate(login, password);
	if (result) {
		User user = loginService.getUserDetails(login);
		request.setAttribute("user", user);
		RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request, response);
		return;
	}
	else {
		response.sendRedirect("login.jsp");
		return;
	}
	}

}

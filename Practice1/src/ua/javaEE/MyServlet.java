package ua.javaEE;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String login = "login";
	private String password = "password";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String resLogin = request.getParameter("lgn");
		String resPassword = request.getParameter("psw");
		PrintWriter out = response.getWriter();
		if(resLogin.equals(login)&&resPassword.equals(password)){
		out.println("<h3>Hello, dear "+login+"</h3>");
		}
		else{
		out.println("<h3>Incorrect data!!!</h3>");
		}
		out.close();
	}
}

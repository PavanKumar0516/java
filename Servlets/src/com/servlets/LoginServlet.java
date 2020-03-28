package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(
		urlPatterns = { "/LoginServlet" }, 
		initParams = { 
				@WebInitParam(name = "username", value = "pavan")
		})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		out.print("WELCOME TO SERVLET<br>");
		out.print("<h1 style='color:red'>Login Page.......</h1>");
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		String date= request.getParameter("dob");
		 User bean=new User();
		 bean.setUname(uname);
		 bean.setPwd(pwd);
		 bean.setDate(date);
		Service service=new Service();
		service.addUser(bean);
		RequestDispatcher   dispatch=request.getRequestDispatcher("/DisplayServlet");
		 dispatch.include(request, response);
		 //dispatch.forward(request, response);
		/*out.print(uname+"<br>");
		out.print(pwd+"<br>");
		out.print(date);*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

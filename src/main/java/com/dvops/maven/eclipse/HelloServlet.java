package com.dvops.maven.eclipse;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
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
		// TODO Auto-generated method stub
		String yourName = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter writer = response.getWriter();
		if (yourName.equals("Eric") && password.equals("eric")) {
			//http://localhost:8080/HelloWorldJava/UserServlet/dashboard
			response.sendRedirect("http://localhost:8080/HelloWorldJava/UserServlet/dashboard");
			writer.println("<h1>Correct</h1>");
		} else {
			writer.println("<h1>Wrong</h1>");
		}

		writer.close();
		doGet(request, response);
	}

}

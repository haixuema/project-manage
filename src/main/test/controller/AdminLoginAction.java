package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AdminLoginAction extends HttpServlet{
	
	protected void doGet(HttpServletRequest requset,HttpServletResponse response) throws ServletException, IOException{
		
		requset.getRequestDispatcher("/admin/login.jsp").forward(requset,response);
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		doGet(request, response);
}

}

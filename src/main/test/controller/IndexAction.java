package controller;

import com.ly.dao.ProjectDao;
import com.ly.dao.jdbc.ProjectDaoImpl;
import com.ly.entity.Project;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public class IndexAction extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	//private ProjectDaoImpl proj;
	private ProjectDao proj = new ProjectDaoImpl();
	
	
	Integer is=1;//在首页显示
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		//公益项目
		List<Project> gy = null;
		try {
			gy = proj.getProjectByIs_index(is,1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("gy",gy);
		
		//农业
		List<Project> ny = null;
		try {
			ny = proj.getProjectByIs_index(is, 2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(ny);
		request.setAttribute("ny", ny);
		
		//出版
		List<Project> cb = null;
		try {
			cb = proj.getProjectByIs_index(is, 3);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("cb",cb);
		
		//艺术
		List<Project> ys = null;
		try {
			ys = proj.getProjectByIs_index(is, 4);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("ys", ys);
		
		//娱乐
		List<Project> yl = null;
		try {
			yl = proj.getProjectByIs_index(is, 5);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("yl", yl);
		
		
		
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
	IOException {
		doGet(request, response);
}
}

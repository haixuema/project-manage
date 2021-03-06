package controller;

import com.ly.constant.Constants;
import com.ly.dao.jdbc.ProjectProgressDaoImpl;
import com.ly.entity.ProjectProgress;
import com.ly.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateProjectProgressAction  extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ProjectProgressDaoImpl projectProgressDaoImpl = new ProjectProgressDaoImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setCharacterEncoding("utf-8");
		String project_id = req.getParameter("projectId");
		String content = req.getParameter("content");
		
		User user = (User) req.getSession().getAttribute(Constants.USER_KEY);
		ProjectProgress projectProgress = new ProjectProgress();
		projectProgress.setProjectId(Integer.parseInt(project_id));
		projectProgress.setContent(content);
		//projectProgress.setPublishDate(publishDate);
		projectProgress.setPubUser(user.getUser_name());
		
		try{
			projectProgressDaoImpl.insertProjectProgress(projectProgress);
			resp.getWriter().print("{\"code\":\"0\",\"msg\":\"发布成功\"}");
		}catch(Exception e){
			resp.getWriter().print("{'code':'-1','msg':'发布失败#####"+e.toString()+"'}");
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	

}

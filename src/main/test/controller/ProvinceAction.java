package controller;

import com.ly.dao.jdbc.ProvinceDaoImpl;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


public class ProvinceAction extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer pid = Integer.parseInt(req.getParameter("pid"));
		ProvinceDaoImpl provinceDaoImpl = new ProvinceDaoImpl();
		
		try {
			JSONArray str = JSONArray.fromObject(provinceDaoImpl.querryProvinceList(pid));
			resp.getWriter().print(str.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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

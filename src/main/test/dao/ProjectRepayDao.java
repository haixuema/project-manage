package dao;

import com.ly.entity.ProjectRepay;

import java.sql.SQLException;
import java.util.List;

/**
 * 项目回报设置接口类
 * @author Hacker110
 *
 */
public interface ProjectRepayDao {

	/** * @date 创建时间：2016年12月18日 下午4:13:44 * @function  * @return 返回值 * @parameter 参数及其意义 * @return   */
	
	/**
	 * 建立回报设置
	 */
	void saveProjectRepay(List<ProjectRepay> projectRepays) throws SQLException;
	/**
	 * id查找
	 */
	ProjectRepay getProjectRepayById(int id) throws SQLException;
	
	/**
	 * id查找
	 */
	List<ProjectRepay> getProjectRepayByProjectId(int project_id) throws SQLException;
}

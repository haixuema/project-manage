package dao;

import com.ly.entity.Projectdetail;

import java.sql.SQLException;
import java.util.List;

/** * @author  Hacker110 * @date 2016年12月18日 下午5:44:34 * @version 1.0  */
public interface ProjectdetailDao {
	
	/**
	 * 添加项目详情
	 */
	void saveProjectdetail(List<Projectdetail> projectdetails) throws SQLException;

}

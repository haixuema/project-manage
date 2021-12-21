package dao;

import com.ly.entity.ProjectProgress;

import java.sql.SQLException;
import java.util.List;

public interface ProjectProgressDao {
	
	void insertProjectProgress(ProjectProgress projectProgress) throws SQLException;
	
	List<ProjectProgress> queryProjectProgress(Integer projectId) throws SQLException;

}

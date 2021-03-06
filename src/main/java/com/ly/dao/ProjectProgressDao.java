package com.ly.dao;

import java.sql.SQLException;
import java.util.List;

import com.ly.entity.ProjectProgress;

public interface ProjectProgressDao {
	
	void insertProjectProgress(ProjectProgress projectProgress) throws SQLException;
	
	List<ProjectProgress> queryProjectProgress(Integer projectId) throws SQLException;

}

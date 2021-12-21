package com.ly.dao;

import java.sql.SQLException;
import java.util.List;

import com.ly.entity.Province;

public interface ProvinceDao {
	
	List<Province> querryProvinceList(int pid) throws SQLException;

}

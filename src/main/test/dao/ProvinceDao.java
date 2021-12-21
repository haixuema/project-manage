package dao;

import com.ly.entity.Province;

import java.sql.SQLException;
import java.util.List;

public interface ProvinceDao {
	
	List<Province> querryProvinceList(int pid) throws SQLException;

}

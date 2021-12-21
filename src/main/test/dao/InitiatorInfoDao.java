package dao;

import com.ly.entity.InitiatorCompanyInfo;
import com.ly.entity.InitiatorPersonInfo;

import java.sql.SQLException;

public interface InitiatorInfoDao {
	/**
	 * 保存个人发起项目身份信息
	 */
	void saveInitiatorPersonInfo(InitiatorPersonInfo initiatorPersonInfo) throws SQLException;
	/**
	 * 保存企业发起项目公司信息
	 */
	void saveInitiatorCompanyInfo(InitiatorCompanyInfo initiatorCompanyInfo) throws SQLException;
	
	InitiatorPersonInfo getInitiatorPersonInfoByProject_id(int project_id) throws SQLException;
	InitiatorCompanyInfo getInitiatorCompanyInfoByProject_id(int project_id) throws SQLException;

}

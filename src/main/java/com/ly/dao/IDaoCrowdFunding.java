package com.ly.dao;

import java.sql.SQLException;
import java.util.List;


public interface IDaoCrowdFunding<T> {
	int addItem(T t) throws SQLException;//添加数据
	int updateItem(T t) throws SQLException;//更新数据
	int deleteItem(Object id) throws SQLException;//删除数据
	List<T> getAllItem() throws SQLException;//获取所有数据
	T getModel(Object id) throws SQLException;//获取单挑数据
	List<T> getItems(T t) throws SQLException;//根据查询条件获取id

}

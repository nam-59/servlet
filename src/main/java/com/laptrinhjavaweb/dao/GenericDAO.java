package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.mapper.RowMapper;

public interface GenericDAO<T> {

	public <T> List<T> query(String sql,RowMapper<T> rowMapper, Object... parameters);
	public void update(String sql,Object... parameters);
	public Long insert(String sql,Object... parameters);
	public int count(String sql,Object... parameters);
}

package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;

public interface RowMapper<T> {
public T mapRow(ResultSet resultSet);
}

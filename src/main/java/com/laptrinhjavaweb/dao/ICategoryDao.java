package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.CategoryModel;

public interface ICategoryDao extends GenericDAO<CategoryModel> {
public List<CategoryModel> findAll();
public CategoryModel findOne(long id);
public CategoryModel findOneByCode(String code);
}

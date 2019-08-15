package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.paging.Pageble;

public interface INewDao extends GenericDAO<NewModel> {
public List<NewModel> findByCategoryId(Long categoryId);
public Long save(NewModel newModel);
public NewModel findOne(Long id);
public void update(NewModel updateNew);
public void delete(long id); 
public List<NewModel> findAll(Pageble pageble);
public int getTotalItem();
}

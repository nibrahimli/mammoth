package com.mammoth.dao;

import java.util.List;

public interface GenericDao<T, PK> {
	
	public int count();
	public void create(T newIstance);
	public void edit(T instance);
	public T find(PK id);
	public List<T> findAll();
	public List<T> findRange(int[] range);
	public void remove(T instance);
}

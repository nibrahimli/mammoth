package com.mammoth.controller;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.mammoth.dao.ProductDao;
import com.mammoth.model.Product;

@Stateless
public class ProductService {

	@Inject
	private ProductDao dao;
	
	public List<Product> findAll() {
		return dao.findAll();
	}
}

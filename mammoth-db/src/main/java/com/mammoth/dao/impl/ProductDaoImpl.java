package com.mammoth.dao.impl;

import javax.ejb.Stateless;

import com.mammoth.dao.ProductDao;
import com.mammoth.model.Product;

@Stateless
public class ProductDaoImpl extends GenericDaoImpl<Product, Long> implements ProductDao{

	public ProductDaoImpl() {
		super(Product.class);
	}
}

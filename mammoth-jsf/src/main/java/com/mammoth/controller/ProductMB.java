package com.mammoth.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;

import com.mammoth.model.Product;
import com.mammoth.model.SalePercentage;

@ManagedBean
public class ProductMB {
	
	Logger LOG = LoggerFactory.logger(getClass());
	
	@Inject
	private ProductService service;
	
	List<Product> products;
	
	public void findAll(){
		products = service.findAll();
		SalePercentage tt = products.get(0).getSalePercentage();
		LOG.info("salepourcentage : " + tt.getId());
		LOG.info("products : " + products);
	}
	
	public List<Product> getProducts() {
		return products;
	}

}

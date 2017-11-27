package com.mammoth.dao.impl;

import javax.ejb.Stateless;

import com.mammoth.dao.SaleDao;
import com.mammoth.model.Sale;

@Stateless
public class SaleDaoImpl extends GenericDaoImpl<Sale, Long> implements SaleDao{

	public SaleDaoImpl() {
		super(Sale.class);
	}

}

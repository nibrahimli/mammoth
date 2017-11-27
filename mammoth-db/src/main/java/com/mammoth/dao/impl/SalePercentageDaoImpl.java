package com.mammoth.dao.impl;

import javax.ejb.Stateless;

import com.mammoth.dao.SalePercentageDao;
import com.mammoth.model.SalePercentage;

@Stateless
public class SalePercentageDaoImpl extends GenericDaoImpl<SalePercentage, Long> implements SalePercentageDao {

	public SalePercentageDaoImpl() {
		super(SalePercentage.class);
	}

}

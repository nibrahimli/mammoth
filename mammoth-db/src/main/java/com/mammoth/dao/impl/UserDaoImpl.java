package com.mammoth.dao.impl;

import javax.ejb.Stateless;

import com.mammoth.dao.UserDao;
import com.mammoth.model.User;

@Stateless
public class UserDaoImpl extends GenericDaoImpl<User, Long> implements UserDao {

	public UserDaoImpl() {
		super(User.class);
	}

}

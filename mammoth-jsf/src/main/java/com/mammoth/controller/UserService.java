package com.mammoth.controller;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.mammoth.dao.UserDao;
import com.mammoth.model.User;

@Stateless
public class UserService {
	
	@Inject
	private UserDao userDao;
	
	public List<User> findAll() {
		return userDao.findAll();
	}	
}

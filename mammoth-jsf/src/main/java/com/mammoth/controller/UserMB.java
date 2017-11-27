package com.mammoth.controller;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;

import com.mammoth.model.User;

import java.io.Serializable;
import java.util.List;

@ManagedBean
public class UserMB implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Logger LOG = LoggerFactory.logger(getClass());

	@Inject
	private UserService userService;

	private List<User> users;
	
	public void findAll(){
		users = userService.findAll();
	}
		
	public List<User> getUsers() {
		return users;
	}
	
}

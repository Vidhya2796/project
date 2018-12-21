package com.vidhyac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vidhyac.dao.LoginDAO;

@Component
public class LoginService {

	@Autowired
	LoginDAO dao;
	public boolean isValidUser(String user,String pass) {
		//System.out.println(user);
		return dao.isValidUser(user,pass);
		
	}
}
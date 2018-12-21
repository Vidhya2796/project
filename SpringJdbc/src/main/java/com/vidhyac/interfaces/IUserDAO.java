package com.vidhyac.interfaces;

import java.util.List;

import com.vidhyac.pojo.User;

public interface IUserDAO {
	
	/*private int userId;
	private String userName;
	private String password;
	private String emailId;
	private long mobileNo;*/
	
	public List<User> getUser(int userId);
	public List<User> getAllUsers();
	public int addUser(int userId,String userName,String password,String emailId,long mobileNo);
	/*public boolean addUser(User user);*/
	public int remove(int userId);
	public int update(int userId,String password);
	/*public boolean check();*/
	
	
	
}

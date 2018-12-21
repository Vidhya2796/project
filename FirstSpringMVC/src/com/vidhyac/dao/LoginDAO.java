package com.vidhyac.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.vidhyac.pojo.UserMapper;
import com.vidhyac.pojo.User;

/*dao is ur model class(parthi) which has access with db and checks the username and pswd coming from request with the db
...it is valid user means this dao or model class tells only true or false ie FLAG..and returns this to the Controller class...
controller will check with the flag value according to that it will give the url path or address like jsp page...
eg if the flag returning from dao is true means the controller will lead the url to welcome.jsp page 
else lead to some msg like "invalid user credentials"*/

@Component
public class LoginDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	

/*	public List<User> getAllUsersFromDb() {
		String sql="select * from usersTable";
		
		 List<User> users = jdbcTemplate.query(sql, new UserMapper());
		 
		
		return users;
	}*/
	
	
	public boolean isValidUser(String user, String pass) {
		String sql="select * from usersTable where USERNAME='"+user+"' and PASSWORD='"+pass+"'";
		
		 List<User> users = jdbcTemplate.query(sql, new UserMapper());
		 /*System.out.println(users);
		 for (User user2 : users) {
			 if(user2.getUsername().equals(user) && user2.getPassword().equals(pass)) {
				 return true;
			 }
		}*/
		 
		 
		return true;
		
	}
	
	
}

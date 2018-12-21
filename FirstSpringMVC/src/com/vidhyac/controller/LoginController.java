package com.vidhyac.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vidhyac.service.LoginService;

@Controller
public class LoginController {
	
	
	@Autowired
	LoginService service;//if you are using autowire means no need of using getters and setters

	@RequestMapping(value = "/", method = RequestMethod.GET)
	  public String showLogin(HttpServletRequest request, HttpServletResponse response) {
	   // ModelAndView mav = new ModelAndView("LoginPage");//LoginPage is ur jsp file
	    //mav.addObject("login", new Login());//Login is ur support or pojo class //login is ur variable which holds Login class's object
		//System.out.println("LOGINN");
	    return "LoginPage";
	  }
	
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out=response.getWriter();
		String user=request.getParameter("uname");
		String password=request.getParameter("pass");
		
		out.println(user);
		out.println(password);
		
		
		if(service.isValidUser(user, password)) {
			out.println("Welcome "+user);
		}else {
			out.println("Enter Valid user Credentials");
		}
		
		return null;
		
	}
	
}
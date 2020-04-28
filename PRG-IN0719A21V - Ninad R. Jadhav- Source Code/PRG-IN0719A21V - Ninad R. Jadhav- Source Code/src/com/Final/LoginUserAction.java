package com.Final;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginUserAction extends ActionSupport implements SessionAware{

	
	private static final long serialVersionUID = -3353507406394033775L;
	private String Email;
	private String Password;
	ArrayList<UserPojo> bean = null;
	UserPojo user = null;
	private SessionMap<String,Object> sessionMap;
	
	public void setBean(ArrayList<UserPojo> bean)
	{
		this.bean = bean;
	}
	
	public ArrayList<UserPojo> getBean()
	{
		return bean;
	}
	public void setEmail(String Email)
	{
		this.Email = Email;
	}

	public String getEmail()
	{
		return this.Email;
	}
	
	public void setPassword(String Password)
	{
		this.Password= Password;
	}
	
	public String getPassword()
	{
		return this.Password;
	}
	
	public void setSession(Map<String, Object> map) {  
	    this.sessionMap=(SessionMap)map;  
	}  
	
	
	public String execute() throws SQLException, Exception
	{   
	
	if(Email != null) {
		AppDao bao = new AppDao();
		boolean check = bao.loginCheck(Email,Password);
	
		if(check == true)
		{
			String msg = "Logged in Successfully my boy!";
			System.out.println(msg);
			
		}
		else 
		{
			String msg ="Please Enter Correct Credentials" ;
			System.out.println(msg);
			addActionMessage("Please enter Correct Credentials");
			return "backLogin";
			
			
		}
		
	}
	sessionMap.put("login","true");  
	sessionMap.put("Email",Email);
	  
	 return "login";
	
	}
	
	public String adminLogin() throws SQLException, Exception
	{
		if(Email != null)
		{
			AppDao nao = new AppDao();
			boolean checking = nao.adminLogin(Email, Password);
			
			if(checking == true)
			{
				String msg="Admin Login Successfully!";
				System.out.println(msg);
			}
			else 
			{
				String msg= "Some Error Occurred";
				System.out.println(msg);
				addActionMessage("Are You Sure You Are An Admin");
				return "error";
			}
			
			sessionMap.put("logins","true");  
			sessionMap.put("Email",Email);  
		}
		return "admin";
	}
	
	public String logout(){  
	    if(sessionMap!=null){  
	        sessionMap.invalidate();  
	    }  
	    return "logout";  
	}  
   
	
	}
	


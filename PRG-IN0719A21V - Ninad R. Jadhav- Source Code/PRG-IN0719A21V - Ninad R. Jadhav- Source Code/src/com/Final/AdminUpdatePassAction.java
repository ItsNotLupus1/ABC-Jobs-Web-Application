package com.Final;

import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class AdminUpdatePassAction extends ActionSupport {
	
	
	private static final long serialVersionUID = 9019921730813578963L;
	private String Password;
	
	public void setPassword(String Password)
	{
		this.Password = Password;
	}
	
	public String getPassword()
	{
		return Password;
	}

	public String execute() throws SQLException, Exception 
	{
		HttpSession session=ServletActionContext.getRequest().getSession(false); 
		 
        if(session==null || session.getAttribute("mail")==null){  
        	return "Failure";
             
        }  
        
        else 
        {
        	String Email = (String) session.getAttribute("Email");
        	
        	
        	AppDao bao = new AppDao();
        	int insert = bao.updatePasss(Email, Password);
        	String msgs;
        	if (insert > 0) 
        	{
        		msgs = "Update Successfull";
        		addActionMessage("Your Password has been updated Successfully");
        	} 
        	else
        	{
        		addActionMessage("Some error Ocuurred we couldn't update your password!");
        		return "error";
        	}
         } 
        		return "updatepass";
        	
        }
}

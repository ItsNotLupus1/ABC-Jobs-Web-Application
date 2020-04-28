package com.Final;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport {


	private static final long serialVersionUID = -5506317539477104999L;
	
	private String Email;
	
	public void setEmail(String Email)
	{
		this.Email = Email;
	}
	
	public String getEmail()
	{
		return Email;
	}

	public String execute() throws SQLException, Exception
	{   int y = 0;
		AppDao zao = new AppDao();
		y = zao.deleteUsers(Email);
		System.out.println(y);
		
		if(y>0)
		{
			String msg ="Record deleted Successfully";
			System.out.println(msg);
		}
		else
		{
			String msg = "Delete Failed";
			System.out.println(msg);
		}
		
		return "Delete";
	}
}

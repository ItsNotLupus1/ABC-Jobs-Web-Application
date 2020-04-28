package com.Final;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class OtpAction extends ActionSupport {

	private static final long serialVersionUID = -7091825633312754489L;

	UserPojo user = null;
	int ctr = 0; 
	String messageotp;
	
	public void setUser(UserPojo user)
	{
		this.user = user;
	}
	
	public UserPojo getUser()
	{
		return user;
	}
	
	public void setctr(int ctr)
	{
		this.ctr = ctr;
	}
	
	public int getctr()
	{
		return ctr;
	}
	
	public void setmessageotp(String messageotp)
	{
		this.messageotp = messageotp;
	}
	
	public String getmessageotp()
	{
		return messageotp;
	}
	
	@Override
	public String execute() throws Exception 
	{
	HttpSession session=ServletActionContext.getRequest().getSession(false);
	
	if(session==null || session.getAttribute("mail")==null){  
    	
		return "Failure";
         
    }  
	
		int otp = (Integer) session.getAttribute("otp");
		
		
		System.out.println(user.getOtpvalue());
		
		if(otp == user.getOtpvalue())
		{
			
			System.out.println("Otp matches");
		}
		
		else
		{
			messageotp = "Otp entered is not correct";
			System.out.println("opt does not match");
			return "error";
		}
		
	
	
	return "OtpProcess";
}
	
}
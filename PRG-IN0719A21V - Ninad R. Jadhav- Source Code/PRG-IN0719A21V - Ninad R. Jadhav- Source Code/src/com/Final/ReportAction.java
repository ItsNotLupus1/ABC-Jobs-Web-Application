package com.Final;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ReportAction extends ActionSupport{

	private static final long serialVersionUID = -4606827302097183257L;
	 
	ResultSet rss = null;
	ResultSet rs = null;
	
	UserPojo bean = null;
	private String email;
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getEmail()
	{
		return email;
	}

	ArrayList<UserPojo> beanList = null;
	
	AppDao admin = new AppDao();
	AppDao admins = new AppDao();
	private boolean noData = false;
	private boolean noDatas = false;
	@Override
	public String execute() throws Exception {
		 HttpSession session=ServletActionContext.getRequest().getSession(false); 
		 
	        if(session==null || session.getAttribute("login")==null){  
	        	return "Failure";
	             
	        }  
	        
	        
	        else{  
               String Email = (String) session.getAttribute("Email");
	        	
	        	beanList = new ArrayList<UserPojo>();
	        	rs= admin.report(Email);
	        	
	        	int i = 0;
	        	
	        	if (rs != null) {
	        	while (rs.next()) {
	        	i++;
	        	bean = new UserPojo();
	        	bean.setFname(rs.getString("first_name"));
	        	bean.setLname(rs.getString("last_name"));
	        	bean.setUname(rs.getString("username"));
	        	bean.setEmail(rs.getString("email"));
	        	bean.setPassword(rs.getString("password"));
	        	bean.setCompany(rs.getString("Company"));
	        	bean.setCountry(rs.getString("Country"));
	        	bean.setJob_Title(rs.getString("Job_Title"));
	        	bean.setAbout(rs.getString("About"));
	        	bean.setEducation(rs.getString("Education"));
	        	bean.setExperience(rs.getString("Experience"));
	        	beanList.add(bean);
	        	}
	        	}
	        	
	        	
	        	if (i == 0) {
	        	noData = false;
	        	} 
	        	
	        	
	        	else {
	        	noData = true;
	        	}
	        	
	        	
	            return "REPORT";  
	        }  
		
	
	
	}
	
	
	
	public String adminProfile() throws SQLException, Exception
	{
		HttpSession session=ServletActionContext.getRequest().getSession(false); 
		
		if(session==null || session.getAttribute("logins")==null){  
        	return "Failure";
             
        }  
		
		else
		{
			String Email = (String) session.getAttribute("Email");
			
			beanList = new ArrayList<UserPojo>();
        	rss= admin.allUsersList();
        	int y= 0;
        	
        	if(rss != null)
        	{
        		while(rss.next())
        		{
        			y++;
        			bean = new UserPojo();
        			bean.setFname(rss.getString("first_name"));
    	        	bean.setLname(rss.getString("last_name"));
    	        	bean.setUname(rss.getString("username"));
    	        	bean.setEmail(rss.getString("email"));
    	        	bean.setPassword(rss.getString("password"));
    	        	bean.setCompany(rss.getString("Company"));
    	        	bean.setCountry(rss.getString("Country"));
    	        	bean.setJob_Title(rss.getString("Job_Title"));
    	        	bean.setAbout(rss.getString("About"));
    	        	bean.setEducation(rss.getString("Education"));
    	        	bean.setExperience(rss.getString("Experience"));
    	        	beanList.add(bean);
        		}
        	}
        	
        	if (y == 0) {
	        	noDatas = false;
	        	System.out.println("Sorry we didn't get any record back from db");
	        	} else {
	        	noDatas = true;
	        	}
        	
        	
        	
		}
		
		return "AdminProfile";
        
	}
	public boolean isNoData() {
	return noData;
	}
	public void setNoData(boolean noData) {
	this.noData = noData;
	}
	public ArrayList<UserPojo> getBeanList() {
	return beanList;
	}
	public void setBeanList(ArrayList<UserPojo> beanList) {
	this.beanList = beanList;
	}
	}



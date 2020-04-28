package com.Final;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport {

	
	private static final long serialVersionUID = -6750168050684601868L;
	private String Search;
	
	ResultSet rs = null;
	ResultSet rsss = null;
	UserPojo bean = null;
	UserPojo beans = null;
	ArrayList<UserPojo> beanList = null;
	ArrayList<UserPojo> beanl = null;
	AppDao admins = new AppDao();
	private boolean noData = false;
	private String email;
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String search() throws Exception
	{
		
		beanList = new ArrayList<UserPojo>();
		if(Search == "") {
			addActionMessage("Search Field is Mandatory");
			return "error";
		}
		else {
    	rs = admins.userList(Search);
    	System.out.println(Search);
    	int i = 0;
    	
    	while (rs.next()) {
    	i++;
    	bean = new UserPojo();
    	bean.setFname(rs.getString("first_name"));
    	bean.setLname(rs.getString("last_name"));
    	bean.setCompany(rs.getString("Company"));
    	bean.setCountry(rs.getString("Country"));
    	bean.setEmail(rs.getString("email"));
    	beanList.add(bean);
    	}
    	
    	
    	
    	if (i == 0) {
    	noData = false;
    	
    	
    	
    	} else {
    	noData = true;
    	}
		}
    	
        return "successful";  
	}
	
	public String fullprofile() throws SQLException, Exception
	{
	
		beanl = new ArrayList<UserPojo>();
		
		System.out.println(email);
		rsss = admins.report(email);
		
		int i = 0;
    	
    	if (rsss != null) {
    	while (rsss.next()) {
    	i++;
    	System.out.println(i);
    	beans = new UserPojo();
    	beans.setFname(rsss.getString("first_name"));
    	beans.setLname(rsss.getString("last_name"));
    	beans.setUname(rsss.getString("username"));
    	beans.setEmail(rsss.getString("email"));
    	beans.setPassword(rsss.getString("password"));
    	beans.setCompany(rsss.getString("Company"));
    	beans.setCountry(rsss.getString("Country"));
    	beans.setJob_Title(rsss.getString("Job_Title"));
    	beans.setAbout(rsss.getString("About"));
    	beans.setEducation(rsss.getString("Education"));
    	beans.setExperience(rsss.getString("Experience"));
    	
    	beanl.add(beans);
    	}
    	}
    	
    	System.out.println(i);
    	if (i == 0) {
    	noData = false;
    	} else {
    	noData = true;
    	}
    	
    	
        return "REPORTS";  
		
		
	}
	
	public void setSearch(String Search)
	{
		this.Search = Search;
	}
	
	public String getSearch()
	{
		return Search;
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
	
	public void setBeanl(ArrayList<UserPojo> beanl)
	{
		this.beanl = beanl;
	}
	
	public ArrayList<UserPojo> getBeanl()
	{
		return beanl;
	}
	
	public void setBeanList(ArrayList<UserPojo> beanList) {
		this.beanList = beanList;
		}
}




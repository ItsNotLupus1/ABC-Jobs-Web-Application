package com.Final;


import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateAction extends ActionSupport{

	private static final long serialVersionUID = -1561443970643900046L;
    private String Fname;
    private String Lname;
    private String Uname;
    private String About;
    private String Education;
    private String Experience;
    private String Company;
    private String Country;
    private String Job_Title;
	
	public String getJob_Title() {
		return Job_Title;
	}



	public void setJob_Title(String job_Title) {
		Job_Title = job_Title;
	}



	public String getFname() {
		return Fname;
	}



	public void setFname(String fname) {
		Fname = fname;
	}



	public String getLname() {
		return Lname;
	}



	public void setLname(String lname) {
		Lname = lname;
	}



	public String getUname() {
		return Uname;
	}



	public void setUname(String uname) {
		Uname = uname;
	}



	public String getAbout() {
		return About;
	}



	public void setAbout(String about) {
		About = about;
	}



	public String getEducation() {
		return Education;
	}



	public void setEducation(String education) {
		Education = education;
	}



	public String getExperience() {
		return Experience;
	}



	public void setExperience(String experience) {
		Experience = experience;
	}



	public String getCompany() {
		return Company;
	}



	public void setCompany(String company) {
		Company = company;
	}



	public String getCountry() {
		return Country;
	}



	public void setCountry(String country) {
		Country = country;
	}



	public String execute() throws SQLException, Exception 
	{
		HttpSession session=ServletActionContext.getRequest().getSession(false); 
		 
        if(session==null || session.getAttribute("login")==null){  
        	return "Failure";
             
        }  
        
        else 
        {
        	String Email = (String) session.getAttribute("Email");
        	
        	AppDao bao = new AppDao();
        	int insert = bao.updateProfile(Fname,Lname,Uname,About,Education,Experience,Company,Country,Job_Title, Email);
        	String msgs;
        	if (insert > 0) 
        	{
        		msgs = "Update Successfull";
        	} 
        	else
        	{
        		msgs = "Some error";
        	}
         } 
        		return "update";
        	
        }
	
	
	
	public String updateJsp()
	{
		return "redirect";
	}
	}


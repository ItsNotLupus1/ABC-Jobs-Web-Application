package com.Final;

import java.util.Map;
import java.util.Properties;
import java.util.Random;

import javax.mail.*;
import javax.mail.internet.*;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;



public class MailAction extends ActionSupport implements SessionAware{
  
	private static final long serialVersionUID = 9222489101317421465L;
		private String Email;
	      private boolean noData = false;
	      private SessionMap<String,Object> sessionMaps;
	      
	      public void setEmail(String Email)
	      {
	    	  this.Email = Email;
	      }
	      
	      public String getEmail()
	      {
	    	  return this.Email;
	      }
	      
	      public void setSession(Map<String, Object> map) {  
	  	    this.sessionMaps=(SessionMap)map;  
	  	}  
	  	
	      
	      public String execute() throws SQLException, Exception
	      {
	    	 
	    	  
	    		  AppDao mao = new AppDao();
	    		  ResultSet rs = mao.reports(Email);
	    		
	    		  int i = 0;
	    		 
	    		 
	    		  while(rs.next())
	    		  {
	    			i++;
	    			Random rand = new Random();
	    			int otp = rand.nextInt(900000) + 100000; 
	    			
	    		    String to=Email;
	    			//Getting the session object
	    			Properties props = new Properties();
	    			props.put("mail.smtp.host", "smtp.gmail.com");
	    			props.put("mail.smtp.socketFactory.port", "465");
	    			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	    			props.put("mail.smtp.auth", "true");
	    			props.put("mail.smtp.port", "465");
	    			Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
	    			protected PasswordAuthentication getPasswordAuthentication() 
	    			{
	    			return new PasswordAuthentication("abcjobsofficial@gmail.com","abc123456.com");
	    			}
	    			});
	    			
	    			try {
	    				MimeMessage message = new MimeMessage(session);
	    				message.setFrom(new InternetAddress("abcjobsofficial@gmail.com"));
	    				message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
	    				message.setSubject("Hello");
	    				message.setText("The otp is  " + otp);
	    				//send message
	    				Transport.send(message);
	    				System.out.println("message sent successfully " + otp);
	    				 
	    				  
	    				} 
	    			catch (MessagingException e)
	    			      {
	    					throw new RuntimeException(e);
	    					
	    					
	    			      }
	    			sessionMaps.put("mail","true");  
	    			sessionMaps.put("otp",otp); 
	    			sessionMaps.put("Email",Email);
	    			  
	    			return "success";
	    		  }
	    		 
	    		 
	    		
	    		  
	    		  if (i == 0) {
	  	        	noData = false;
	  	        	System.out.println("Email is incorrect!");
	  	        	return "Error";
	  	        	} else {
	  	        	noData = true;
	  	        	System.out.println("Email is correct!");
	  	        	}
	    		  
	    		
	    	  
	    		 return "success";	    	
	    	  
	    	  
	      }
	
	      public boolean isNoData() {
	    		return noData;
	    		}
	    		public void setNoData(boolean noData) {
	    		this.noData = noData;
	    		}
	      
	 
	
}


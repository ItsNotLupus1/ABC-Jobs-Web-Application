package com.Final;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private static final long serialVersionUID = 2139116285823340125L;
	private String Fname, Lname, Uname, Email, Password, Company, Country;
	private String msg = "";
	AppDao admin = null;
	int ctr = 0;

	@Override
	public String execute() throws Exception {
		if (Email != "") {

			admin = new AppDao();
			boolean check = admin.registerEmailCheck(Email);
			if (check == false) {
				try {
					ctr = admin.registerUser(Fname, Lname, Uname, Email, Password, Company, Country);
					if (ctr > 0) {
						msg = "Registration Successfull";
						String to = Email;
						Properties props = new Properties();
						props.put("mail.smtp.host", "smtp.gmail.com");
						props.put("mail.smtp.socketFactory.port", "465");
						props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
						props.put("mail.smtp.auth", "true");
						props.put("mail.smtp.port", "465");
						Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
							protected PasswordAuthentication getPasswordAuthentication() {
								return new PasswordAuthentication("abcjobsofficial@gmail.com", "abc123456.com");
							}
						});

						try {
							MimeMessage message = new MimeMessage(session);
							message.setFrom(new InternetAddress("abcjobsofficial@gmail.com"));
							message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
							message.setSubject("Hello");
							message.setText("Welcome to the Professional Community of ABC Jobs, " + Fname);
							// send message
							Transport.send(message);
							System.out.println("message sent successfully " + Fname);

						} catch (MessagingException e) {
							throw new RuntimeException(e);

						}
					} else {
						msg = "Some error";
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Registration done");
				return "register";

			} else {
				System.out.println("This Email is Already In Use");
				addActionMessage("This Email is Already In Use");
				return "backRegister";
			}
		}
		return "error";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCtr() {
		return ctr;
	}

	public void setCtr(int ctr) {
		this.ctr = ctr;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String Fname) {
		this.Fname = Fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String Lname) {
		this.Lname = Lname;
	}

	public String getUname() {
		return Uname;
	}

	public void setUname(String Uname) {
		this.Uname = Uname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}

	public void setCompany(String Company) {
		this.Company = Company;
	}

	public String getCompany(String Company) {
		return Company;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}
}

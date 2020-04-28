package com.Final;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class AppDao {
	
	public static Connection getConnection() throws Exception {
		Connection connection = null;
		try {
			// loading driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			// getting hold of driver manager
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost/in0719a21v?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"IN0719A21V", "q1Xg8761E");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

// method for save user data in database
	public int registerUser(String Fname, String Lname, String Uname, String Email, String Password, String Company,
			String Country) throws Exception {
		int i = 0;
		try {
			String sql = "INSERT INTO lols(first_name, last_name, username, email, password, Company, Country) VALUES (?,?,?,?,?,?,?)";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, Fname);
			ps.setString(2, Lname);
			ps.setString(3, Uname);
			ps.setString(4, Email);
			ps.setString(5, Password);
			ps.setString(6, Company);
			ps.setString(7, Country);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			return i;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}

//method for fetching saved user data
	public ResultSet report(String Email) throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT * FROM lols where email = ?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, Email);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}

//method for fetch old data to be update
	public int updateProfile(String Fname, String Lname, String Uname, String About, String Education,
			String Experience, String Company, String Country, String Job_Title, String Email)
			throws SQLException, Exception {
		int i = 0;
		try {
			String sqls = "Update lols set first_name = ?, last_name = ?, username = ?, About = ?, Education = ?, Experience = ?, Company = ?, Country = ?, Job_Title = ? where email = ?";
			PreparedStatement ps = getConnection().prepareStatement(sqls);
			ps.setString(1, Fname);
			ps.setString(2, Lname);
			ps.setString(3, Uname);
			ps.setString(4, About);
			ps.setString(5, Education);
			ps.setString(6, Experience);
			ps.setString(7, Company);
			ps.setString(8, Country);
			ps.setString(9, Job_Title);
			ps.setString(10, Email);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception f) {
			f.printStackTrace();
		}
		return i;
	}

	public boolean loginCheck(String Email, String Password) throws SQLException, Exception {
		boolean status = false;
		try {
			String sqls = "Select * from lols WHERE email=? and password=?";
			PreparedStatement ps = getConnection().prepareStatement(sqls);
			ps.setString(1, Email);
			ps.setString(2, Password);
			ResultSet rs = ps.executeQuery();
			status = rs.next();
		} catch (SQLException e) {
			e.printStackTrace();

		} catch (Exception b) {
			b.printStackTrace();

		}
		return status;

	}

	public ResultSet userList(String Search) throws SQLException, Exception {
		ResultSet rs = null;

		try {
			String sql = "SELECT * FROM lols where first_name Like ? or last_name Like ? or Company Like ? or Country Like ?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, "%" + Search + "%");
			ps.setString(2, "%" + Search + "%");
			ps.setString(3, "%" + Search + "%");
			ps.setString(4, "%" + Search + "%");

			rs = ps.executeQuery();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}

		}

		return rs;

	}

	public ResultSet reports(String Email) throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT * FROM lols where email = ?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, Email);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}

	public ResultSet reportss(String Email) throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT * FROM admin where Email = ?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, Email);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}

	public int updatePass(String Email, String Password) throws SQLException, Exception {
		int i = 0;
		try {
			String sqls = "Update lols set password = ? where email = ?";
			PreparedStatement ps = getConnection().prepareStatement(sqls);
			ps.setString(1, Password);
			ps.setString(2, Email);

			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception f) {
			f.printStackTrace();
		}
		return i;
	}

	public int updatePasss(String Email, String Password) throws SQLException, Exception {
		int i = 0;
		try {
			String sqls = "Update admin set Password = ? where Email = ?";
			PreparedStatement ps = getConnection().prepareStatement(sqls);
			ps.setString(1, Password);
			ps.setString(2, Email);

			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception f) {
			f.printStackTrace();
		}
		return i;
	}

	public boolean adminLogin(String Email, String Password) throws SQLException, Exception {
		ResultSet rs = null;
		boolean check = false;

		try {
			String sql = "Select * From admin where Email = ? and Password = ?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, Email);
			ps.setString(2, Password);
			rs = ps.executeQuery();
			check = rs.next();

		} catch (SQLException b) {
			b.printStackTrace();
		}

		return check;
	}

	public ResultSet allUsersList() throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "Select * from lols";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			rs = ps.executeQuery();

		} catch (SQLException b) {
			b.printStackTrace();
			return null;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}

		return rs;
	}

	public int deleteUsers(String Email) throws SQLException, Exception {
		int i = 0;
		try {
			String sql = "Delete from lols where email = ?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, Email);
			System.out.println(Email);
			i = ps.executeUpdate();
		} catch (SQLException b) {
			b.printStackTrace();
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}

		return i;
	}
	
	public boolean registerEmailCheck(String Email) throws Exception
	{
	 boolean check = false;
	 
	 try 
	 {
		 String sql = "Select * From lols where email = ?";
		 PreparedStatement ps = getConnection().prepareStatement(sql);
		 ps.setString(1, Email);
		 ResultSet rs = ps.executeQuery();
		 check = rs.next();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 
	 return check;
	}

}

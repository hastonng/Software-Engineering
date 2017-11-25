import java.sql.*;

public class Login {

	private String tempUsername;
	private String tempPassword;
	private int userRole;
	private boolean loginValidation;
	
	
	
	
	public boolean isLoginValidation() {
		return loginValidation;
	}

	public void setLoginValidation(boolean loginValidation) {
		this.loginValidation = loginValidation;
	}
	
	public int getUserRole() {
		return userRole;
	}

	public void setUserRole(int userRole) {
		this.userRole = userRole;
	}
	
	
	public void login(String uName, String pW) {
		
		try {
			String  Sql = "select employeeID,password from oversurgerysystem.employee where employeeID='"+uName+"'";
			
			
			DbConnector conStr = new DbConnector();
			Class.forName(conStr.getForName());
			Connection connection = DriverManager.getConnection("jdbc:mysql://"+conStr.getHostname()+":3306/oversurgerysystem",conStr.getUserName(),conStr.getPassword());
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(Sql);
			
			while (rs.next()) {
				tempUsername = rs.getString("employeeID");
				tempPassword = rs.getString("password");
			}
			
			rs.close();
			stmt.close();
			connection.close();
			
			
			checkLogin(uName,pW);
			if(loginValidation ==true) {
				checkRole (uName);
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void checkLogin(String uN, String p) {
		
		
		if(uN.equals(tempUsername)) {
			if (p.equals(tempPassword)) {
				loginValidation=true;
			}
			else
				loginValidation = false;
		}
		else 
			loginValidation = false;
	}
	
	public void checkRole(String uN) {
		
		String Sql = "select role from oversurgerysystem.employee where employeeID='"+uN+"'";
		
		try {
			
			DbConnector conStr = new DbConnector();
			Class.forName(conStr.getForName());
			Connection connection = DriverManager.getConnection("jdbc:mysql://"+conStr.getHostname()+":3306/oversurgerysystem",conStr.getUserName(),conStr.getPassword());
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(Sql);
			
			while(rs.next()) {
				userRole = rs.getInt("role");
			}
			
			
			rs.close();
			stmt.close();
			connection.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
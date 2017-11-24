import java.sql.*;

public class Login {

	private String tempUsername;
	private String tempPassword;
	private int userRole;
	private boolean loginValidation;
	
	private DbConnector conStr = new DbConnector();
	
	
	
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
	
	
	public void login(String uName, String pW) throws SQLException {
		
		try {
			String  Sql = "select employeeID,password from oversurgerysystem.employee where employeeID='"+uName+"'";
			
			
			Class.forName(conStr.getForName());
			Connection connection = DriverManager.getConnection(conStr.getConnection());
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(Sql);
			
			while (rs.next()) {
				tempUsername = rs.getString("employeeID");
				tempPassword = rs.getString("password");
			}
			
			
			checkLogin(uName,pW);
			if(loginValidation ==true) {
				checkRole (uName);
			}
			
			
			
		} catch (ClassNotFoundException e) {
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
		
		String Sql = "select USER_ROLE from ECRS_SCHEMA.ECRS_USER where USER_ID='"+uN+"'";
		
		try {
			Class.forName(conStr.getForName());
			Connection connection = DriverManager.getConnection(conStr.getConnection());
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(Sql);
			
			while(rs.next()) {
				userRole = rs.getInt("role");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
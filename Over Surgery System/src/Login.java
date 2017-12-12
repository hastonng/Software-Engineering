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
			String  Sql = "select EMPLOYEE_ID,PASSWORD from oversurgerysystem.employee where EMPLOYEE_ID='"+uName+"' AND PASSWORD='"+pW+"';";
			
			
			Connection connection = ConnectionSingleton.getInstance();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(Sql);

			
			while (rs.next()) {
				tempUsername = rs.getString("EMPLOYEE_ID");
				tempPassword = rs.getString("PASSWORD");
			}
			
			System.out.println(Sql);
			
			rs.close();
			stmt.close();
			
			
			
			if(tempUsername == null || tempPassword == null) {
				loginValidation = false;
			}
			else
			{
				
				loginValidation = true;
				checkRole (uName);
				
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			
			loginValidation = false;
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
		
		String Sql = "select ROLE from oversurgerysystem.employee where EMPLOYEE_ID='"+uN+"'";
		
		try {
			
			Connection connection = ConnectionSingleton.getInstance();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(Sql);
			
			while(rs.next()) {
				userRole = rs.getInt("ROLE");
			}
			
			System.out.println(Sql);
			rs.close();
			stmt.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
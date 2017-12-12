import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.PreparedStatement;

public class Employee {
	private static String employeeID;
	private static String password;
	private static String employeeName;
	private static String dateOfBirth;
	private static String email;
	private static String phoneNum;
	private static String gender;
	private static String address;
	private static String nricNum;
	private static int role;
	private static String start_date;
	private static String end_date;
	private static String start_time;
	private static String end_time;
	private boolean employeeAvailable;
	private boolean employeeExist = false;
	private static String latestId;
	


	

	
	public static String getEmployeeID() {
		return employeeID;
	}



	public static void setEmployeeID(String employeeID) {
		Employee.employeeID = employeeID;
	}



	public static String getPassword() {
		return password;
	}



	public static void setPassword(String password) {
		Employee.password = password;
	}



	public static String getEmployeeName() {
		return employeeName;
	}



	public static void setEmployeeName(String employeeName) {
		Employee.employeeName = employeeName;
	}



	public static String getDateOfBirth() {
		return dateOfBirth;
	}



	public static void setDateOfBirth(String dateOfBirth) {
		Employee.dateOfBirth = dateOfBirth;
	}



	public static String getEmail() {
		return email;
	}



	public static void setEmail(String email) {
		Employee.email = email;
	}



	public static String getPhoneNum() {
		return phoneNum;
	}



	public static void setPhoneNum(String phoneNum) {
		Employee.phoneNum = phoneNum;
	}



	public static String getGender() {
		return gender;
	}



	public static void setGender(String gender) {
		Employee.gender = gender;
	}



	public static String getAddress() {
		return address;
	}



	public static void setAddress(String address) {
		Employee.address = address;
	}



	public static String getNricNum() {
		return nricNum;
	}



	public static void setNricNum(String nricNum) {
		Employee.nricNum = nricNum;
	}



	public static int getRole() {
		return role;
	}



	public static void setRole(int role) {
		Employee.role = role;
	}



	public static String getStart_date() {
		return start_date;
	}



	public static void setStart_date(String start_date) {
		Employee.start_date = start_date;
	}



	public static String getEnd_date() {
		return end_date;
	}



	public static void setEnd_date(String end_date) {
		Employee.end_date = end_date;
	}



	public static String getStart_time() {
		return start_time;
	}



	public static void setStart_time(String start_time) {
		Employee.start_time = start_time;
	}



	public static String getEnd_time() {
		return end_time;
	}



	public static void setEnd_time(String end_time) {
		Employee.end_time = end_time;
	}



	public boolean isEmployeeAvailable() {
		return employeeAvailable;
	}



	public void setEmployeeAvailable(boolean employeeAvailable) {
		this.employeeAvailable = employeeAvailable;
	}



	public boolean isEmployeeExist() {
		return employeeExist;
	}



	public void setEmployeeExist(boolean employeeExist) {
		this.employeeExist = employeeExist;
	}



	public static String getLatestId() {
		return latestId;
	}



	public static void setLatestId(String latestId) {
		Employee.latestId = latestId;
	}



	public void employeeExistDetails(String employeeId) {
		try {
			
			String Sql = "select * from oversurgerysystem.employee where EMPLOYEE_ID='"+employeeId+"';";
			
			Connection connection = ConnectionSingleton.getInstance();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(Sql);
			
			while (rs.next()) {
				
				employeeID = rs.getString("EMPLOYEE_ID");
				employeeName = rs.getString("EMPLOYEE_NAME");
				nricNum = rs.getString("NRIC_NUM");
				dateOfBirth = rs.getString("DOB");
				gender = rs.getString("GENDER");
				address = rs.getString("ADDRESS");
				phoneNum = rs.getString("PHONE_NO");
				role = rs.getInt("ROLE");
				email = rs.getString("EMAIL");
				
			}
			
			System.out.println(Sql);
			
			rs.close();
			stmt.close();
			
			if(employeeID == null) {
				employeeExist = false;
				System.out.println(employeeExist);
			}else
				employeeExist = true;
			System.out.println(employeeExist);
			
			
		}catch(Exception ex) {
			
		}
	}
	
	

	public void checkGpAvailability(String currentDate) {
		
		try{
		
				String Sql = String.format( "select * from oversurgerysystem.GP_AVAILABILITY where GP_ID='%s' AND  '%s' >= START_NON_AVAILABLE_DATE AND '%s' <= END_NON_AVAILABLE_DATE" , employeeID , currentDate , currentDate );
				
					Connection connection = ConnectionSingleton.getInstance();
					Statement stmt = connection.createStatement();
					ResultSet rs = stmt.executeQuery(Sql);
					
					while(rs.next())
					{
						employeeID = rs.getString("GP_ID");
						start_date = rs.getString("START_NON_AVAILABLE_DATE");
						end_date = rs.getString("END_NON_AVAILABLE_DATE");
						start_time = rs.getString("START_NON_AVAILABLE_TIME");
						end_time = rs.getString("END_NON_AVAILABLE_TIME");
					}
					
					System.out.println(Sql);
					System.out.println(start_date);
					System.out.println(start_time);
					
					rs.close();
					stmt.close();
					
					if(currentDate.equals(start_date) || currentDate.equals(end_date)) {
						employeeAvailable = false;						
					}
					else
						employeeAvailable = true;
					
			}
		catch (SQLException e) {
			employeeAvailable = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		
		public void checkNurseAvailability(String currentDate) {
			
			try{
			
					String Sql = String.format( "select * from oversurgerysystem.NURSE_AVAILABILITY where NURSE_ID='%s' AND  '%s' >= START_NON_AVAILABLE_DATE AND '%s' <= END_NON_AVAILABLE_DATE" , employeeID , currentDate , currentDate );
					
						Connection connection = ConnectionSingleton.getInstance();
						Statement stmt = connection.createStatement();
						ResultSet rs = stmt.executeQuery(Sql);
						
						while(rs.next())
						{
						
							employeeID = rs.getString("NURSE_ID");
							start_date = rs.getString("START_NON_AVAILABLE_DATE");
							end_date = rs.getString("END_NON_AVAILABLE_DATE");
							start_time = rs.getString("START_NON_AVAILABLE_TIME");
							end_time = rs.getString("END_NON_AVAILABLE_TIME");
						}
						
						System.out.println(Sql);
						System.out.println(start_date);
						System.out.println(start_time);
						
						
						rs.close();
						stmt.close();
						
						if(currentDate.equals(start_date) || currentDate.equals(end_date)) {
							employeeAvailable = false;						
						}
						else
							employeeAvailable = true;
						
						
				}
			catch (SQLException e) {
				employeeAvailable = true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
		
		
		
		
		
		
		
	public void getGpForTable(String currentDate) {
		try {
			
			String Sql = String.format("select GP_ID from oversurgerysystem.GP_AVAILABILITY where '%s' >= START_NON_AVAILABLE_DATE AND '%s' <= END_NON_AVAILABLE_DATE", currentDate,currentDate); 
			
			Connection connection = ConnectionSingleton.getInstance();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(Sql);
			
			while (rs.next()) {
				employeeID = rs.getString("GP_ID");
			}
			
			System.out.println(Sql);
			rs.close();
			stmt.close();
			
			
		}catch(Exception e) {
			
		}
	}
	
	
	public void getNurseForTable(String currentDate) {
		try {
			
			String Sql = String.format("select NURSE_ID from oversurgerysystem.NURSE_AVAILABILITY where '%s' >= START_NON_AVAILABLE_DATE AND '%s' <= END_NON_AVAILABLE_DATE", currentDate,currentDate); 
			
			Connection connection = ConnectionSingleton.getInstance();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(Sql);
			
			while (rs.next()) {
				employeeID = rs.getString("NURSE_ID");
			}
			
			System.out.println(Sql);
			rs.close();
			stmt.close();
			
			
		}catch(Exception e) {
			
		}
	}
	
	
	
	public void setGpAvailable(String gpId, String startDay, String endDay, String startTime, String endTime) {

		try {
			
			
			System.out.println(gpId + " "+ startDay +" "+endDay+" "+startTime+" "+endTime);
			
			String Sql="INSERT INTO GP_AVAILABILITY (AVAILABILITY_ID, GP_ID,START_NON_AVAILABLE_DATE,END_NON_AVAILABLE_DATE, START_NON_AVAILABLE_TIME, END_NON_AVAILABLE_TIME) VALUES(?,?,?,?,?,?) ";
			Connection connection = ConnectionSingleton.getInstance();
			PreparedStatement  stmt = (PreparedStatement) connection.prepareStatement(Sql);

			stmt.setString(1, latestId);
			stmt.setString(2, gpId);
			stmt.setString(3, startDay);
			stmt.setString(4, endDay);
			stmt.setString(5, startTime);
			stmt.setString(6, endTime);
			
			
			
			stmt.executeUpdate();
			stmt.close();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void setNurseAvailable(String gpId, String startDay, String endDay, String startTime, String endTime) {

		try {
			
			
			String Sql="INSERT INTO NURSE_AVAILABILITY (AVAILABILITY_ID, NURSE_ID,START_NON_AVAILABLE_DATE,END_NON_AVAILABLE_DATE, START_NON_AVAILABLE_TIME, END_NON_AVAILABLE_TIME) VALUES(?,?,?,?,?,?) ";
			Connection connection = ConnectionSingleton.getInstance();
			PreparedStatement  stmt = (PreparedStatement) connection.prepareStatement(Sql);

			stmt.setString(1, latestId);
			stmt.setString(2, gpId);
			stmt.setString(3, startDay);
			stmt.setString(4, endDay);
			stmt.setString(5, startTime);
			stmt.setString(6, endTime);
			
			
			stmt.executeUpdate();
			stmt.close();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void generateId() {
		
		
		try {
		
			
			
			String Sql ="Select AVAILABILITY_ID from GP_AVAILABILITY;";
			
			Connection connection = ConnectionSingleton.getInstance();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(Sql);
			
			while(rs.next()) {
				latestId = rs.getString("AVAILABILITY_ID");
			}
			
			rs.close();
			stmt.close();
			
			
			int lastDigit= Integer.parseInt(latestId.substring(1, latestId.length()));
			//System.out.println(lastDigit);
			int currentLastDigit=lastDigit + 1;
			//System.out.println(currentLastDigit);
			latestId = latestId.substring(0,1) + currentLastDigit; 
			//System.out.println(latestId);
			
		}
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
		
		public void clear() {
			
			employeeID = null;
			employeeName = null;
			dateOfBirth = null;
			email = null;
			phoneNum = null;
			gender = null;
			address = null;
			nricNum = null;
			role = 0;
			start_date = null;
			end_date = null;
			start_time = null;
			end_time = null;
			employeeAvailable = true;
			employeeExist = false;
		}
	
	
}

import java.sql.*;

public class FindPatient extends Patient{
	
public void findPatient(String name, String icNum) {
		
		try {
			
			String Sql = "select * from oversurgerysystem.patient where patientName='"+name+", nricNum='"+icNum+"'";
			
			DbConnector conStr = new DbConnector();
			Class.forName(conStr.getForName());
			Connection connection = DriverManager.getConnection("jdbc:mysql://"+conStr.getHostname()+":3306/oversurgerysystem",conStr.getUserName(),conStr.getPassword());
			
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(Sql);
			
			while(rs.next()) {
				super.setNricNum(rs.getString("nircNum")); 
				super.setPatientName(rs.getString("patientName"));
				super.setDob(rs.getString("DOB"));
				super.setSex(rs.getString("gender"));
				super.setPhoneNum(rs.getString("phoneNum"));
				super.setEmail(rs.getString("email"));
				super.setAddress(rs.getString("address"));
				super.setPatientWeight(rs.getInt("Weight"));
				super.setPatientHeight(rs.getInt("Height"));
				super.setAppointment(rs.getInt("appointment"));
				super.setDisease(rs.getString("patientDisease"));
				super.setCondition(rs.getInt("patientCondition"));
				super.setDiagnosis(rs.getString("DIAGNOSIS"));
			}
			
			rs.close();
			stmt.close();
			connection.close();
			
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}

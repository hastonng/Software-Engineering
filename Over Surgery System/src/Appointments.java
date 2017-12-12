import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;

import com.mysql.jdbc.PreparedStatement;

public class Appointments {
	
	
	private String latestId;
	//private String gpID;
	//private String nurseID;
	
	
	
	public void setAppointment(int pId, String gpId,String nurseId1,String nurseId2,String appDate,String appStartTime,String appEndTime,String pEmail, String gEmail, String n1Email, String n2Email) {
		
		try {
			
			
			System.out.println(pId +" "+gpId+" "+nurseId1+" "+nurseId2+" "+appDate+" "+appStartTime+" "+appEndTime);
			
			
			String Sql = "INSERT into appointment (PATIENT_ID,GP_ID,NURSE_ID_ONE,NURSE_ID_TWO,APPOINTMENT_DATE,APPOINTMENT_START_TIME,APPOINTMENT_END_TIME) VALUES (?,?,?,?,?,?,?);";
			
			Connection connection = ConnectionSingleton.getInstance();
			
			PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(Sql);
			
		
			if(nurseId1 != null && nurseId2 != null) {
				stmt.setInt(1, pId);
				stmt.setString(2, gpId);
				stmt.setString(3, nurseId1);
				stmt.setString(4, nurseId2);
				stmt.setString(5, appDate);
				stmt.setString(6, appStartTime);
				stmt.setString(7, appEndTime);
				stmt.executeUpdate();
				
				
			}
			else if( nurseId1 != null || nurseId2 != null) {
				
				stmt.setInt(1, pId);
				stmt.setString(2, gpId);
				stmt.setString(3, nurseId1);
				stmt.setString(4, "NULL");
				stmt.setString(5, appDate);
				stmt.setString(6, appStartTime);
				stmt.setString(7, appEndTime);
				stmt.executeUpdate();
			
			}
			
			
			
			
			System.out.println(Sql);
			
		}catch(Exception e) {
			
		}
		
	}
	
}

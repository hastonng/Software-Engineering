import java.sql.*;

public class MedicalPrescription {

	private int prescriptionID;
	private String patientDisease;
	private int patientCondition;
	private String drugPrescribed;
	private boolean mpExits;
	
	
	public int getPrescriptionID() {
		return prescriptionID;
	}
	
	public void setPrescriptionID(int presID) {
		prescriptionID=presID;
	}
	
	public String getPatientDisease() {
		return patientDisease;
	}
	
	public void setPatientDisease(String pDisease) {
		patientDisease=pDisease;
	}
	
	public int getPatientCondition() {
		return patientCondition;
	}
	
	public void setPatientCondition(int pCondition) {
		patientCondition=pCondition;
	}
	
	public String getDrugPrescribed() {
		return drugPrescribed;
	}
	
	public void setDrugPrescribed(String drugPres) {
		drugPrescribed=drugPres;
	}
	
	public boolean isMpExits() {
		return mpExits;
	}


	public void setMpExits(boolean mpExits) {
		this.mpExits = mpExits;
	}


	
	
	public void searchMpID(String patientName, String nricNum) {
		
		
		
		try {
			
			String  Sql = "select PRESCRIPTION_ID from oversurgerysystem.patient where PATIENT_NAME='"+patientName+"' AND NRIC_NUM='"+nricNum+"';";
			
			
			Connection connection = ConnectionSingleton.getInstance();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(Sql);
			
			while(rs.next()) {
				prescriptionID = rs.getInt("PRESCRIPTION_ID");
			}
			
			rs.close();
			stmt.close();
			
			System.out.println(prescriptionID);
			
		}catch(Exception e){
			
		}
	}



	public void insertMP(int pId, String employeeId, String disease, int condition, String dianogsis ) {
		
		try {
			
			System.out.println(prescriptionID+" "+pId+" "+employeeId+" "+disease+" "+condition+" "+dianogsis);
			
			String  Sql = "INSERT INTO medicalprescription (PRESCRIPTION_ID,PATIENT_ID,EMPLOYEE_ID,PATIENT_DISEASE,PATIENT_CONDITION,DRUG_PRESCRIBED) VALUES (?,?,?,?,?,?);";
			Connection connection = ConnectionSingleton.getInstance();
			PreparedStatement stmt = connection.prepareStatement(Sql);
			
			stmt.setInt(1, prescriptionID);
			stmt.setInt(2, pId);
			stmt.setString(3, employeeId);
			stmt.setString(4, disease);
			stmt.setInt(5, condition);
			stmt.setString(6, dianogsis);
			
			stmt.executeUpdate();
			
			
			
			
		}catch(Exception e) {
			
		}
		
	}
}

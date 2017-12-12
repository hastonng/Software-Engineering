import java.sql.*;
import java.util.Calendar;
import java.util.Date;


public class Patient {


	private static String patientName;
	private static int patientID;
	private static String strDob;
	private static String sex;
	private static String phoneNum;
	private static String email;
	private static String address;
	private static int patientWeight;
	private static int	patientHeight;
	private static int appointment;
	private static int prescripID;
	private static String disease;
	private static int condition;
	private static String drugsPrescribed;
	private static String nricNum;
	private static int bedNum;
	
	
	public static int getBedNum() {
		return bedNum;
	}


	public static void setBedNum(int bedNum) {
		Patient.bedNum = bedNum;
	}



	private static boolean getPatient;
	
	public static String getDrugsPrescribed() {
		return drugsPrescribed;
	}


	public static void setDrugsPrescribed(String drugsPrescribed) {
		Patient.drugsPrescribed = drugsPrescribed;
	}
	
	public static boolean isGetPatient() {
		return getPatient;
	}


	public static void setGetPatient(boolean getPatient) {
		Patient.getPatient = getPatient;
	}


	public String getStrDob() {
		return strDob;
	}


	public void setStrDob(String strDob) {
		this.strDob = strDob;
	}

		
	
	public String getNricNum() {
		return nricNum;
	}



	public void setNricNum(String nricNum) {
		this.nricNum = nricNum;
	}



	public String getPatientName() {
		return patientName;
	}



	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}



	public int getPatientID() {
		return patientID;
	}



	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	

	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	public String getPhoneNum() {
		return phoneNum;
	}



	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getPatientWeight() {
		return patientWeight;
	}



	public void setPatientWeight(int patientWeight) {
		this.patientWeight = patientWeight;
	}



	public int getPatientHeight() {
		return patientHeight;
	}



	public void setPatientHeight(int patientHeight) {
		this.patientHeight = patientHeight;
	}



	public int getAppointment() {
		return appointment;
	}



	public void setAppointment(int appointment) {
		this.appointment = appointment;
	}



	public int getPrescripID() {
		return prescripID;
	}



	public void setPrescripID(int prescripID) {
		this.prescripID = prescripID;
	}



	public String getDisease() {
		return disease;
	}



	public void setDisease(String disease) {
		this.disease = disease;
	}



	public int getCondition() {
		return condition;
	}



	public void setCondition(int condition) {
		this.condition = condition;
	}
	
	

	public void RegisterPatient() {
		try {
			
			
			
			//1. Get a connection to database
			Connection connection = ConnectionSingleton.getInstance();

			
            String Sql = "insert into patient (PATIENT_NAME, NRIC_NUM, DOB, GENDER, ADDRESS, PHONE_NO, EMAIL, WEIGHT, HEIGHT,PRESCRIPTION_ID,BED_NO) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
			//2. Adding values into patient table in sql//
			PreparedStatement myStmt = connection.prepareStatement(Sql); 
					
			myStmt.setString(1, patientName);
			myStmt.setString(2, nricNum);
			myStmt.setString(3,strDob);
			myStmt.setString (4, sex);
			myStmt.setString(5, address);
			myStmt.setString(6, phoneNum);
			myStmt.setString(7, email);
			myStmt.setInt(8, patientWeight);
			myStmt.setInt(9, patientHeight);
			myStmt.setInt(10, prescripID);
			myStmt.setInt(11, bedNum);
			
			//System.out.println(myStmt);
			
			myStmt.executeUpdate();
			
			
		}
		
		catch (Exception exc) {
			
		}
	}
	
	
	public void findPatient(String name, String ic) {
		
		
		try {
			
			String patientSql = "select * from oversurgerysystem.patient where PATIENT_NAME='"+name+"' AND NRIC_NUM='"+ic+"'";
			
			Connection connection = ConnectionSingleton.getInstance();
			Statement patientStmt = connection.createStatement();
			ResultSet patientRs = patientStmt.executeQuery(patientSql);
			
			System.out.println(patientSql);
			
			while(patientRs.next()) { 
				patientID=patientRs.getInt("PATIENT_ID");
				patientName=patientRs.getString("PATIENT_NAME");
				nricNum =patientRs.getString("NRIC_NUM");
				strDob = patientRs.getString("DOB");
				sex = patientRs.getString("GENDER");
				address = patientRs.getString("ADDRESS");
				phoneNum = patientRs.getString("PHONE_NO");
				email = patientRs.getString("EMAIL");
				patientWeight =patientRs.getInt("WEIGHT");
				patientHeight = patientRs.getInt("HEIGHT");
				prescripID = patientRs.getInt("PRESCRIPTION_ID");
				bedNum = patientRs.getInt("BED_NO");
				
			}
			
			patientRs.close();
			patientStmt.close();
			
			//System.out.println();
			
			String mpSql = "select PATIENT_DISEASE,PATIENT_CONDITION,DRUG_PRESCRIBED from oversurgerysystem.medicalprescription where PRESCRIPTION_ID='"+prescripID+"'";
			Statement mpStmt = connection.createStatement();
			ResultSet mpRs = mpStmt.executeQuery(mpSql);
			
			while(mpRs.next()) {
				condition = mpRs.getInt("PATIENT_CONDITION");
				disease =  mpRs.getString("PATIENT_DISEASE");
				drugsPrescribed = mpRs.getString("DRUG_PRESCRIBED");
			}
			
			
			System.out.println(mpSql);
			
			if(patientID == 0) {
				getPatient = false;
			}else
				getPatient = true;
			
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
		public void findPatientByBedNum() {
		
		
		try {
			
			String patientSql = "select * from oversurgerysystem.patient where BED_NO='"+bedNum+"';";
			
			Connection connection = ConnectionSingleton.getInstance();
			Statement patientStmt = connection.createStatement();
			ResultSet patientRs = patientStmt.executeQuery(patientSql);
			
			System.out.println(patientSql);
			
			while(patientRs.next()) { 
				patientID=patientRs.getInt("PATIENT_ID");
				patientName=patientRs.getString("PATIENT_NAME");
				nricNum =patientRs.getString("NRIC_NUM");
				strDob = patientRs.getString("DOB");
				sex = patientRs.getString("GENDER");
				address = patientRs.getString("ADDRESS");
				phoneNum = patientRs.getString("PHONE_NO");
				email = patientRs.getString("EMAIL");
				patientWeight =patientRs.getInt("WEIGHT");
				patientHeight = patientRs.getInt("HEIGHT");
				prescripID = patientRs.getInt("PRESCRIPTION_ID");
				bedNum = patientRs.getInt("BED_NO");
				
			}
			
			patientRs.close();
			patientStmt.close();
			
			//System.out.println();
			
			String mpSql = "select PATIENT_DISEASE,PATIENT_CONDITION,DRUG_PRESCRIBED from oversurgerysystem.medicalprescription where PRESCRIPTION_ID='"+prescripID+"'";
			Statement mpStmt = connection.createStatement();
			ResultSet mpRs = mpStmt.executeQuery(mpSql);
			
			while(mpRs.next()) {
				condition = mpRs.getInt("PATIENT_CONDITION");
				disease =  mpRs.getString("PATIENT_DISEASE");
				drugsPrescribed = mpRs.getString("DRUG_PRESCRIBED");
			}
			
			
			System.out.println(mpSql);
			
			if(patientID == 0) {
				getPatient = false;
			}else
				getPatient = true;
			
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void generatePrsId() {
	
		try {

			
			Connection connection = ConnectionSingleton.getInstance();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT MAX(PATIENT_ID) AS id FROM patient");
			
			prescripID = rs.getInt("PATIENT_ID");
			
			prescripID = prescripID + 1;
			
			System.out.println(prescripID);
			
		}catch(Exception e) {
			
		}
		
	}

	
	public void clear() {
		
	
		patientName = null;
		patientID = 0;
		strDob = null;
		sex = null;
		phoneNum = null;
		email = null;
		address = null;
		patientWeight = 0;
		patientHeight = 0;
		appointment = 0;
		prescripID = 0;
		disease = null;
		condition = 0;
		drugsPrescribed = null;
		
		
	}


}
	
import java.sql.*;


public class Patient {


	private String patientName;
	private String patientID;
	private String dob;
	private String sex;
	private String phoneNum;
	private String email;
	private String address;
	private int patientWeight;
	private int	patientHeight;
	private int appointment;
	private String prescripID;
	private String disease;
	private int condition;
	private String diagnosis;
	private String nricNum;
		
	
	Patient(){
		
		patientID = "";
		patientName = "";
		dob = "";
		phoneNum = "";
		sex = "";
		address = "";
		nricNum = "";
		patientWeight = 0;
		patientHeight = 0;
		appointment = 0;
		
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



	public String getPatientID() {
		return patientID;
	}



	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
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



	public String getPrescripID() {
		return prescripID;
	}



	public void setPrescripID(String prescripID) {
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



	public String getDiagnosis() {
		return diagnosis;
	}



	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	

}
	
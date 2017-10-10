public class Patient {

	private String patientID;
	private String patientName;
	private int dateOfBirth;
	private int phoneNum;
	private char gender;
	private String address;
	private int nricNum;
	private int patientWeight;
	private int patientHeight;
	private int appointment; 
	
		
	private String getPatientId() {
		return patientID;
	}
	
	private void setPatientId(String pid) {
		patientID=pid;
	}
	
	private String getPatientName() {
		return patientName;
	}
	
	private void setPatientName(String name) {
		patientName=name;
	}
	
	private int getDateOfBirth() {
		return dateOfBirth;
	}
	
	private void setDateOfBirth(int dob) {
		dateOfBirth=dob;
	}
	
	private int getPhoneNum() {
		return phoneNum;
	}
	
	private void setPhoneNum(int phNo) {
		phoneNum=phNo;
	}
	
	private char getGender() {
		return gender;
	}
	
	private void setGender(char sex) {
		gender=sex;
	}
	
	private String getAddress() {
		return address;
	}
	
	private void setAddress(String add) {
		address=add;
	}
	
	private int getNricNum() {
		return nricNum;
	}
	
	private void setNricNum(int ICNum) {
		nricNum=ICNum;
	}
	
	private int getPatientWeight() {
		return patientWeight;
	}
	
	private void setPatientWeight(int pWeight) {
		patientWeight=pWeight;
	}
	
	private int getPatientHeight() {
		return patientHeight;
	}
	
	private void setPatientHeight(int pHeight) {
		patientHeight=pHeight;
	}
	
	private int getAppointment() {
		return appointment;
	}
	
	private void setAppointment(int app) {
		appointment=app;
	}
	
	Patient(String pid, String name, int dob, int phNo, char sex, String add, int ICNum, int pWeight, int pHeight, int app){
			
			patientID = pid;
			patientName = name;
			dateOfBirth = dob;
			phoneNum = phNo;
			gender = sex;
			address = add;
			nricNum = ICNum;
			patientWeight = pWeight;
			patientHeight = pHeight;
			appointment = app;
			
	}
}
	
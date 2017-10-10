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
	
		
	
	Patient(){
		
		patientID = "";
		patientName = "";
		dateOfBirth = 0;
		phoneNum = 0;
		gender = 'N';
		address = "";
		nricNum = 0;
		patientWeight = 0;
		patientHeight = 0;
		appointment = 0;
		
}
	
	
	
	public String getPatientId() {
		return patientID;
	}
	
	public void setPatientId(String pid) {
		patientID=pid;
	}
	
	public String getPatientName() {
		return patientName;
	}
	
	public void setPatientName(String name) {
		patientName=name;
	}
	
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(int dob) {
		dateOfBirth=dob;
	}
	
	public int getPhoneNum() {
		return phoneNum;
	}
	
	public void setPhoneNum(int phNo) {
		phoneNum=phNo;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char sex) {
		gender=sex;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String add) {
		address=add;
	}
	
	public int getNricNum() {
		return nricNum;
	}
	
	public void setNricNum(int ICNum) {
		nricNum=ICNum;
	}
	
	public int getPatientWeight() {
		return patientWeight;
	}
	
	public void setPatientWeight(int pWeight) {
		patientWeight=pWeight;
	}
	
	public int getPatientHeight() {
		return patientHeight;
	}
	
	public void setPatientHeight(int pHeight) {
		patientHeight=pHeight;
	}
	
	public int getAppointment() {
		return appointment;
	}
	
	public void setAppointment(int app) {
		appointment=app;
	}

}
	
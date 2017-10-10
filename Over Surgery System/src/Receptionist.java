
public class Receptionist {

	private String employeeID;
	private String employeeName;
	private int dateOfBirth;
	private int phoneNum;
	private char gender;
	private String address;
	private int nricNum;
	
	
	Receptionist(){
		employeeID ="";
		employeeName = "";
		dateOfBirth = 0;
		phoneNum = 0;
		gender = 'n';
		address="";
		nricNum= 0;
	}
	
	public void setEmployeeId(String id) {
		employeeID=id;
	}
	
	public String getEmployeeId() {
		return employeeID;
	}
	
	public void setEmployeeName(String name) {
		employeeName=name;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setDateOfBirth(int dateOfB) {
		dateOfBirth=dateOfB;
	}
	
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setPhoneNum(int pNum) {
		phoneNum=pNum;
	}
	
	public int getPhoneNum() {
		return phoneNum;
	}
	
	public void setGender(char sex) {
		gender=sex;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setAddress(String add) {
		address=add;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setNRIC(int icNum) {
		nricNum=icNum;
	}
	
	public int getNRIC() {
		return nricNum;
	}

}

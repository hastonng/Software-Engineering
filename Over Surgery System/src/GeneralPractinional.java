
public class GeneralPractinional {
	private String gpID;
	private String gpName;
	private int dateOfBirth;
	private int phoneNum;
	private char gender;
	private String address;
	private int nricNum;
	
	public String getGpId() {
		return gpID;
	}
	
	public String getGpName() {
		return gpName;
	}
	
	public void setGpId(String name) {
			gpName=name;
	}
	
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	
	public int getPhoneNum() {
		return phoneNum;
	}
	
	public void setDateOfBirth(int phone) {
			phoneNum=phone;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gen) {
			gender=gen;
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
	
	public void setNricNum(int ic) {
			nricNum=ic;
	}
}

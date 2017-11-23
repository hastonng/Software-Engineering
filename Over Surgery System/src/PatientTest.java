import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class PatientTest {

	@Test
	public void Patient() {
		
	}
	
	@Test
	public void testGetPatientId() {
		Patient getPatientIdTest = new Patient();
		String pid="P0001";
		getPatientIdTest.setPatientId(pid);
		String testID=getPatientIdTest.getPatientId();
		
		assertSame(pid,testID);
	}
	
	
	@Test
	public void testSetPatientId() {
		Patient getPatientIdTest = new Patient();
		String pid="P0001";
		getPatientIdTest.setPatientId(pid);
		String testID=getPatientIdTest.getPatientId();
		
		assertSame(pid,testID);
	}

	@Test
	public void testGetPatientName() {
		Patient getPatientNameTest = new Patient();
		String name="Michelle Chang";
		getPatientNameTest.setPatientName(name);
		String testName = getPatientNameTest.getPatientName();
		
		assertSame(name,testName);
	}

	@Test
	public void testSetPatientName() {
		Patient getPatientNameTest = new Patient();
		String name="Michelle Chang";
		getPatientNameTest.setPatientName(name);
		String testName = getPatientNameTest.getPatientName();
		
		assertSame(name,testName);
	}

	@Test
	public void testGetDateOfBirth() {
		Patient getDateOfBirthTest = new Patient();
		String dob = "09Jul1997";
		getDateOfBirthTest.setDateOfBirth(dob);
		String testDOB = getDateOfBirthTest.getDateOfBirth();
		
		assertSame(dob, testDOB);
	}

	@Test
	public void testSetDateOfBirth() {
		Patient getDateOfBirthTest = new Patient();
		String dob = "09Jul1997";
		getDateOfBirthTest.setDateOfBirth(dob);
		String testDOB = getDateOfBirthTest.getDateOfBirth();
		
		assertSame(dob, testDOB);
	}

	@Test
	public void testGetPhoneNum() {
		Patient getPhoneNumTest = new Patient();
		String phNo = "0122873567";
		getPhoneNumTest.setPhoneNum(phNo);
		String testphNo = getPhoneNumTest.getPhoneNum();
		
		assertSame(phNo, testphNo);
	}

	@Test
	public void testSetPhoneNum() {
		Patient getPhoneNumTest = new Patient();
		String phNo = "0122873567";
		getPhoneNumTest.setPhoneNum(phNo);
		String testphNo = getPhoneNumTest.getPhoneNum();
		
		assertSame(phNo, testphNo);
	}

	@Test
	public void testGetGender() {
		Patient getGenderTest = new Patient();
		String sex="female";		
		getGenderTest.setGender(sex);
		String testGender = getGenderTest.getGender();
		
		assertSame(sex, testGender);
	}

	@Test
	public void testSetGender() {
		Patient getGenderTest = new Patient();
		String sex="female";		
		getGenderTest.setGender(sex);
		String testGender = getGenderTest.getGender();
		
		assertSame(sex, testGender);
	}

	@Test
	public void testGetAddress() {
		Patient getAddressTest = new Patient();
		String add = "47, Jln 18, DesaJaya, Kepong";
		getAddressTest.setAddress(add);
		String testAdd = getAddressTest.getAddress();
		
		assertSame(add, testAdd);
	}

	@Test
	public void testSetAddress() {
		Patient getAddressTest = new Patient();
		String add = "47, Jln 18, DesaJaya, Kepong";
		getAddressTest.setAddress(add);
		String testAdd = getAddressTest.getAddress();
		
		assertSame(add, testAdd);
	}

	@Test
	public void testGetNricNum() {
		Patient getNricNumTest = new Patient();
		String ICNum = "970709141234";
		getNricNumTest.setNricNum(ICNum);
		String testICNum = getNricNumTest.getNricNum();
		
		assertSame(ICNum, testICNum);
	}

	@Test
	public void testSetNricNum() {
		Patient getNricNumTest = new Patient();
		String ICNum = "970709141234";
		getNricNumTest.setNricNum(ICNum);
		String testICNum = getNricNumTest.getNricNum();
		
		assertSame(ICNum, testICNum);
	}

	@Test
	public void testGetPatientWeight() {
		Patient getPatientWeightTest = new Patient();
		int pWeight = '0';
		getPatientWeightTest.setPatientWeight(pWeight);
		int testpWeight = getPatientWeightTest.getPatientWeight();
		
		assertSame(pWeight, testpWeight);
	}

	@Test
	public void testSetPatientWeight() {
		Patient getPatientWeightTest = new Patient();
		int pWeight = '0';
		getPatientWeightTest.setPatientWeight(pWeight);
		int testpWeight = getPatientWeightTest.getPatientWeight();
		
		assertSame(pWeight, testpWeight);
	}

	@Test
	public void testGetPatientHeight() {
		Patient getPatientHeightTest = new Patient();
		int pHeight = '0';
		getPatientHeightTest.setPatientHeight(pHeight);
		int testpHeight = getPatientHeightTest.getPatientHeight();
		
		assertSame(pHeight, testpHeight);
	}

	@Test
	public void testSetPatientHeight() {
		Patient getPatientHeightTest = new Patient();
		int pHeight = '0';
		getPatientHeightTest.setPatientHeight(pHeight);
		int testpHeight = getPatientHeightTest.getPatientHeight();
		
		assertSame(pHeight, testpHeight);
	}

	@Test
	public void testGetAppointment() {
		Patient getAppointmentTest = new Patient();
		int app = '0';
		getAppointmentTest.setAppointment(app);
		int testApp = getAppointmentTest.getAppointment();
		
		assertSame(app, testApp);
	}

	@Test
	public void testSetAppointment() {
		Patient getAppointmentTest = new Patient();
		int app = '0';
		getAppointmentTest.setAppointment(app);
		int testApp = getAppointmentTest.getAppointment();
		
		assertSame(app, testApp);
		
	}
	
}

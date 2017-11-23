import static org.junit.Assert.*;

import org.junit.Test;

public class ReceptionistTest {

	@Test
	public void testReceptionist() {
		
	}

	
	@Test
	public void testSetEmployeeId() {
		Receptionist getEmployeeIdTest = new Receptionist();
		String id = "C1500344";
		getEmployeeIdTest.setEmployeeId(id);
		String testID = getEmployeeIdTest.getEmployeeId();
		
		assertSame(id, testID);
	}

	@Test
	public void testGetEmployeeId() {
		Receptionist getEmployeeIdTest = new Receptionist();
		String id = "C1500344";
		getEmployeeIdTest.setEmployeeId(id);
		String testID = getEmployeeIdTest.getEmployeeId();
		
		assertSame(id, testID);
	}

	@Test
	public void testSetEmployeeName() {
		Receptionist getEmployeeNameTest = new Receptionist();
		String name = "Michelle Chang";
		getEmployeeNameTest.setEmployeeName(name);
		String testName = getEmployeeNameTest.getEmployeeName();
		
		assertSame(name, testName);
	}

	@Test
	public void testGetEmployeeName() {
		Receptionist getEmployeeNameTest = new Receptionist();
		String name = "Michelle Chang";
		getEmployeeNameTest.setEmployeeName(name);
		String testName = getEmployeeNameTest.getEmployeeName();
		
		assertSame(name, testName);
	}

	@Test
	public void testSetDateOfBirth() {
		Receptionist getDateOfBirthTest = new Receptionist();
		String dob = "09Jul1997";
		getDateOfBirthTest.setDateOfBirth(dob);
		String testDOB = getDateOfBirthTest.getDateOfBirth();
		
		assertSame(dob, testDOB);
	}

	@Test
	public void testGetDateOfBirth() {
		Receptionist getDateOfBirthTest = new Receptionist();
		String dob = "09Jul1997";
		getDateOfBirthTest.setDateOfBirth(dob);
		String testDOB = getDateOfBirthTest.getDateOfBirth();
		
		assertSame(dob, testDOB);
	}

	@Test
	public void testSetPhoneNum() {
		Receptionist getPhoneNumTest = new Receptionist();
		String phNo = "0122873567";
		getPhoneNumTest.setPhoneNum(phNo);
		String testphNo = getPhoneNumTest.getPhoneNum();
		
		assertSame(phNo, testphNo);
	}

	@Test
	public void testGetPhoneNum() {
		Receptionist getPhoneNumTest = new Receptionist();
		String phNo = "0122873567";
		getPhoneNumTest.setPhoneNum(phNo);
		String testphNo = getPhoneNumTest.getPhoneNum();
		
		assertSame(phNo, testphNo);
	}

	@Test
	public void testSetGender() {
		Receptionist getGenderTest = new Receptionist();
		String sex="female";		
		getGenderTest.setGender(sex);
		String testGender = getGenderTest.getGender();
		
		assertSame(sex, testGender);
	}

	@Test
	public void testGetGender() {
		Receptionist getGenderTest = new Receptionist();
		String sex="female";		
		getGenderTest.setGender(sex);
		String testGender = getGenderTest.getGender();
		
		assertSame(sex, testGender);
	}

	@Test
	public void testSetAddress() {
		Receptionist getAddressTest = new Receptionist();
		String add = "47, Jln 18, DesaJaya, Kepong";
		getAddressTest.setAddress(add);
		String testAdd = getAddressTest.getAddress();
		
		assertSame(add, testAdd);
	}

	@Test
	public void testGetAddress() {
		Receptionist getAddressTest = new Receptionist();
		String add = "47, Jln 18, DesaJaya, Kepong";
		getAddressTest.setAddress(add);
		String testAdd = getAddressTest.getAddress();
		
		assertSame(add, testAdd);
	}

	@Test
	public void testSetNRIC() {
		Receptionist getNRICTest = new Receptionist();
		String icNum = "970709141234";
		getNRICTest.setNRIC(icNum);
		String testICNum = getNRICTest.getNRIC();
		
		assertSame(icNum, testICNum);
	}

	@Test
	public void testGetNRIC() {
		Receptionist getNRICTest = new Receptionist();
		String icNum = "970709141234";
		getNRICTest.setNRIC(icNum);
		String testICNum = getNRICTest.getNRIC();
		
		assertSame(icNum, testICNum);
	}

}

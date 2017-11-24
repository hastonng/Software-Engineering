import static org.junit.Assert.*;

import org.junit.Test;

public class GeneralPractinionalTest {

	@Test
	public void testGetGpId() {
		Employee getGpIdTest = new Employee();
		String gpId="C1500400";
		getGpIdTest.setGpId(gpId);
		String testID=getGpIdTest.getGpId();
		
		assertSame(gpId,testID);
	}
	
	@Test
	public void testSetGpId() {
		Employee setGpIdTest = new Employee();
		String gpId="C1500400";
		setGpIdTest.setGpId(gpId);
		String testID=setGpIdTest.getGpId();
		
		assertSame(gpId,testID);
	}

	@Test
	public void testGetGpName() {
		Employee setGpIdTest = new Employee();
		String name="Haston Ng";
		setGpIdTest.setGpName(name);
		String testName=setGpIdTest.getGpName();
		
		assertSame(name,testName);
	}
	
	@Test
	public void testSetGpName() {
		Employee setGpIdTest = new Employee();
		String name="Haston Ng";
		setGpIdTest.setGpName(name);
		String testName=setGpIdTest.getGpName();
		
		assertSame(name,testName);
	}

	@Test
	public void testGetDateOfBirth() {
		Employee getDateOfBirthTest = new Employee();
		String dob="2/June/1997";
		getDateOfBirthTest.setDateOfBirth(dob);
		String testDob=getDateOfBirthTest.getDateOfBirth();
		
		assertSame(dob,testDob);
	}
	
	@Test
	public void testSetDateOfBirth() {
		Employee getDateOfBirthTest = new Employee();
		String dob="2/June/1997";
		getDateOfBirthTest.setDateOfBirth(dob);
		String testDob=getDateOfBirthTest.getDateOfBirth();
		
		assertSame(dob,testDob);
	}

	@Test
	public void testGetPhoneNum() {
		Employee getPhoneNumTest = new Employee();
		String num= "0123456789";
		getPhoneNumTest.setPhoneNum(num);
		String testPhoneNum = getPhoneNumTest.getPhoneNum();
		
		assertSame(num,testPhoneNum);
	}
	
	@Test
	public void testSetPhoneNum() {
		Employee setPhoneNumTest = new Employee();
		String num= "0123456789";
		setPhoneNumTest.setPhoneNum(num);
		String testPhoneNum = setPhoneNumTest.getPhoneNum();
		
		assertSame(num,testPhoneNum);
	}


	@Test
	public void testGetGender() {
		Employee getGenderTest = new Employee();
		String sex= "MALE";
		getGenderTest.setGender(sex);
		String testGender = getGenderTest.getGender();
		
		assertSame(sex,testGender);
	}

	@Test
	public void testSetGender() {
		Employee setGenderTest = new Employee();
		String sex= "MALE";
		setGenderTest.setGender(sex);
		String testGender = setGenderTest.getGender();
		
		assertSame(sex,testGender);
	}

	@Test
	public void testGetAddress() {
		Employee getAddressTest = new Employee();
		String add= "11, Jalan Puki 1/2, Taman Mahre 12345 Kuala Lumpur";
		getAddressTest.setAddress(add);
		String testAddress = getAddressTest.getAddress();
		
		assertSame(add,testAddress);
	}

	@Test
	public void testSetAddress() {
		Employee setAddressTest = new Employee();
		String add= "11, Jalan Puki 1/2, Taman Mahre 12345 Kuala Lumpur";
		setAddressTest.setAddress(add);
		String testAddress = setAddressTest.getAddress();
		
		assertSame(add,testAddress);
	}

	@Test
	public void testGetNricNum() {
		Employee getNRICTest = new Employee();
		String ic= "919191551234";
		getNRICTest.setNricNum(ic);
		String testIC = getNRICTest.getNricNum();
		
		assertSame(ic,testIC);
	}

	@Test
	public void testSetNricNum() {
		Employee getNRICTest = new Employee();
		String ic= "919191551234";
		getNRICTest.setNricNum(ic);
		String testIC = getNRICTest.getNricNum();
		
		assertSame(ic,testIC);
	}

}

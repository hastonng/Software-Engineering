import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class PatientTest {



	
	@Test
	public void testGetPatientName() {
		Patient getPatientNameTest = new Patient();
		String name="Michelle Chang";
		getPatientNameTest.setPatientName(name);
		String testName = getPatientNameTest.getPatientName();
		
		assertSame(name,testName);
	}
	
	

	@Test
	public void testRegisterPatient() {
		Patient patient = new Patient();
		
		
		patient.setAddress("test");
		patient.setAppointment(1);
		patient.setCondition(1);
		//patient.setDiagnosis("test");
		patient.setStrDob("2017-11-30");
		//patient.setDob(DateOfBirth);
		patient.setEmail("test");
		patient.setNricNum("test");
		patient.setPatientHeight(165);
		patient.setPatientName("test");
		patient.setPatientWeight(21);
		patient.setPhoneNum("012345566676");
		patient.setSex("Male");
		
		
		patient.RegisterPatient();
		
		
	}
	
	
	@Test
	public void testFindPatient() {
		
		Patient patient = new Patient();
		patient.setPatientName("Samantha Wang");
		patient.setNricNum("170411145440");
		
		//patient.findPatient(name, icNum);
		
	}

	
	
	
}

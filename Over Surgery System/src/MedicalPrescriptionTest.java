import static org.junit.Assert.*;

import org.junit.Test;

public class MedicalPrescriptionTest {

	@Test
	public void testMedicalPrescription() {
	}

	@Test
	public void testGetPrescriptionID() {
		MedicalPrescription GetPrescriptionTest = new MedicalPrescription();
		String presID="C1500400";
	    GetPrescriptionTest.setPrescriptionID(presID);
	    String testID=GetPrescriptionTest.getPrescriptionID();

	    assertSame(presID,testID);
	}

	@Test
	public void testSetPrescriptionID() {
		MedicalPrescription GetPrescriptionTest = new MedicalPrescription();
		String presID="C1500400";
	    GetPrescriptionTest.setPrescriptionID(presID);
	    String testID=GetPrescriptionTest.getPrescriptionID();

	    assertSame(presID,testID);
	}

	@Test
	public void testGetPatientDisease() {
		MedicalPrescription GetPatientDiseaseTest = new MedicalPrescription();
		String pDisease="high chloresterol and risk of diabetic";
	    GetPatientDiseaseTest.setPatientDisease(pDisease);
	    String testID=GetPatientDiseaseTest.getPatientDisease();

	    assertSame(pDisease,testID);
	}

	@Test
	public void testSetPatientDisease() {
		MedicalPrescription GetPatientDiseaseTest = new MedicalPrescription();
		String pDisease="high chloresterol and risk of diabetic";
	    GetPatientDiseaseTest.setPatientDisease(pDisease);
	    String testID=GetPatientDiseaseTest.getPatientDisease();

	    assertSame(pDisease,testID);
	}

	@Test
	public void testGetPatientCondition() {
		MedicalPrescription GetPatientConditionTest = new MedicalPrescription();
		int pCondition=0;
	    GetPatientConditionTest.setPatientCondition(pCondition);
	    int testCondition = GetPatientConditionTest.getPatientCondition();

	    assertSame(pCondition,testCondition);
	}

	@Test
	public void testSetPatientCondition() {
		MedicalPrescription GetPatientConditionTest = new MedicalPrescription();
		int pCondition=0;
	    GetPatientConditionTest.setPatientCondition(pCondition);
	    int testCondition = GetPatientConditionTest.getPatientCondition();

	    assertSame(pCondition,testCondition);
	}

	@Test
	public void testGetDrugPrescribed() {
		MedicalPrescription GetDrugPrescribedTest = new MedicalPrescription();
		String drugPres="";
	    GetDrugPrescribedTest.setDrugPrescribed(drugPres);
	    String testDrugPres = GetDrugPrescribedTest.getDrugPrescribed();

	    assertSame(drugPres,testDrugPres);
	}

	@Test
	public void testSetDrugPrescribed() {
		MedicalPrescription GetDrugPrescribedTest = new MedicalPrescription();
		String drugPres="";
	    GetDrugPrescribedTest.setDrugPrescribed(drugPres);
	    String testDrugPres = GetDrugPrescribedTest.getDrugPrescribed();

	    assertSame(drugPres,testDrugPres);
	}

	@Test
	public void testGetPatientId() {
		MedicalPrescription GetPatientIdTest = new MedicalPrescription();
		String pid="C1600356";
	    GetPatientIdTest.setPatientId(pid);
	    String testID=GetPatientIdTest.getPatientId();

	    assertSame(pid,testID);
	}

	@Test
	public void testSetPatientId() {
		MedicalPrescription GetPatientIdTest = new MedicalPrescription();
		String pid="C1600356";
	    GetPatientIdTest.setPatientId(pid);
	    String testID=GetPatientIdTest.getPatientId();

	    assertSame(pid,testID);
	}

	@Test
	public void testGetGpId() {
		MedicalPrescription GetGpIdTest = new MedicalPrescription();
		String gpid="G1600356";
	    GetGpIdTest.setGpId(gpid);
	    String testID=GetGpIdTest.getGpId();

	    assertSame(gpid,testID);
	}

	@Test
	public void testSetGpId() {
		MedicalPrescription GetGpIdTest = new MedicalPrescription();
		String gpid="G1600356";
	    GetGpIdTest.setGpId(gpid);
	    String testID=GetGpIdTest.getGpId();

	    assertSame(gpid,testID);
	}

}

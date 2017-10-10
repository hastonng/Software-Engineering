public class MedicalPrescription {
	
	private String prescriptionID;
	private String patientID;
	private String gpID;
	private String patientDisease;
	private int patientCondition;
	private String drugPrescribed;
	
	private String getPrescriptionID() {
		return prescriptionID;
	}
	
	private void setPrescriptionID(String presID) {
		prescriptionID=presID;
	}
	
	private String getPatientID() {
		return patientID;
	}
	
	private void setPatientID(String pid) {
		patientID=pid;
	}
	
	private String getGpID() {
		return gpID;
	}
	
	private void setGpID(String gpid) {
		gpID=gpid;
	}
	
	private String getPatientDisease() {
		return patientDisease;
	}
	
	private void setPatientDisease(String pDisease) {
		patientDisease=pDisease;
	}
	
	private int getPatientCondition() {
		return patientCondition;
	}
	
	private void setPatientCondition(int pCondition) {
		patientCondition=pCondition;
	}
	
	private String getDrugPrescribed() {
		return drugPrescribed;
	}
	
	private void setDrugPrescribed(String drugPres) {
		drugPrescribed=drugPres;
	}
	
	
	MedicalPrescription(String presID, String pid, String gpid, String pDisease, String pCondition, String drugPres){
		
		prescriptionID=presID;
		patientID=pid;
		gpID=gpid;
		patientDisease=pDisease;
		patientCondition=pCondition;
		drugPrescribed=drugPres;
		
	}
	
	
}

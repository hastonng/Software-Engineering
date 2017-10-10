public class MedicalPrescription {
	
	private String prescriptionID;
	private String patientID;
	private String gpID;
	private String patientDisease;
	private int patientCondition;
	private String drugPrescribed;
	
	

	MedicalPrescription(String presID, String pid, String gpid, String pDisease, int pCondition, String drugPres){
		
		prescriptionID=presID;
		patientID=pid;
		gpID=gpid;
		patientDisease=pDisease;
		patientCondition=pCondition;
		drugPrescribed=drugPres;
		
	}
	
	
	public String getPrescriptionID() {
		return prescriptionID;
	}
	
	public void setPrescriptionID(String presID) {
		prescriptionID=presID;
	}
	
	public String getPatientDisease() {
		return patientDisease;
	}
	
	public void setPatientDisease(String pDisease) {
		patientDisease=pDisease;
	}
	
	public int getPatientCondition() {
		return patientCondition;
	}
	
	public void setPatientCondition(int pCondition) {
		patientCondition=pCondition;
	}
	
	public String getDrugPrescribed() {
		return drugPrescribed;
	}
	
	public void setDrugPrescribed(String drugPres) {
		drugPrescribed=drugPres;
	}
	
}

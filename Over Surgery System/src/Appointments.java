
public class Appointments {
	private String patientID;
	private String gpID;
	private String nurseID;
	private boolean gpAvailability;
	private boolean nurseAvailability;
	private String calenderDate;
	
	private String getPatientId() {
		return patientID;
	}
	
	private void setPatientId(String id) {
		patientID=pId;
	}
	
	private String getGpId() {
		return gpID;
	}
	
	private void setGpId(String id) {
		gpID=gpId;
	}
	
	private String getNurseId() {
		return nurseID;
	}
	
	private void setNurseId(String id) {
		nurseID=nId;
	}
	
	private boolean getGpAvailability() {
		return gpAvailability;
	}
	
	private void setGpAvailability(String availability) {
		gpAvailability=gpAvail;
	}
	
	private boolean getNurseAvailability() {
		return nurseAvailability;
	}
	
	private void setNurseAvailability(String availability) {
		nurseAvailability=nurseAvail;
	}
	
	private String getCalenderDate() {
		return calenderDate;
	}
	
	private void setCalenderDate(String date) {
		calenderDate=calenDate;
	}
	
		Appointment (String pid, String gpId, String nId, boolean gpAvail, boolean nurseAvail, String calenDate) {
			patientID=pid;
			gpID=gpId;
			nurseID=nId;
			gpAvailability=gpAvail;
			nurseAvailability=nurseAvail;
			calenderDate=calenDate;
		}
		
				public static void getAppointment() {
					System.out.printIn();
				}
}


public class Appointments {
	private String patientID;
	private String gpID;
	//private String nurseID;
	private boolean gpAvailability;
	private boolean nurseAvailability;
	private String calenderDate;
	
	Appointments (String pid, String gpId, String nId, boolean gpAvail, boolean nurseAvail, String calenDate) {
		patientID=pid;
		gpID=gpId;
		//nurseID=nId;
		gpAvailability=gpAvail;
		nurseAvailability=nurseAvail;
		calenderDate=calenDate;
		
	}
	
	
	
	public String getCalenderDate() {
		return calenderDate;
	}
	
	public void setCalenderDate(String date) {
		calenderDate=date;
	}
	
		
	public void setAppointment() {
			
		Patient pId = new Patient();
		patientID=pId.getPatientId();
		
		GeneralPractinional gp = new GeneralPractinional();
		gpID=gp.getGpId();
		
		
		//This part is for the Nurse Id//
		//We will add it in the future
		
		gpAvailability=true;
			
	}
	
}

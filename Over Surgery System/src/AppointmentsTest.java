import static org.junit.Assert.*;

import org.junit.Test;

public class AppointmentsTest {

	@Test
	public void testSetCalenderDate() {
		Appointments setCalanderDateTest = new Appointments();
		String date = "12/12/12";
		setCalanderDateTest.setCalenderDate(date);
		String dateTest = setCalanderDateTest.getCalenderDate();
		
		assertSame(date,dateTest);
	}

	@Test
	public void testSetAppointment() {
		Appointments setCalanderDateTest = new Appointments();
		String date = "12/12/12";
		setCalanderDateTest.setCalenderDate(date);
		String dateTest = setCalanderDateTest.getCalenderDate();
		
		assertSame(date,dateTest);
	}

}

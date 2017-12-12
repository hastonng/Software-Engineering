import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class CheckAvailabilityTest {

	
	@Test
	public void testCheckGpAvailability() throws ParseException {
		
		
		CheckGpAvailability gp = new CheckGpAvailability();
		
		gp.checkGpAvailability("2017-11-27", "G1500344");
		Calendar date=gp.getStart_date();
		Calendar actualDate= Calendar.getInstance();
		actualDate.setTime( new SimpleDateFormat("yyyy-MM-dd").parse("2017-11-27") );  
		
		//System.out.println(date);
		
		System.out.println(date.get(Calendar.DATE) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.YEAR));
		assert( actualDate.compareTo( date ) == 0 );
		
		
	}
	
}

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class LoginTest {

	@Test
	public void testLogin() throws SQLException {
		
		
		Login log = new Login();
		log.login("C1500400", "HASTON");
		
		int actualRole = 1;
		int role=log.getUserRole();
		
		assertSame(actualRole,role);
		
		
		
	}
}

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class ConnectionSingleton {

	private static String conStr = "jdbc:mysql://"+DbConnector.hostname+":3306/oversurgerysystem";
	private static Connection connection;
	
	
	
	 ConnectionSingleton(){
		
	}
	
	public static Connection getInstance() throws SQLException, ClassNotFoundException {
		
		 
		if(connection == null)
			{
				Class.forName(DbConnector.forName);
				connection = DriverManager.getConnection(conStr,DbConnector.userName,DbConnector.password);
			}
		
		return connection;
	}

	
}

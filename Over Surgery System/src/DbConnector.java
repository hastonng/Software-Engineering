import java.sql.*;
public class DbConnector {


	private String hostname = "202.188.70.61";
	private String portNumber = "3306";
	private String databaseName = "oversurgerysystem";
	private String userName = "root";
	private String password = "finalyear";
	private String conS;
	private String forName ="com.mysql.jdbc.Driver";
	private String jdbcStr = "jdbc:mysql://";
	
	
	public String getJdbcStr() {
		return jdbcStr;
	}

	public void setJdbcStr(String jdbcStr) {
		this.jdbcStr = jdbcStr;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConS() {
		return conS;
	}

	public void setConS(String conS) {
		this.conS = conS;
	}
	
	
	public String getForName() {
		return forName;
	}

	public void setForName(String forName) {
		this.forName = forName;
	}

	public void setConnection() {
		
		conS = "\""+jdbcStr+hostname+":"+portNumber+"/"+databaseName+"\","+userName+","+password;
			
	}
	
	public String getConnection() {
		return conS;
	}

	
}

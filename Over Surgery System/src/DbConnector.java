public class DbConnector {


	private String hostname = "oversurgerysystem.mynetgear.com";
	private String userName = "haston";
	private String password = "finalyear2017";
	private String conS;
	private String forName ="com.mysql.jdbc.Driver";

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
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

	
}

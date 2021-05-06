package ro.ase.csie.cts.g1093.dp.proxy;

public class LoginModule implements LoginInterface {
	
	String serverIP;
	String dbConnection;
	
	
	
	LoginModule(String serverIP, String dbConnection) {
		super();
		this.serverIP = serverIP;
		this.dbConnection = dbConnection;
	}

	@Override
	public boolean login(String userName, String pass) {
		System.out.println("Connecting to database: " + dbConnection);
		if(userName.toLowerCase().equals("admin") && pass.equals("1234admin"))
			return true;
		else
			return false;
	}
	
	@Override
	public boolean checkServerStatus() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}

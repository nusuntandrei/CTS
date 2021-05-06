package ro.ase.csie.cts.g1093.dp.proxy;

public class LoginWith2FactorAuth implements LoginInterface {
	
	LoginInterface loginModule = null;
	
	

	LoginWith2FactorAuth(LoginInterface loginModule) {
		super();
		this.loginModule = loginModule;
	}
	
	public boolean checkGeneratedCode(int code) {
		if(code == 1245) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean login(String userName, String pass) {
		if(this.loginModule.login(userName, pass)) {
			System.out.println("Please input the generated code that you have received over SMS/Email!");
			System.out.println("Check received code..");
			if(checkGeneratedCode(1245)) {
				System.out.println("Hello " + userName);
				return true;
			}
			else {
				System.out.println("The code is not correct!");
			}
		}
		return false;
	}

	@Override
	public boolean checkServerStatus() {
		return this.loginModule.checkServerStatus();
	}

}

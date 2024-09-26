package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoan {

	
	@Parameters({"URL"})
	@Test(groups= {"Web"})
	public void WebLoginCL(String url) {

		System.out.println("WebLogin car Loan");
		System.err.println(url);
	}

	@Test(groups= {"Mobile"})

	public void MobileLoginCL() {
		System.out.println("Mobile Login Car Loan");

	}

	@Test(groups= {"API"})

	public void LoginAPICL() {
		System.out.println("LoginAPI car Loan");
	}
		
		
	@Test(groups= {"Mobile"})
	public void MobileLogOutCL() {
		System.out.println("Mobile Log out Car Loan");
	}

		


	}

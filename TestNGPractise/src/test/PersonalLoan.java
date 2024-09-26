package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoan {
	
	@Parameters({"browser"})
	@Test(groups= {"Web"})
	public void WebLoginPL(String browservalue) {

		System.out.println("WebLogin Personal Loan");
		System.out.println(browservalue);
	}

	@Test(groups= {"Mobile"})

	public void MobileLoginPL() {
		System.out.println("Mobile Login Personal Loan");

	}

	@Test(groups={"API"})

	public void LoginAPIPL() {
		System.out.println("LoginAPI Personal Loan");

	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before Test from personal loan");
	}
}

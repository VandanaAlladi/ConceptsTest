package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

public class HomeLoan {

	@Test(groups = { "Web" })
	public void WebLoginHL() {

		System.out.println("Web Login Home Loan");
	}

	@AfterClass

	public void AfterClassOne() {
		System.out.println("AfterClassOne from  Home Loan");

	}

	@Test(groups = { "Mobile" })
	public void MobileSigninHL() {
		System.out.println("Mobile Signin Home Loan");

	}

	@Test(groups = { "API" }, dependsOnMethods = { "MobileSigninHL" })
	public void LoginAPIHL() {
		System.out.println("Login API Home Loan");

	}
	
	@Test(enabled=false)
	public void Desktop(){
	
		System.out.println("desktop");

	}


	@AfterClass
	public void AfterClassTwo() {
		System.out.println("After ClassTwo from  Home Loan");

	}

	@Test(groups = { "Mobile" }, dependsOnMethods = { "MobileSigninHL" })

	public void MobileLogOutHL() {
		System.out.println("Mobile Logout Home Loan");

	}

	@AfterTest

	public void AfterTestHomeLoan() {
		System.out.println("After Test from Home Loan");

	}
}

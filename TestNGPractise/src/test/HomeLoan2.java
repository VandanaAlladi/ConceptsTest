package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class HomeLoan2 {
	
	@Test
	@Parameters({"URL"})
	public void SecondHome(String URL) {
		
		System.out.println("From second Home loan");
		System.out.println(URL);
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before Test from second home loan");
	}	
	
	
	@Test(groups = { "Mobile", "Web" })
	public void MobileWebHomeLogin() {

		System.out.println("mobile and web from second Home loan");
	}
}

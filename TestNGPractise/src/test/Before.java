package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeGroups;

import org.testng.annotations.AfterGroups;

public class Before {

	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before Test");
	}	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("After Test");
	}	
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before class");
	}	
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After class");
	}	
	
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before Method");
	}	

	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method");
	}	

	
	
	@Test
	public void FirstTest()
	{
		System.out.println("First Test");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("Second Test");
	}
	
	@BeforeSuite
	public void BeforeSuit()
	{
		System.out.println("Before Suite");
	}	

	
	@AfterSuite
	public void AfterSuit()
	{
		System.out.println("After suite");
	}	
	
	
	@BeforeGroups("Web")
	public void BeforeGroupWeb()
	{
		System.out.println("Before Group web");
	}	

	
	@AfterGroups("Web")
	public void AfterGroupWeb()
	{
		System.out.println("After Group web");
	}	
	
	@BeforeGroups("Mobile")
	public void BeforeGroupMobile()
	{
		System.out.println("Before Group mbl");
	}	

	
	@AfterGroups("Mobile")
	public void AfterGroupMobile()
	{
		System.out.println("After Group mbl");
	}


	
}

package com.qa.TestingNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	/* 
	 * 		setup system property for chrome
			launchBrowser
			login to app
			enter URL
			Gootle Title Test
			logout from app
			Close Browser
			Delete all cookies
	 */
	
	@BeforeSuite	//1
	public void setUp() {
		System.out.println("setup system property for chrome");
	}
	
	@BeforeTest		//2
	public void launchBrowser() {
		System.out.println("launchBrowser");
	}
	
	@BeforeClass	//3
	public void login()
	{
		System.out.println("login to app");
	}
	
	@BeforeMethod	//4
	public void enterURL() {
		System.out.println("enter URL");
	}
	
	@Test			//5
	public void googleTitleTest() {
		System.out.println("Gootle Title Test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("searchTest");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("googleLogoTest");
	}
	
	@AfterMethod	//6
	public void logOut() {
		System.out.println("logout from app");
	}

	
	@AfterClass		//7
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterTest		//8
	public void deleteAllCookies() {
		System.out.println("Delete all cookies");
	}
	
	@AfterSuite		//9
	public void generateTestReport() {
		System.out.println("generateTestReport");
	}
	

}

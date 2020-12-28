package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Contacts;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactsPageTest extends TestBase{
	LoginPage loginPage;
	Contacts contactsPage;
	HomePage homePage;
	
	public ContactsPageTest() {
		super();
	}
		
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		contactsPage = new Contacts();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));	
		contactsPage = homePage.clickOnContactsLink();
		
	}
	@Test(priority=1)
	public void verifyContactsPageLabelTest() {
		Assert.assertTrue(contactsPage.verifyContactsText(), "contacts label is missing on the page");
		
	}
	@Test(priority=2)
	public void validateCreateNewContact() {
		homePage.clickOnContactsLink();
		contactsPage.clickOnNewContactsLink();
		contactsPage.createNewContact("Tom", "Peter", "Google");	
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Contacts extends TestBase{
	
	@FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
	WebElement contactsLabel;
	
	@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement newContactsBtn;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastName;
	
	@FindBy(xpath="//div[@name='company']//input[@class='search']")
	WebElement company;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement saveBtn;
	
	public Contacts() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNewContactsLink() {
		newContactsBtn.click();
	}
	
	public boolean verifyContactsText() {
		return contactsLabel.isDisplayed();
	}
	
	public void createNewContact(String ftName, String ltName, String comp) {
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		company.sendKeys(comp);
		saveBtn.click();
	}
	
	
}

package com.crm.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	//Test comments by Sush1
	
	public static WebDriver driver;
	public static Properties prop;
	
	
		
	public TestBase(){
		
		try {
			prop = new Properties();
			File f1 = new File("/Users/srakapali/eclipse-workspace/FreeCRMTest/"
					+ "src/main/java/com/crm/qa/config/config.properties");
			FileInputStream ip = new FileInputStream(f1);
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	public static void initialization() {
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/srakapali/Downloads/chromedriver");	
			driver = new ChromeDriver(); 
		}
		else if(browsername.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "/Users/srakapali/Downloads/geckodriver");	
			driver = new FirefoxDriver(); 
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
}
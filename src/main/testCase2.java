import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class testCase2 {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver","/Users/srakapali/eclipse-workspace/Introduction/chromedriver");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://alam1.aclibrary.org/iii/cas/login?service=https%3A%2F%2Falam1.aclibrary.org%3A443%2Fpatroninfo~S30%2FIIITICKET&scope=30");
			driver.findElement(By.cssSelector("input[name*='code']")).sendKeys("21157023121885");
			driver.findElement(By.xpath("//input[contains(@name,'pin')]")).sendKeys("6174");
			driver.findElement(By.cssSelector("input#rememberme")).click();
			//driver.findElement(By.xpath("//span[@class='buttonSpriteSpan2']")).click();
			driver.findElement(By.xpath("//div[@class='formButtons']/a/div/div/span/span")).click();
			
			Select s = new Select(driver.findElement(By.cssSelector("select#specializedSearch")));
			
			s.selectByIndex(8);
			System.out.println("Drop down last value is  "+s);
			
			//s.selectByValue("/search/q");
			WebElement e = s.getFirstSelectedOption();
			System.out.println("Select by value is  "+e.getText() );
			
			
			
			
			
			//tagname[attribute*='value']
			/*driver.get("https://login.salesforce.com");
			System.out.print(driver.getTitle());
			
			driver.findElement(By.id("username")).sendKeys("dfgfdgfd");
			driver.findElement(By.id("password")).sendKeys("fgdfgdgd");
			
			//driver.findElement(By.linkText("Forgot account?")).click();
			driver.findElement(By.xpath("//*[@id='Login']")).click();
			System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
			*/
			
			
			//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a
			//*[@id='email']
			//*[@id='Login']
			
			
		
			/*
			 	System.setProperty("webdriver.gecko.driver", "/Users/srakapali/eclipse-workspace/Introduction/geckodriver");
			 
				WebDriver driver = new FirefoxDriver();
				driver.get("http://www.google.com");
				System.out.println(driver.getTitle());
				
				System.out.println(driver.getCurrentUrl());
				
				//System.out.println(driver.getPageSource());
				
				driver.get("http://yahoo.com");
				driver.navigate().back();
				driver.navigate().forward();
			*/
			driver.close();
			
			
			
			
			
			
			
			
			
			
			
	}

}

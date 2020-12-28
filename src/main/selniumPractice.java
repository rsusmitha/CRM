import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selniumPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/srakapali/eclipse-workspace/Introduction/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goindigo.in");
		
		//driver.findElement(By.name("or-src")).click();
		//form-control or-src-city parsley-success
		//autocomplete-result station-result clearfix airport-item pop-dest-stn
		driver.findElement(By.cssSelector("input.form-control.or-src-city")).click();
		
		driver.findElement(By.xpath("//div[@data-name='Bengaluru']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-sm-5 col-5 padd-right']//div[@class='autocomplete-results autocomplete-main station-results'] //div[@data-name='Delhi']")).click();
		Thread.sleep(2000);


		/*
		 * //div[@class='autocomplete-results autocomplete-main station-results']
		 * class="autocomplete-results autocomplete-main station-results"
		 * class="autocomplete-results autocomplete-main station-results"
		 * driver.findElement(By.cssSelector("input[name='passenger']")).click();
		
		
		System.out.println(driver.findElement(By.name("passenger")).getText());
		for(int i=1;i<3;i++)
			{ 
				driver.findElement(By.cssSelector("span.icon-plus")).click();
			}
		
		driver.findElement(By.cssSelector("button.btn.btn-primary.pax-done.btn-pad-y")).click();
		*/
		
		
		//System.out.println(driver.findElement(By.name("passenger")).getText());
		
		
		driver.close();
	}

}

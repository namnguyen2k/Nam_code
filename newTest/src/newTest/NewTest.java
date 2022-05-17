package newTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	public String baseUrl = "https://anhtester.com";
	public WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException {
		String driverPath = "C:\\Users\\Phong Vu bn\\Downloads\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", driverPath);
	}
	    
  @Test
  public void f() throws InterruptedException {
	  
	  driver = new ChromeDriver();
	    
      driver.manage().window().maximize();
        
      driver.navigate().to(baseUrl);
      Thread.sleep(2000);

      String expectedTitle = "Anh Tester - Automation Testing";
      String actualTitle = driver.getTitle();

      Assert.assertEquals(actualTitle, expectedTitle);
     
      Thread.sleep(2000);
      driver.quit();
}
  @Test	
  public void c() throws InterruptedException {
  		driver = new ChromeDriver();
	    
        driver.manage().window().maximize();
          
        driver.navigate().to(baseUrl);
        Thread.sleep(2000);

        String expectedTitle = "Anh Tester - Automation Testing";
        String actualTitle = driver.getTitle();

        
        Assert.assertEquals("Nam", "Nam");
        Thread.sleep(2000);
        driver.quit();
  	}
  
}

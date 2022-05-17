package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class NewTest  {
	@BeforeTest
	public void setup() {
		String driverPath = "C:\\Users\\Phong Vu bn\\Downloads\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", driverPath);
	}
	public String baseUrl = "https://anhtester.com";    
    public WebDriver driver; 
    
  @Test
  public void f() throws InterruptedException {
	  
	  driver = new ChromeDriver();
	    
      driver.manage().window().maximize();
        
      driver.navigate().to(baseUrl);
      Thread.sleep(2000);

      String expectedTitle = "Anh Tester - Automation Testing";     
      String actualTitle = driver.getTitle();
      //String actual_course=driver.findElement(By.id("categories")).getText();  
      Assert.assertEquals(actualTitle, expectedTitle);
      Assert.assertEquals("Nam", "Nam");
      //Assert.assertEquals("adfasdf", "Courses");
      Thread.sleep(2000);
      driver.quit();
  }
}

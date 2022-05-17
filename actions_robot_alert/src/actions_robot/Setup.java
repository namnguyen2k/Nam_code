package actions_robot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Setup {
	public WebDriver driver=null;
	@BeforeTest
	public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Phong Vu bn\\Downloads\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	  }
	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}

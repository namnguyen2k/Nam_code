package testChau;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	  WebDriver driver;
	  WebElement element;
	  //String projectPath = System.getProperty("user.dir");

	  @BeforeClass
	  public void beforeClass() {

	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Phong Vu bn\\Downloads\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();

	  }

	  @Test
	  public void Tc_01_Url() {
	    driver.get("http://live.techpanda.org/");
	    driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();
	    String loginPageUrl = driver.getCurrentUrl();
	    Assert.assertEquals(loginPageUrl, "http://live.techpanda.org/index.php/customer/account/login/");

	    driver.findElement(By.xpath("//a[@title='Create an Account']")).click();
	    String registerPageUrl = driver.getCurrentUrl();
	    Assert.assertEquals(registerPageUrl, "http://live.techpanda.org/index.php/customer/account/create/");

	  }

	  @Test
	  public void Tc_02_Title() {

	    driver.get("http://live.techpanda.org/");

	    driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();

	    String loginPageTitle = driver.getTitle();
	    Assert.assertEquals(loginPageTitle, "Customer Login");
	    driver.findElement(By.xpath("//a[@title='Create an Account']")).click();

	    String registerPageTitle = driver.getTitle();
	    Assert.assertEquals(registerPageTitle, "Create New Customer Account");

	  }

	  @Test
	  public void Tc_03_Navigation() {

	    driver.get("http://live.techpanda.org/");

	    driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();

	    driver.findElement(By.xpath("//a[@title='Create an Account']")).click();

	    driver.navigate().back();

	    String loginPageUrl = driver.getCurrentUrl();

	    Assert.assertEquals(loginPageUrl, "http://live.techpanda.org/index.php/customer/account/login/");

	    driver.navigate().forward();
	    
	    sleepInsecond(3);

	    String registerPageUrl = driver.getCurrentUrl();
	    Assert.assertEquals(registerPageUrl, "http://live.techpanda.org/index.php/customer/account/create/");
	    
	    String registerPageTitle = driver.getTitle();
	    Assert.assertEquals(registerPageTitle, "Create New Customer Account");

	  }

	  @Test
	  public void Tc_04_Page_Source() {

	    driver.get("http://live.techpanda.org/");

	    driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();

	    String homePageSource = driver.getPageSource();

	    Assert.assertTrue(homePageSource.contains("Login or Create an Account"));

	    driver.findElement(By.xpath("//a[@title='Create an Account']")).click();

	    String registerPageSource = driver.getPageSource();

	    Assert.assertTrue(registerPageSource.contains("Create an Account"));

	  }

	  @AfterClass
	  public void afterClass() {
		  	driver.quit();
	  }

	  public void sleepInsecond(long second) {
	    try {
	      Thread.sleep(second * 1000);
	    } catch (Exception e) {
	      e.printStackTrace();
	    }

	  }
}

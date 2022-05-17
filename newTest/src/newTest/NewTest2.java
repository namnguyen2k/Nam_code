package newTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest2 {
	private static final String Actions = null;
	public WebDriver driver=null;
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Phong Vu bn\\Downloads\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }
  @Test
  public void demo1() {
	  driver.navigate().to("https://anhtester.com/");
	  WebElement input=driver.findElement(By.xpath("//input[@placeholder='Bạn muốn học gì?']"));
	  input.sendKeys("Automation Test");
	  input.sendKeys(Keys.ENTER);
	  String count=driver.findElement(By.xpath("//span[normalize-space()='4']")).getText();
	  Assert.assertEquals(count, "4");
  }
  @Test
  public void demo2() {
	  driver.navigate().to("https://google.com/");
	  WebElement input=driver.findElement(By.xpath("//input[@title='Tìm kiếm']"));
	  input.sendKeys("Phạm Ngọc Thạch");
	  input.sendKeys(Keys.ENTER);
	  String text=driver.findElement(By.xpath("//h3[contains(text(),'Phạm Ngọc Thạch – Wikipedia tiếng Việt')]")).getText();
	  Assert.assertEquals(text,"Nguyen");
	  
  }
  @Test
  public void demo3() {
	  driver.navigate().to("https://youtube.com/");
  }
  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(2000);
	  driver.quit();
  }

}

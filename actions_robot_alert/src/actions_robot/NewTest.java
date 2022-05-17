package actions_robot;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest extends Setup{
	 @Test
	  public void actions() {
		  driver.get("https://demo.guru99.com/test/drag_drop.html");
		  WebElement from=driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		  WebElement to=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		  Actions action=new Actions(driver);
		  action.dragAndDrop(from, to).build().perform();
	  }
	 @Test
	  public void robot() throws AWTException, InterruptedException {
		  driver.get("https://anhtester.com/");
		  WebElement from=driver.findElement(By.xpath("//input[@placeholder='Bạn muốn học gì?']"));
		  Robot robot=new Robot();
		  from.click();
		  robot.keyPress(KeyEvent.VK_T);
		  robot.keyPress(KeyEvent.VK_9);
		  robot.keyPress(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
	  }
	/*@Test
  public void tc2() {
	  driver.get("https://anhtester.com/");
	  WebElement e=driver.findElement(By.xpath("//a[normalize-space()='Testing Website']"));
	  Actions action=new Actions(driver);
	  action.moveToElement(e).build().perform();
	  action.contextClick(e).build().perform();
		// Scroll down
		action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		// Scroll up
		action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
  }*/
  /*	@Test
  public void tc1() {
	  	driver.get("https://google.com/");
	  	WebElement element=driver.findElement(By.xpath("//input[@title='Tìm kiếm']"));
	  	Actions action=new Actions(driver);
	  	action.sendKeys(element,"Anh tester").sendKeys(Keys.ENTER).build().perform();
	  	//action.sendKeys(Keys.ENTER).build();
	  	WebElement button=driver.findElement(By.xpath("//a[@href='https://anhtester.com/']"));
	  	action.click(button).build().perform();
	  	SoftAssert softassert=new SoftAssert();
	  	softassert.assertEquals(driver.getTitle(), "Anh Tester - Automation Testing");
	  	System.out.println("Done");
  }
  @Test
  public void tc2() {
	  	driver.get("https://www.youtube.com/watch?v=orJSJGHjBLI");
	  	WebElement element1=driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-primary-info-renderer'][normalize-space()='Ed Sheeran - Bad Habits [Official Video]']"));
	  	Actions action=new Actions(driver);
	  	WebElement element2=driver.findElement(By.xpath("//div[@id='upload-info']//a[@class='yt-simple-endpoint style-scope yt-formatted-string'][normalize-space()='Ed Sheeran']"));
	  	SoftAssert softassert=new SoftAssert();
	  	softassert.assertEquals(element1.getText(), "Ed Sheeran - Bad Habits [Official Video]");
	  	softassert.assertEquals(element2.getText(), "Ed Sheeran");
	  	

  }*/
}

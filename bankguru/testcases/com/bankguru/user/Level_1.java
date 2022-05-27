package com.bankguru.user;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Level_1 {
	WebDriver driver;
	String driverpath= System.getProperty("user.dir");
	String username, password,loginPageURL;
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", driverpath + "/browserDriver/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://demo.guru99.com/v4/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }
  @Test (priority = 0)
  public void register() {
	  loginPageURL=driver.getCurrentUrl();
	  //Click here link 
	  driver.findElement(By.xpath("//a[normalize-space()='here']")).click();
	  // Input email
	  driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("email@email.com");
	  //Click submit
	  driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	  //Get text username password
	  username= driver.findElement(By.xpath("//td[normalize-space()='User ID :']/following-sibling::td")).getText();
	  password= driver.findElement(By.xpath("//td[normalize-space()='Password :']/following-sibling::td")).getText();
	  System.out.println(username);
  }
  @Test(priority = 1)
  public void loginPage() {
	  driver.get("https://demo.guru99.com/v4/");
	  //Login 
	  driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	  driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	   
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

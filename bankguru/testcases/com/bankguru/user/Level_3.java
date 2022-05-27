package com.bankguru.user;

import org.testng.annotations.Test;

import commons.AbstractsPage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Level_3 extends AbstractsPage{
	WebDriver driver;
	String driverpath= System.getProperty("user.dir");
	String username, password,loginPageURL;
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", driverpath + "/browserDriver/chromedriver.exe");
	  driver= new ChromeDriver();
	  openURL(driver, "https://demo.guru99.com/v4/");
	  driver.manage().window().maximize();
	  
  }
  @Test (priority = 0)
  public void register() {
	  loginPageURL=getCurrentPageURL(driver);
	  clickToElement(driver, "//a[normalize-space()='here']");
	  //driver.findElement(By.xpath("//a[normalize-space()='here']")).click();
	  sendKeysToElement(driver, "//input[@name='emailid']", "email@email.com");
	  //driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("email@email.com");
	  clickToElement(driver, "//input[@name='btnLogin']");
	  //driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	  username= getElementText(driver, "//td[normalize-space()='User ID :']/following-sibling::td");
	  password= getElementText(driver, "//td[normalize-space()='Password :']/following-sibling::td");
	  //username= driver.findElement(By.xpath("//td[normalize-space()='User ID :']/following-sibling::td")).getText();
	  //password= driver.findElement(By.xpath("//td[normalize-space()='Password :']/following-sibling::td")).getText();
  }
  @Test(priority = 1)
  public void loginPage() {
	  openURL(driver, "https://demo.guru99.com/v4/");
	  //driver.get("https://demo.guru99.com/v4/"); 
	  sendKeysToElement(driver, "//input[@name='uid']", username);
	  //driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
	  sendKeysToElement(driver, "//input[@name='password']", password);
	  //driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	  clickToElement(driver, "//input[@name='btnLogin']");
	  //driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	   
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

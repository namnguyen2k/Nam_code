package com.bankguru.user;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commons.AbstractsPage;
import pageObjects.LoginPageObject;
import pageObjects.MainPageObject;
import pageObjects.NewCustomerPageObject;
import pageObjects.RegisterPageObject;

public class Level_4 extends AbstractsPage{
	WebDriver driver;
	String driverpath= System.getProperty("user.dir");
	String username, password,loginPageURL;
	LoginPageObject loginPage;
	RegisterPageObject registerPage;
	MainPageObject mainPage;
	NewCustomerPageObject newCustomerPage;
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", driverpath + "/browserDriver/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://demo.guru99.com/v4/");
	   
	  driver.manage().window().maximize();  
	  loginPage = new LoginPageObject(driver);
	  
  }
  @Test (priority = 0)
  public void TC_01_registerPage() {
	  loginPageURL= loginPage.getLoginPageURL();
	  //loginPageURL=getCurrentPageURL(driver);
	  loginPage.clickToHereLink();
	  //clickToElement(driver, "//a[normalize-space()='here']");
	  registerPage = new RegisterPageObject(driver);
	  registerPage.inputToEmailTextbox("email@email.com");
	  //sendKeysToElement(driver, "//input[@name='emailid']", "email@email.com");
	  registerPage.clickToSubmitButton();
	  //clickToElement(driver, "//input[@name='btnLogin']");
	  username = registerPage.getUsername();
	  password = registerPage.getPassword();
	  //username= getElementText(driver, "//td[normalize-space()='User ID :']/following-sibling::td");
	  //password= getElementText(driver, "//td[normalize-space()='Password :']/following-sibling::td");
  }
  @Test(priority = 1)
  public void TC_02_loginPage() {
	  registerPage.openLoginPageURL(loginPageURL);
	  //openURL(driver, "https://demo.guru99.com/v4/");
	  loginPage = new LoginPageObject(driver);
	  loginPage.inputToUsernameTextbox(username);
	  //sendKeysToElement(driver, "//input[@name='uid']", username);
	  loginPage.inputToPasswordTextbox(password);
	  //sendKeysToElement(driver, "//input[@name='password']", password);
	  loginPage.clickLoginButton();
	  //clickToElement(driver, "//input[@name='btnLogin']");
	  mainPage = new MainPageObject(driver);
	  Assert.assertEquals(mainPage.getWelcomeMessageText(), "Welcome To Manager's Page of Guru99 Bank");   
  }
  @Test(priority = 2)
  public void TC_03_newCustomerPage() {
	  mainPage.openNewCustomerPage();
	  newCustomerPage = new NewCustomerPageObject(driver);
	  newCustomerPage.inputToNameTextbox("John Kennedy");
	  newCustomerPage.inputToDOBTextbox("01/02/1960");
	  newCustomerPage.inputToAddressTextarea("226 New York");
	  newCustomerPage.inputToCityTextbox("Texas");
	  newCustomerPage.inputToStateTextbox("American");
	  newCustomerPage.inputToPinTextbox("564663");
	  newCustomerPage.inputToPhoneTextbox("096266661");
	  newCustomerPage.inputToEmailTextbox("email@email.com");
	  newCustomerPage.inputToPasswordTextbox("123456");
	  newCustomerPage.clickToSubmitButton();
	 // Assert.assertEquals(newCustomerPage.getSuccessMessage(), "Customer Registered");   
  }
  @Test(priority = 3)
  public void TC_04_loginPage() {
	  newCustomerPage.clickToLogoutLink();
	  loginPage = new LoginPageObject(driver);
	  Assert.assertTrue(loginPage.isLoginFormDisplayed());
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

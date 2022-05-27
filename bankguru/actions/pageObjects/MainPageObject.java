package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractsPage;
import pageUI.MainPageUI;

public class MainPageObject extends AbstractsPage{
	WebDriver driver;
	
	public MainPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public String getWelcomeMessageText() {
		waitToElementVisible(driver, MainPageUI.WELCOME_MESSAGE_TEXT);
		return getElementText(driver, MainPageUI.WELCOME_MESSAGE_TEXT);
	}

	public void openNewCustomerPage() {
		waitToElementClickable(driver, MainPageUI.NEWCUSTOMER_LINK);
		clickToElement(driver, MainPageUI.NEWCUSTOMER_LINK);		
	}

}

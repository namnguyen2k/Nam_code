package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractsPage;
import pageUI.RegisterPageUI;

public class RegisterPageObject extends AbstractsPage {
	WebDriver driver;
	
	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputToEmailTextbox(String string) {
		waitToElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		sendKeysToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, string);
	}

	public void clickToSubmitButton() {
		waitToElementClickable(driver, RegisterPageUI.SUBMIT_BUTTON);
		clickToElement(driver, RegisterPageUI.SUBMIT_BUTTON);
	}

	public String getUsername() {
		waitToElementVisible(driver, RegisterPageUI.USERNAME);
		return getElementText(driver, RegisterPageUI.USERNAME);
	}

	public String getPassword() {
		waitToElementVisible(driver, RegisterPageUI.PASSWORD);
		return getElementText(driver, RegisterPageUI.PASSWORD);
	}

	public void openLoginPageURL(String loginPageURL) {
		openURL(driver, loginPageURL);
		
	}

}

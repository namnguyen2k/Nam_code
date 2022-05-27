package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractsPage;
import pageUI.LoginPageUI;

public class LoginPageObject extends AbstractsPage{
	WebDriver driver;
	

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}
	public String getLoginPageURL() {
		return getCurrentPageURL(driver);
	}
	public void clickToHereLink() {
		waitToElementClickable(driver, LoginPageUI.HERE_LINK);
		clickToElement(driver, LoginPageUI.HERE_LINK);
	}

	public void inputToUsernameTextbox(String username) {
		waitToElementVisible(driver, LoginPageUI.USER_TEXTBOX);
		sendKeysToElement(driver, LoginPageUI.USER_TEXTBOX, username);
	}

	public void inputToPasswordTextbox(String password) {
		waitToElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendKeysToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);	
	}

	public void clickLoginButton() {
		waitToElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
	}

	public boolean isLoginFormDisplayed() {
		waitToElementVisible(driver, LoginPageUI.LOGIN_FORM);
		return isControlDisplayed(driver, LoginPageUI.LOGIN_FORM);
	}

}

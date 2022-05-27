package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractsPage;
import pageUI.NewCustomerPageUI;

public class NewCustomerPageObject extends AbstractsPage{
	WebDriver driver;
	public NewCustomerPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputToNameTextbox(String value) {
		waitToElementVisible(driver, NewCustomerPageUI.NAME_TEXTBOX);
		sendKeysToElement(driver, NewCustomerPageUI.NAME_TEXTBOX, value);
	}

	public void inputToDOBTextbox(String value) {
		waitToElementVisible(driver, NewCustomerPageUI.DOB_TEXTBOX);
		removeAttributeInDOM(driver, NewCustomerPageUI.DOB_TEXTBOX, "type");
		sendKeysToElement(driver, NewCustomerPageUI.DOB_TEXTBOX, value);
	}

	public void inputToAddressTextarea(String value) {
		waitToElementVisible(driver, NewCustomerPageUI.ADDRESS_TEXTAREA);
		sendKeysToElement(driver, NewCustomerPageUI.ADDRESS_TEXTAREA, value);		
	}

	public void inputToCityTextbox(String value) {
		waitToElementVisible(driver, NewCustomerPageUI.CITY_TEXTBOX);
		sendKeysToElement(driver, NewCustomerPageUI.CITY_TEXTBOX, value);
	}

	public void inputToStateTextbox(String value) {
		waitToElementVisible(driver, NewCustomerPageUI.STATE_TEXTBOX);
		sendKeysToElement(driver, NewCustomerPageUI.STATE_TEXTBOX, value);
	}

	public void inputToPinTextbox(String value) {
		waitToElementVisible(driver, NewCustomerPageUI.PIN_TEXTBOX);
		sendKeysToElement(driver, NewCustomerPageUI.PIN_TEXTBOX, value);
	}

	public void inputToPhoneTextbox(String value) {
		waitToElementVisible(driver, NewCustomerPageUI.MOBILE_TEXTBOX);
		sendKeysToElement(driver, NewCustomerPageUI.MOBILE_TEXTBOX, value);
	}

	public void inputToEmailTextbox(String value) {
		waitToElementVisible(driver, NewCustomerPageUI.EMAIL_TEXTBOX);
		sendKeysToElement(driver, NewCustomerPageUI.EMAIL_TEXTBOX, value);
	}

	public void inputToPasswordTextbox(String value) {
		waitToElementVisible(driver, NewCustomerPageUI.PASSWORD_TEXTBOX);
		sendKeysToElement(driver, NewCustomerPageUI.PASSWORD_TEXTBOX, value);
	}

	public void clickToSubmitButton() {
		waitToElementClickable(driver, NewCustomerPageUI.SUBMIT_BUTTON);
		clickToElement(driver, NewCustomerPageUI.SUBMIT_BUTTON);
		waitToAlertPresence(driver);
		acceptAlert(driver);
	}

	public void clickToLogoutLink() {
		waitToElementClickable(driver, NewCustomerPageUI.LOGOUT_LINK);
		clickToElement(driver, NewCustomerPageUI.LOGOUT_LINK);
		waitToAlertPresence(driver);
		acceptAlert(driver);
	}

}

package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountLoginPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[2]//h2")
    WebElement returningCustomerText;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[1]//h2")
    WebElement newCustomerText;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailAddressField;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginBtn;

    @CacheLookup
    @FindBy(css = "#button-guest")
    WebElement continueButton1;

    @CacheLookup
    @FindBy(xpath = "(//h1)[2]")
    WebElement accountLogOutText;

    @CacheLookup
    @FindBy(css = "#button-payment-method")
    WebElement continueButton2;

    @CacheLookup
    @FindBy(xpath = "(//h2)[1]")
    WebElement myAccountText;


    public void clickOnContinueButton1() {
        clickOnElement(continueButton1);
    }
    public String getAccountLogOutText() {
        return getTextFromElement(accountLogOutText);
    }

    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
    }
    public String getReturningCustomerText() {
        return getTextFromElement(returningCustomerText);

    }

    public String getMyAccountText() {
        return getTextFromElement(myAccountText);
    }

    public String getNewCustomerText() {
        return getTextFromElement(newCustomerText);
    }

    public void enterEmailAddress(String email) {
        sendTextToElement(emailAddressField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton()
    {
        clickOnElement(loginBtn);
    }
}

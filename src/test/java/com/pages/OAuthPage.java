package com.pages;
import com.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OAuthPage {
    {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='BHzsHc'][contains(text(), 'Use another account')]")
    public WebElement useAnotherAccount;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement inputEmail;

    @FindBy(xpath = "//span[@class=\"VfPpkd-vQzf8d\"][contains(text(), 'Next')]")
    public WebElement oAuthNext;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//span[@jsname='V67aGc'][contains(text(), 'Continue')]")
    public WebElement oAuthContinue;

    @FindBy(xpath = "//body[contains(text(), 'Received verification code. You may now close this window.')]")
    public WebElement receivedVerification;

}

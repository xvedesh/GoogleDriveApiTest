package com.pages;

import com.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyGoogleAccount {

    public MyGoogleAccount() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//a[@aria-label=\"Go to your Google Account\"])[2]")
    public WebElement goToMyAccount;

    @FindBy(xpath = "//span[@jsname=\"V67aGc\"][contains(text(), 'Not now')]")
    public WebElement notNow;
}

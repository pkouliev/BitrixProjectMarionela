package com.bitrix.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn extends BasePage {
    @FindBy(xpath = "(//input[@class='login-inp'])[1]")
    public WebElement loginUsername;

    @FindBy(xpath = "(//input[@class='login-inp'])[2]")
    public WebElement loginPassword;


}

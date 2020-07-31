package com.Bytrix.Pages;

import io.cucumber.java.en_lol.WEN;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Message extends BasePage {
    @FindBy(id="feed-add-post-form-tab-message")
    public WebElement  messageForm;
@FindBy(xpath="//span[@class='feed-add-post-form-but feed-add-file']")
    public WebElement uploadItem;
@FindBy(xpath = "(//input[@class='diskuf-fileUploader wd-test-file-light-inp diskuf-filemacos'])[1]")
public WebElement uploadFileAndImages;
@FindBy(xpath ="(//span[contains(text(),'Download from external drive')])[1]")
public WebElement downloadExternalFile;
@FindBy(xpath = "(//span[@class='bx-file-dialog-tab-item-link-text'])[3]")
    public WebElement googleDrive;
    @FindBy(xpath = "//button[@class='ui-btn ui-btn-lg ui-btn-primary' and @id='blog-submit-button-save']")
    public WebElement sendButton;
@FindBy(id="//body[@contenteditable='true' and  @style ='min-height: 134px;']")
public WebElement writeMessage;
    @FindBy(id="//div[@id='feed-add-buttons-blockblogPostForm']/button[1]")
    public  WebElement pictureCheck;
}

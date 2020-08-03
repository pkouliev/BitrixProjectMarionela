package com.Bytrix.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.cert.X509Certificate;

public class Poll extends BasePage {
    @FindBy(xpath = "(//span[@class='feed-add-post-form-link'])[3]")
    public WebElement pollTab;
    @FindBy(xpath = "(//span[@class='feed-add-post-form-but feed-add-file'])[1]")
    public WebElement uploadFiles;
   // @FindBy(xpath = "(//span[@class='wd-fa-add-file-light-title'])[1]")
    @FindBy(xpath = "(//input[@class='diskuf-fileUploader wd-test-file-light-inp diskuf-filemacos'])[1]")
    public  WebElement uploadPicture;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;
    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement message;
    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-lg ui-btn-primary'])[1]")
    public WebElement sendButton;
    @FindBy(xpath = "//div[@class='feed-post-text-block-inner-inner' and text()='Upload picture!']")
    public WebElement verificationPictureUploaded;
    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']")
    public WebElement videoButton;
    @FindBy(xpath = "//input[@id='video_idPostFormLHE_blogPostForm-source']")
    public WebElement videoSource;
    @FindBy(className = "adm-btn-save")
    public WebElement videoSaveButton;
    @FindBy(xpath ="(//div[@class='ytp-cued-thumbnail-overlay-image'])[2]" )
    public  WebElement vidibilityVideo;

    @FindBy(xpath = "//input[@id='question_0']")
    public WebElement questionForPool;
    @FindBy(name = "UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][ANSWERS][0][MESSAGE]")
    public WebElement answer1;
    @FindBy(name = "UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][ANSWERS][1][MESSAGE]")
    public WebElement answer2;

    @FindBy(name ="UF_BLOG_POST_VOTE_n0_DATA[QUESTIONS][0][ANSWERS][2][MESSAGE]")
public WebElement answer3;
    @FindBy(xpath = "(//div[@class='feed-post-cont-wrap sonet-log-item-createdby-503 sonet-log-item-where-U-503-all sonet-log-item-where-U-503-blog-post-vote sonet-log-item-where-U-503-blog'])[1]")
 public WebElement verificationPoll;

    @FindBy(xpath = "//span[@title='Quote text']")
 public WebElement commaButton;
    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
 public WebElement quoteWriteTab;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement verificationQuote;

    //link
    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    public WebElement linkButton;
    @FindBy(xpath = "//input[@type='text' and @placeholder='Link text']")
    public WebElement textLinkForm;
    @FindBy(xpath = "//input[@type='text' and @placeholder='Link URL']")
    public WebElement linkForm;
    @FindBy(className = "adm-btn-save")
    public WebElement saveLinkButton;

    @FindBy(xpath = "//div[@class='feed-post-cont-wrap sonet-log-item-createdby-503 sonet-log-item-where-U-503-all sonet-log-item-where-U-503-blog-post sonet-log-item-where-U-503-blog']")
    public WebElement verificationLink;
    @FindBy(xpath = "//span[@id='lhe_button_editor_blogPostForm']")
    public WebElement visualEditorButton;
    @FindBy(id="bx-html-editor-tlbr-idPostFormLHE_blogPostForm")
    public WebElement verificationVisualEditor;

    @FindBy(xpath = "//span[@title='Topic']")
    public WebElement topicButton;
    @FindBy(xpath = "//div[@class='feed-add-post-title']")
    public WebElement verificationTopicButton;


    @FindBy(xpath = "(//span[@class='feed-add-post-form-but-cnt feed-add-videomessage'])[1]")
    public WebElement recordVideo;
    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-blue']")
    public WebElement allowCameraConfirmation;
    @FindBy(xpath = "//div[@id='popup-window-content-bx-popup-videomessage-popup']")
    public WebElement errorVideoConfirmation;
    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-blue']")
    public WebElement closeErrorVideoConfirmation;



}

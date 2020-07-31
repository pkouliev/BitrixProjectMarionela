package com.Bytrix.Step_Definitions;

import com.Bytrix.Pages.Poll;
import com.Bytrix.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.lwawt.macosx.CThreading;

import java.awt.dnd.DragGestureEvent;

public class MyStepdefs {


    Poll poll=new Poll();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 10);
    @And("user click on Poll Tab")
    public void userClickOnPollTab() throws Exception{
Thread.sleep(3000);
        poll.pollTab.click();
    }
    //message and picture upload
    @And("write some message")
    public void writeSomeMessage()  throws Exception{
        Thread.sleep(3000);
        Driver.getDriver().switchTo().frame(poll.iframe);

        poll.message.sendKeys("Upload picture!");
        Thread.sleep(3000);
        Driver.getDriver().switchTo().defaultContent();
    }
    @And("click on upload files and picture from Poll Module")
    public void clickOnUploadFilesAndPictureFromPollModule()  throws Exception{
        Thread.sleep(3000);
poll.uploadFiles.click();

    }

    @And("upload a picture for Poll")
    public void uploadAPictureForPoll() throws Exception{

        poll.uploadPicture.sendKeys("/Users/marionelatirsina/Desktop/Screen Shot 2020-07-17 at 3.29.41 PM.png");
Thread.sleep(3000);
        poll.sendButton.click();
        Thread.sleep(3000);

    }

    @Then("verify if the Picture is uploaded")
    public void verifyIfThePictureIsUploaded() {
        Assert.assertTrue(poll.verificationPictureUploaded.isDisplayed());


    }



    @And("click on AddMention from Poll Tab and select contact from E-mail Users")
    public void clickOnAddMentionFromPollTabAndSelectContactFromEMailUsers() {
    }

    @And("select contact from E-mail User,")
    public void selectContactFromEMailUser() {
    }

    @And("slect from Employees and Departments")
    public void slectFromEmployeesAndDepartments() {
    }

    @And("Recent Contact List")
    public void recentContactList() {
    }

    @Then("verify if users are selected")
    public void verifyIfUsersAreSelected() {
    }
//VideoButton
@And("write some message for the video description in Poll Tab")
public void writeSomeMessageForTheVideoDescriptionInPollTab() throws Exception {
    Thread.sleep(3000);
    Driver.getDriver().switchTo().frame(poll.iframe);

    poll.message.sendKeys("Upload video!");
    Thread.sleep(3000);
    Driver.getDriver().switchTo().defaultContent();

}

    @And("click on VideoBUttonfrom Poll")
    public void clickOnVideoBUttonfromPoll() throws Exception{
        Thread.sleep(3000);
        poll.videoButton.click();

    }

    @And("upload the video and save it")
    public void uploadTheVideoAndSaveIt()throws Exception {
        Thread.sleep(3000);
        poll.videoSource.sendKeys("https://www.youtube.com/watch?v=dPGWD7KZp_M");
  //wait.until(ExpectedConditions.visibilityOf(poll.vidibilityVideo));
  Thread.sleep(4000);
        poll.videoSaveButton.click(
        );
        Thread.sleep(3000);
        poll.sendButton.click();
        Thread.sleep(3000);
    }

    @Then("Verify if it's uploaded")
    public void verifyIfItSUploaded() throws Exception {



        }

//poll-questions dropdown
    @And("click on message and write about that poll")
    public void clickOnMessageAndWriteAboutThatPoll()  throws Exception{
        Thread.sleep(3000);
        Driver.getDriver().switchTo().frame(poll.iframe);

        poll.message.sendKeys("Please  vote, for all!");
        Thread.sleep(3000);
        Driver.getDriver().switchTo().defaultContent();

    }

    @And("click on Question Tab")
    public void clickOnQuestionTab()throws Exception {
        Thread.sleep(3000);
        poll.questionForPool.sendKeys("How was the last project?");
    }

    @And("click and write first   answer, second answer, third answer")
    public void clickAndWriteFirstAnswerSecondAnswerThirdAnswer() throws Exception {
        poll.answer1.sendKeys("Good");
        Thread.sleep(3000);
        poll.answer2.sendKeys("Excellent");
        Thread.sleep(3000);
        poll.answer3.sendKeys("Could be better");
        Thread.sleep(3000);
    }





    @And("click on Send Button")
    public void clickOnSendButton()throws Exception {
        poll.sendButton.click();
        Thread.sleep(3000);
    }

    @Then("verify if the poll dropdown was created")
    public void verifyIfThePollDropdownWasCreated() throws Exception{
        Thread.sleep(3000);
     Assert.assertTrue(  poll.verificationPoll.isDisplayed());

    }
    //create quote


    @And("click on Comma Button from the POLL Tab")
    public void clickOnCommaButtonFromThePOLLTab()throws Exception {

       // Driver.getDriver().switchTo().parentFrame();

        Thread.sleep(5000);
        poll.commaButton.click();
    }

    @And("click on Quote Tab and write a quote {string}")
    public void clickOnQuoteTabAndWriteAQuote(String text) throws Exception{
        Thread.sleep(3000);
         Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        Thread.sleep(3000);
        poll.quoteWriteTab.sendKeys(text);
        Thread.sleep(3000);
        Driver.getDriver().switchTo().defaultContent();

    }

    @Then("Verify if the Quote is displayed on the page")
    public void verifyIfTheQuoteIsDisplayedOnThePage() {
        Assert.assertTrue(poll.verificationQuote.isDisplayed());
    }
}

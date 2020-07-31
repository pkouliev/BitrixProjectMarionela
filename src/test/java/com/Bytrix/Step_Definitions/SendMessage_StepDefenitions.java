package com.Bytrix.Step_Definitions;

import com.Bytrix.Pages.LogIn;
import com.Bytrix.Pages.Message;
import com.Bytrix.Utilities.ConfigurationReader;
import com.Bytrix.Utilities.Driver;
import io.cucumber.java.cs.Ale;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendMessage_StepDefenitions {
   /* LogIn logIn=new LogIn();
    Message message=new Message();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(), 15);


    @Given("User is logged in")
    public void user_is_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        logIn.loginUsername.sendKeys(ConfigurationReader.getProperty("username"));
        logIn.loginPassword.sendKeys(ConfigurationReader.getProperty("password"),Keys.ENTER);

    }




    @When("user click on Message Module")
    public void user_click_on_message_module() throws Exception{
        wait.until(ExpectedConditions.visibilityOf(message.messageForm)).click();
Thread.sleep(4000);
//message.writeMessage.click();

//Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
//message.writeMessage.sendKeys("ihi");

Driver.getDriver().switchTo().defaultContent();
    }
    @Then("click on upload files icon")
    public void click_on_upload_files_icon() {
       wait.until(ExpectedConditions.visibilityOf(message.uploadItem)).click();
    }
    @Then("upload files and picture  from local disks")
    public void upload_files_and_picture_from_local_disks() throws Exception{
        message.uploadFileAndImages.sendKeys("/Users/marionelatirsina/Desktop/Screen Shot 2020-07-22 at 9.24.52 PM.png");
Thread.sleep(5000);
message.sendButton.click();


    }
    @Then("Verify If its Uploaded")
    public void verify_if_its_uploaded() {

            Assert.assertTrue("Verification Passed",message.pictureCheck.isDisplayed() );




    }
    @Then("download from external drive")
    public void download_from_external_drive() {

        message.downloadExternalFile.click();

    }
    @Then("verify if its dowload from external file")
    public void verify_if_its_dowload_from_external_file() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("select documents from bitrix")
    public void select_documents_from_bitrix() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify if the documents are  selected")
    public void verify_if_the_documents_are_selected() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify if it's upload")
    public void verify_if_it_s_upload() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    */
}

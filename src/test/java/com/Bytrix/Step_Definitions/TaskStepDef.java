package com.Bytrix.Step_Definitions;

import com.Bytrix.Pages.LogIn;
import com.Bytrix.Pages.Task;
import com.Bytrix.Utilities.ConfigurationReader;
import com.Bytrix.Utilities.Driver;
import com.sun.tools.javac.tree.DCTree;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.security.auth.login.Configuration;
import java.util.concurrent.TimeUnit;

public class TaskStepDef {
    Task task= new Task();
    LogIn logIn=new LogIn();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
    @Given("User is logged in")
    public void user_is_logged_in() throws Exception{
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        logIn.loginUsername.sendKeys(ConfigurationReader.getProperty("username"));
        logIn.loginPassword.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
        Thread.sleep(2000);
    }






    @Given("click on Task Module")
    public void clickOnTaskModule() throws Exception{
     task.tasKButton.click();
     Thread.sleep(2000);
    }


//highPriority
    @Given("click on High Priority checkbox")
    public void click_on_high_priority_checkbox() {
        task.highPriorityCheckBox.click();
    }
    @Then("set the current task  to a top Priority task")
    public void set_the_current_task_to_a_top_priority_task() {
      Assert.assertTrue("Ver",task.highPriorityCheckBox.isSelected());
    }





//VisualEditor
    @And("click on Visual Editor")
    public void click_on_visual_editor() {
       // wait.until(ExpectedConditions.visibilityOf(task.visualEditorButton)).click();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        task.visualEditorButton.click();

    }
    @Then("verify if it's showed up")
    public void verifyIfItSShowedUp() throws Exception {
        Thread.sleep(4000);
        task.editorVerification.isDisplayed();
    }




//upload picture



    @Then("click on upload files icon")
    public void click_on_upload_files_icon() throws Exception{
        Thread.sleep(4000);
        task.uploadButton.click();


    }


    @And ("Upload files and picture")
    public void upload_files_and_picture() throws Exception {

Thread.sleep(4000);

        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", task.uploadPicturesFiles.sendKeys("/Users/marionelatirsina/Desktop/Screen Shot 2020-07-22 at 9.24.52 PM.png");
        Thread.sleep(2000);
    //task.uploadPicturesFiles.sendKeys("/Users/marionelatirsina/Desktop/Screen Shot 2020-07-22 at 9.24.52 PM.png");

    }
    @And ("Select documents from bitrix")
    public void select_documents_from_bitrix() {

    }
    @Then("create file to upload")
    public void create_file_to_upload() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





//comma icon

    @Given("Click on Comma Icon")
    public void click_on_comma_icon() throws Exception{
        Thread.sleep(4000);
        task.commaButton.click();
        //Thread.sleep(3000);
      //  task.createQuote.sendKeys("Quote!");




    }
    @Then("Create a quote")
    public void create_a_quote() throws Exception {
        WebElement frame=Driver.getDriver().findElement(By.xpath("(//iframe[@class='bx-editor-iframe'])[2]"));
        Driver.getDriver().switchTo().frame(frame);
        Thread.sleep(3000);
         task.createQuote.sendKeys("Quote!");
         Thread.sleep(3000);

    }
    @Then("verify if it's displayed")
    public void verifyIfItSDisplayed() throws Exception {
     String actualTextQuote=   task.verificationTextQuote.getText();
     String expected="Quote!";
     Thread.sleep(3000);
     Assert.assertEquals(actualTextQuote, expected);


    }





    @Given("Click on the Add mention icon")
    public void click_on_the_add_mention_icon() throws  Exception {
        Thread.sleep(4000);
        task.addMentionButton.click();
        Thread.sleep(3000);
    }
    @Given("select contacts from the lists  provided in dropdown")
    public void select_contacts_from_the_lists_provided_in_dropdown() throws Exception{
        task.addPersonEmail1.click();
        Thread.sleep(3000);
        task.addMentionButton.click();
        Thread.sleep(3000);
        task.addPersonEmail2.click();
        Thread.sleep(3000);

    }

    @Then("Verify if the addMention emails are added.")
    public void verifyIfTheAddMentionEmailsAreAdded() throws Exception {
    WebElement frame=    Driver.getDriver().findElement(By.xpath("(//iframe[@class='bx-editor-iframe'])[2]"));
     Driver.getDriver().switchTo().frame(frame);
     Thread.sleep(3000);
     Assert.assertTrue(task.verifyEmailAddMention.isDisplayed());
    }



//link
    @Given("click on the link icon")
    public void click_on_the_link_icon()  throws Exception{
        Thread.sleep(3000);
        task.linkButton.click();

    }
    @Given("atach link")
    public void atach_link() throws Exception {
        Thread.sleep(3000);
        task.textLinkForm.sendKeys("Link");
        Thread.sleep(3000);
        task.addLinkForm.sendKeys("https://www.youtube.com/watch?v=xCfOPHc-9sQ&list=RDxCfOPHc-9sQ&start_radio=1");
        Thread.sleep(3000);
        task.saveLinkButton.click();
        Thread.sleep(5000);
    }


    @Then("verify is the link it's uploaded")
    public void verifyIsTheLinkItSUploaded() {
        Driver.getDriver().switchTo().frame(task.frameMessage);
        String actual= task.verifyLink.getText();
        String expected="Link";
        Assert.assertEquals(actual, expected);
    }




    @Given("click on Add More")
    public void click_on_add_more() throws Exception {
        Thread.sleep(3000);
task.addMoreButton.click();

    }
    @Given("select contact from E-mail User, Employees and Departments  and Recent Contact List")
    public void select_contact_from_e_mail_user_employees_and_departments_and_recent_contact_list() throws Exception {
        Thread.sleep(3000);
        task.recentAddMoreButton.click();
        Thread.sleep(3000);
        task.getRecentAddMoreButtonAddEmail.click();
        Thread.sleep(3000);
        task.addMoreEmployeesAndDepartments.click();
        Thread.sleep(3000);
        task.addMoreEmployeesAndDepartmentsAddEmail.click();
        Thread.sleep(3000);
    }

    @Then("verify if Add More selecting contact from  E-mail user, Employees and Departments and Recent contact lists works.")
    public void verifyIfAddMoreSelectingContactFromEMailUserEmployeesAndDepartmentsAndRecentContactListsWorks() {
        Assert.assertTrue(task.addMoreEmployeesAndDepartmentsAddEmail.isDisplayed());

    }


    //verify responsible person




    @And("click on created by")
    public void clickOnCreatedBy() throws Exception {
        Thread.sleep(3000);
        task.createdByButton.click();
    }

    @And("click participants  and people")
    public void clickParticipantsAndPeople() throws Exception {
        Thread.sleep(3000);
        task.participantsButton.click();
        Thread.sleep(3000);
        task.participantsButtonAddButton.click();
        Thread.sleep(3000);
        WebElement addEmail=Driver.getDriver().findElement(By.xpath("(//div[@class='bx-finder-box-item-t7-name'])[1]"));
        addEmail.click();
        Thread.sleep(3000);
        task.popupClose.click();

    }

    @And("click  on  Observers and add people")
    public void clickOnObserversAndAddPeople()throws Exception {
        Thread.sleep(3000);
        task.observersButton.click();
        Thread.sleep(3000);
        task.observersButtonAddButton.click();
        WebElement addEmail=Driver.getDriver().findElement(By.xpath("(//div[@class='bx-finder-box-item-t7-name'])[1]"));
        addEmail.click();
        task.popupClose.click();
        Thread.sleep(3000);


    }





    @Then("verify if Employees can be added in different assignment categories: Created By, Participants and Observer.")
    public void verifyIfEmployeesCanBeAddedInDifferentAssignmentCategoriesCreatedByParticipantsAndObserver() throws Exception {
        Assert.assertTrue(task.verifyCreatedBy.isDisplayed());
        Thread.sleep(2000);
        Assert.assertTrue(task.verifyParticipants.isDisplayed());
        Thread.sleep(3000);
        Assert.assertTrue(task.verifyObservers.isDisplayed());
        Thread.sleep(3000);
    }
//deadline
    @Given("Click on Deadline")
    public void click_on_deadline() throws Exception{
        Thread.sleep(3000);
        task.Deadline.click();
        Thread.sleep(3000);


    }
    @Given("select date and time")
    public void select_date_and_time() throws Exception {
        task.dateNumber.click();
        task.hour.sendKeys("9");
        Thread.sleep(2000);
        task.minutes.sendKeys("30");
        Thread.sleep(3000);
        task.deadlineSelect.click();

    }
    @Then("verify is the Deadline is saved")
    public void verifyIsTheDeadlineIsSaved() {
       String actualResult= task.verifyDeadline.getAttribute("value");
       String text="07/01/2020 07:30:00 pm";
        Assert.assertEquals(actualResult, text);
    }







    @Given("Click on More")
    public void click_on_more() throws Exception{
       Thread.sleep(3000);
       task.moreButton.click();
       Thread.sleep(3000);
    }
    @Given("specify the task details")
    public void specify_the_task_details() {
        //task Planned time

    }
    @Given("Click on Send")
    public void click_on_send() {

    }
    @Then("verify if the assigned Task is created")
    public void verify_if_the_assigned_task_is_created() {

    }



}



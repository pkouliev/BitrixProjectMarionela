@s1
Feature: Create Events
User Story: As a user, I should be able to assign
  tasks by clicking on Task tab under Active Stream.
Background: User is on bitrix page
  Given User is logged in
  And  click on Task Module


  Scenario:1. User should be able to click on ""High Priority"" checkbox to set the current task to a top priority task.

  And click on High Priority checkbox
    Then set the current task  to a top Priority task

  Scenario:2. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
    And click on Visual Editor
    Then verify if it's showed up
@actual
  Scenario:3. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
   Then click on upload files icon
   Then  Upload files and picture
   Then Select documents from bitrix
   Then create file to upload




  Scenario:4. User should be able to create a quote by clicking on the Comma icon.
    And Click on Comma Icon
    Then Create a quote
  Then verify if it's displayed

  Scenario:5. User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.
   And  Click on the Add mention icon
    And select contacts from the lists  provided in dropdown
  Then Verify if the addMention emails are added.

  Scenario:6. User should be able to attach link by clicking on the link icon.
    And click on the link icon
    And atach link
  Then verify is the link it's uploaded

  Scenario:7. User can assign the tasks to employees by clicking on Add More and selecting contact from E-mail user, Employees and Departments and Recent contact lists.

    And click on Add More
    And select contact from E-mail User, Employees and Departments  and Recent Contact List
Then verify if Add More selecting contact from  E-mail user, Employees and Departments and Recent contact lists works.

Scenario:8. Employees can be added in different assignment categories: Created By, Participants and Observer.
  And click on created by
And click participants  and people
And click  on  Observers and add people
  Then verify if Employees can be added in different assignment categories: Created By, Participants and Observer.

  Scenario:9. User can add Deadline, Time Planning by using date pickers.
    And Click on Deadline
    And select date and time
  Then verify is the Deadline is saved
#work
  Scenario:10. User can click on More to specify the task details."
   And  Click on More
    And specify the task details
  And   Click on Send
    Then verify if the assigned Task is created


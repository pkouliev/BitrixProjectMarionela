
Feature: Poll tab
 4.As a user, I should be able to create a
poll by clicking on Poll tab under Active Stream.

  Background: User is on bitrix page
 Given User is logged in
And  user click on Poll Tab

  Scenario: 1.User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.
    And click on upload files and picture from Poll Module
  And write some message
    And upload a picture for Poll

    Then verify if the Picture is uploaded

 Scenario: 2.User should be able to add users from selecting contact from E-mail user, Employees and Departments and Recent contact lists.
  #  And click on AddMention from Poll Tab and select contact from E-mail Users
 # And select contact from E-mail User from Poll Tab
 # And select from Employees and Departments
 # And  Recent Contact List
 #   Then verify if users are selected


 Scenario: 3.User should be able to attach link by clicking on the link icon.
   And click on Link Button from Poll Tab
   And click and write some Text in Text Form
   And upload the link in the link Form, and click on Save Button
   Then Verify if click it's uploaded


  Scenario: 4.User should be able to insert videos by clicking on the video icon and entering the video URL.
    And write some message for the video description in Poll Tab
  And click on VideoBUttonfrom Poll
  And upload the video and save it
  Then Verify if it's uploaded


  Scenario: 5.User should be able to create a quote by clicking on the Comma icon.
And click on Comma Button from the POLL Tab
    And click on Quote Tab and write a quote "Today it's friday so we have Retro Meeting"
    And click on Send Button
    Then Verify if the Quote is displayed on the page
 # Scenario: 6.User should be able to add mention by clicking on the Add mention icon and select contacts from the lists provided in dropdown.

 Scenario: 7.User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
  And click on Visual Editor from the poll
    Then  verify if it's displayed the Visual Editor


  Scenario: 8.User should be able to click on the Topic icon to see the poll Topic text box displays on top of the message box.
    And click on Topic Icon from Poll
    Then Verify if Topic text box id displayed on top of the message box.
  @aaa
  Scenario: 9.User should be able to click on ""Record Video"" tab to record a video and attach it with the message.
And click on Record Video Button from Poll
   Then Verify if its recording the Video and uploading

Scenario: 10.User should be able to Add questions and multiple answers; user can provide multiple choice to attendees by
selecting the Allow multiple choice checkbox."
  And click on message and write about that poll
  And click on Question Tab
  And click and write first   answer, second answer, third answer
 # And click on Send Button for save The Quote
  Then verify if the poll dropdown was created
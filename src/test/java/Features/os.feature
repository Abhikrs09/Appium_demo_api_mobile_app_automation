@test
Feature: Demp Api Mobile app Testing
  Testing the feature Present in the os page


  @test_os
  Scenario Outline: Checking SMS Messaging feature
  	Given  Click on Continue To allow some access
    Then   Click on Ok to open the Homescreen
    Then   Click on OS otpion
    And    Select SMS Messaging button
    Then   Enter the Recipient phone number <number>
    And    Enter the Message Body <msg>
    And    Click on send button
    Then   verify that msg is sent or not
    
    Examples:
    |number|msg |
    |"test"|"m"|
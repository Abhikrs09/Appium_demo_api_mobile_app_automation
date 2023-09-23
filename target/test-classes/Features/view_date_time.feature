
@test
Feature: Demp Api Mobile app Testing
	Testing Features available in view Page
  
  
  Background: Going to home page 
 		Given Click on Continue To allow some access
    Then   Click on Ok to open the Homescreen
    Then Click on Views button
    And select date widgets
    And choose Dialog option

  @test_change_date
  Scenario: verifying the change date feature
 
  	Then click on change the date button
  	And select the desired time
  	And click on ok to submit
  	Then Verify that the date is displayed or not
  
  @test_change_date
  Scenario: verifying the change time feature
  
  	Then click on change the time
  	And select the desired hour
  	And select the desired min
  	Then select or and pm
  	And click on ok button
  	Then verify that the time is displayed or not
  	
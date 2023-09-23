
@test
Feature: Demp Api Mobile app Testing
			Testing the custom title Feature

	@test_title
  Scenario: verifying custom title feature
    Given  Click on Continue To allow some access
    Then   Click on Ok to open the Homescreen
    When   Click on App button to open apps option
    Then   Select Activity button
    And 	 Choose Custom Title
    Then   Click change left button
    And    Click change right button
    Then   verify the left title 
    And    verify the right tilte

 
      

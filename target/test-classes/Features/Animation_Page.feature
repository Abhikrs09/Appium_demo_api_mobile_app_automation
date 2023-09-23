@Test
Feature: Demp Api Mobile app Testing
  Testing the Animation Feature

 Background: Going to home page 
 		Given Click on Continue To allow some access
    Then   Click on Ok to open the Homescreen
		
	@test_show	
	Scenario: Verify showing of button
    Then Click on Animation button 
		And  Select Hide-show button to continue
		Then Click one
		And  Press two
		Then Click on show button
		Then verify that one is visible 
		And  verify that two is visible 
		
	@test_hide
	Scenario: Verify Hiding of button Failed Testcase
    Then Click on Animation button 
		And  Select Hide-show button to continue
		Then Click one
		Then verify that one is not visible 
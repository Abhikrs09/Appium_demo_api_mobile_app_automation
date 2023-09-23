package StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;


import BasePackage.basePage;
import Screens.HomeScreen;
import Screens.app_page;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class app_page_steps_def extends basePage{
	
	public static Logger logger = LogManager.getLogger(app_page_steps_def.class);

	@When("^Click on App button to open apps option$")
	public void click_on_App_button_to_open_apps_option() throws Throwable {
	    
		logger.info("********** App Page Logs **********");
		
		wd.findElement(HomeScreen.btn_app).click();
		logger.info("Click on App button");
			
	}

	@Then("^Select Activity button$")
	public void select_Activity_button() throws Throwable {
		
		wd.findElement(app_page.btn_activity).click();
		logger.info("Select Activity button");
			
	}

	@Then("^Choose Custom Title$")
	public void choose_Custom_Title() throws Throwable {
	    
		wd.findElement(app_page.btn_custom_title).click();
		logger.info("Choose Custom Title");
		
	}


	@Then("^Enter the value in left textfield \"([^\"]*)\"$")
	public void enter_the_value_in_left_textfield(String arg1) throws Throwable {
		
		wd.findElement(app_page.textarea_left).click();
		wd.findElement(app_page.textarea_left).clear();
		wd.findElement(app_page.textarea_left).sendKeys(arg1);
		logger.info("Enter the value in left textfield");
		
	}

	@Then("^Enter the value in right textfield \"([^\"]*)\"$")
	public void enter_the_value_in_right_textfield(String arg1) throws Throwable {
		
		wd.findElement(app_page.textarea_right).click();
		wd.findElement(app_page.textarea_right).clear();
		wd.findElement(app_page.textarea_right).sendKeys(arg1);
		logger.info("Enter the value in right textfield");
		
	}

	@Then("^Click change left button$")
	public void click_change_left_button() throws Throwable {
	    
		wd.findElement(app_page.btn_left).click();
		logger.info("Click change left button");
		
	}

	@Then("^Click change right button$")
	public void click_change_right_button() throws Throwable {
	    
		wd.findElement(app_page.btn_right).click();
		logger.info("Click change right button");
		
	}

	@Then("^verify the left title$")
	public void verify_the_left_title() throws Throwable {
	   
		String actual = wd.findElement(app_page.textarea_left).getText();
		String expected = "Left is best";
		Assert.assertEquals(actual,expected);
		logger.info("verify the left title");
		
	}

	@Then("^verify the right tilte$")
	public void verify_the_right_tilte() throws Throwable {
	   
		String actual = wd.findElement(app_page.textarea_right).getText();
		String expected = "Right is always right";
		Assert.assertEquals(actual,expected);
		logger.info("verify the right title");
		
	}
	
}

package StepDefinitions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;


import BasePackage.basePage;
import Screens.Animation_page;
import Screens.HomeScreen;

import cucumber.api.java.en.Then;


public class Animation_page_steps extends basePage {
	
	public static Logger logger = LogManager.getLogger(Animation_page_steps.class);

	@Then("^Click on Animation button$")
	public void click_on_Animation_button() throws Throwable {
	    
		logger.info("********** Animation Page Logs **********");

	    wd.findElement(HomeScreen.btn_Animation).click();
		logger.info("Click on Animation button");
		
	}

	@Then("^Select Hide-show button to continue$")
	public void select_Hide_show_button_to_continue() throws Throwable {
		
	    wd.findElement(Animation_page.btn_Hide_show).click();
	    logger.info("Select Hide-show button to continue");
	    
	}

	@Then("^Click one$")
	public void click_one() throws Throwable {
	   
		wd.findElement(Animation_page.btn_one).click();
		logger.info("Click one");
		
	}

	@Then("^Press two$")
	public void press_two() throws Throwable {
	    
		wd.findElement(Animation_page.btn_two).click();
		logger.info("Click Two");
		
	}

	@Then("^verify that one is not visible$")
	public void verify_that_one_is_not_visible() throws Throwable {
	    
		Boolean actual = wd.findElement(Animation_page.btn_one).isDisplayed();
		Boolean expected = false;
		Assert.assertEquals(actual,expected);
		logger.info("verify that one is not visible");
		
	}

	@Then("^verify that two is not visible$")
	public void verify_that_two_is_not_visible() throws Throwable {
	    
		Boolean actual  = wd.findElement(Animation_page.btn_two).isDisplayed();
		Boolean expected = true;
		Assert.assertEquals(actual,expected);
		logger.info("verify that two is not visible");
		
	}
	

	@Then("^Click on show button$")
	public void click_on_show_button() throws Throwable {
    
		wd.findElement(Animation_page.btn_show_buttons).click();
		logger.info("Click on show button");
		
	}
	
	@Then("^verify that one is visible$")
	public void verify_that_one_is_visible() throws Throwable {
	    
		Boolean actual  = wd.findElement(Animation_page.btn_two).isDisplayed();
		Boolean expected = true;
		Assert.assertEquals(actual,expected);
		logger.info("verify that one is visible");
		
	}

	@Then("^verify that two is visible$")
	public void verify_that_two_is_visible() throws Throwable {
	    
		Boolean actual  = wd.findElement(Animation_page.btn_two).isDisplayed();
		Boolean expected = true;
		Assert.assertEquals(actual,expected);
		logger.info("verify that two is visible");
		
	}

}

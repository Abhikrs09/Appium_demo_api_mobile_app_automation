package StepDefinitions;


import com.aventstack.extentreports.gherkin.model.Scenario;

import BasePackage.basePage;
import Screens.HomeScreen;

import Utilities.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class logTextBox_def extends basePage  {
	
	public Scenario scenario;

	@Given("^Click on Continue To allow some access$")
	public void click_on_Continue_To_allow_some_access() throws Throwable {
		
		wd = DriverFactory.getDriver();
		wd.findElement(HomeScreen.btn_Continue).click();
		logger.info("Click on Continue To allow some access");
		
	}

	@Then("^Click on Ok to open the Homescreen$")
	public void click_on_Ok_to_open_the_Homescreen() throws Throwable {
		
		wd.findElement(HomeScreen.btn_ok).click();
		logger.info("Click on Ok to open the Homescreen");
	}
	

	@Then("^Click on Text otpion$")
	public void click_on_Text_otpion() throws Throwable {
		
		wd.findElement(HomeScreen.btn_Text).click();
		logger.info("Click on Text otpion");
		
	}

	@Then("^Select LogTextBox$")
	public void select_LogTextBox() throws Throwable {
	    
		wd.findElement(HomeScreen.btn_LogText_box).click();
		logger.info("Select LogTextBox");
		
	}

	@Then("^Press Add$")
	public void press_Add() throws Throwable {
		
		wd.findElement(HomeScreen.btn_Add).click();
		logger.info("Press Add");
		
	}
	

}

package StepDefinitions;

import org.testng.Assert;

import BasePackage.basePage;
import Screens.HomeScreen;
import Screens.view_date_time_page;
import cucumber.api.java.en.Then;

public class view_date_time_steps extends basePage{

	
	@Then("^Click on Views button$")
	public void click_on_Views_button() throws Throwable {
		
		logger.info("********** View date Time Logs **********");
		
		wd.findElement(HomeScreen.btn_views).click();
		logger.info("Click on Views button");
		
	}

	@Then("^select date widgets$")
	public void select_date_widgets() throws Throwable {
		
		wd.findElement(view_date_time_page.btn_date_widget).click();
		logger.info("select date widgets");
		
	}

	@Then("^choose Dialog option$")
	public void choose_Dialog_option() throws Throwable {
		
		wd.findElement(view_date_time_page.btn_dialog).click();
		logger.info("choose Dialog option");
		
	}

	@Then("^click on change the date button$")
	public void click_on_change_the_date_button() throws Throwable {
		
		wd.findElement(view_date_time_page.btn_change_the_date).click();
		logger.info("click on change the date button");
		
	}

	@Then("^select the desired time$")
	public void select_the_desired_time() throws Throwable {
		
		wd.findElement(view_date_time_page.btn_date).click();
		logger.info("select the desired time");
		
	}

	@Then("^click on ok to submit$")
	public void click_on_ok_to_submit() throws Throwable {
		
		wd.findElement(view_date_time_page.btn_date_ok).click();
		logger.info("click on ok to submit");
		
	}

	@Then("^Verify that the date is displayed or not$")
	public void verify_that_the_date_is_displayed_or_not() throws Throwable {
		
		String date_time = wd.findElement(view_date_time_page.taskbar_verify_date_time).getText();
		String[] output= date_time.split(" ");
		String expected_date= output[0];
		String actual_date="2-8-2023";
		Assert.assertEquals(actual_date, expected_date);
		
		logger.info("Verify that the date is displayed or not");
		
		
	}

	@Then("^click on change the time$")
	public void click_on_change_the_time() throws Throwable {
		
		wd.findElement(view_date_time_page.btn_change_the_time).click();
		logger.info("click on change the time");
		
	}

	@Then("^select the desired hour$")
	public void select_the_desired_hour() throws Throwable {
		
		wd.findElement(view_date_time_page.btn_time_hr).click();
		logger.info("select the desired hour");
		
	}

	@Then("^select the desired min$")
	public void select_the_desired_min() throws Throwable {
		
		wd.findElement(view_date_time_page.btn_time_min).click();
		logger.info("select the desired min");
		
	}
	
	@Then("^select or and pm$")
	public void select_or_and_pm() throws Throwable {
		
		wd.findElement(view_date_time_page.btn_time_am).click();
		logger.info("select am or pm");
		
	}
	

	@Then("^click on ok button$")
	public void click_on_ok_button() throws Throwable {
		
		wd.findElement(view_date_time_page.btn_time_ok).click();
		logger.info("click on ok button");
		
	}

	@Then("^verify that the time is displayed or not$")
	public void verify_that_the_time_is_displayed_or_not() throws Throwable {
		
		String date_time = wd.findElement(view_date_time_page.taskbar_verify_date_time).getText();
		String[] output= date_time.split(" ");
		String expected_date= output[1];
		String actual_date="04:05";
		Assert.assertEquals(actual_date, expected_date);
		System.out.println(expected_date);
		logger.info("verify that the time is displayed or not");
	}


}

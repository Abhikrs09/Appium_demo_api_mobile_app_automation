package StepDefinitions;

import org.testng.Assert;

import BasePackage.basePage;
import Screens.HomeScreen;
import Screens.os_page;
import Utilities.ExcelLibrary;
import cucumber.api.java.en.Then;


public class os_page_steps extends basePage {
	
	@Then("^Click on OS otpion$")
	public void click_on_OS_otpion() throws Throwable {
	    
		logger.info("********** Os Page Logs **********");
		
		wd.findElement(HomeScreen.btn_os).click();
		logger.info("Click on OS otpion");
		
	}

	@Then("^Select SMS Messaging button$")
	public void select_SMS_Messaging_button() throws Throwable {
	    
		wd.findElement(os_page.btn_sms_Messaging).click();
		logger.info("Select SMS Messaging button");
		
	}

	@Then("^Enter the Recipient phone number \"([^\"]*)\"$")
	public void enter_the_Recipient_phone_number(String arg1) throws Throwable {
	 
		ExcelLibrary obj = new ExcelLibrary();
		String numb = obj.readIntData("test", 1, 0);
		System.out.println(numb);
		wd.findElement(os_page.textbox_Recipient).clear();
		wd.findElement(os_page.textbox_Recipient).sendKeys(numb);
		logger.info("Enter the Recipient phone number");
		
	}

	@Then("^Enter the Message Body \"([^\"]*)\"$")
	public void enter_the_Message_Body(String arg1) throws Throwable {
		ExcelLibrary obj = new ExcelLibrary();
		String msg = obj.readStringData("test", 1, 1);
		System.out.println(msg);
		wd.findElement(os_page.textbox_Message_body).clear();
		wd.findElement(os_page.textbox_Message_body).sendKeys(msg);
		logger.info("Enter the Message Body");
		
	}

	@Then("^Click on send button$")
	public void click_on_send_button() throws Throwable {
	    
		wd.findElement(os_page.btn_send).click();
		logger.info("Click on send button");
		
	}

	@Then("^verify that msg is sent or not$")
	public void verify_that_msg_is_sent_or_not() throws Throwable {
		
		Boolean actual  = wd.findElement(os_page.msg_sms_status).isDisplayed();
		Boolean expected = true;
		Assert.assertEquals(actual,expected);
		logger.info("verify that msg is sent or not");
		
		
	}

	
}

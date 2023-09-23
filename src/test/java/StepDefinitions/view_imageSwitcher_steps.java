package StepDefinitions;

import BasePackage.basePage;
import Screens.HomeScreen;
import Screens.view_imageSwitcher_page;
import cucumber.api.java.en.Then;

public class view_imageSwitcher_steps extends basePage {

	@Then("^Select view option from HomeScreen$")
	public void select_view_option_from_HomeScreen() throws Throwable {
	    
		logger.info("********** view imageSwitcher Logs **********");
		
		wd.findElement(HomeScreen.btn_views).click();
		logger.info("Select view option from HomeScreen");
		
	}

	@Then("^Scroll down the options$")
	public void scroll_down_the_options() throws Throwable {
	    
		verticleSwipeByPercentage(1.60,0.50,0.50);
		logger.info("Scroll down the options");
		
	}

	@Then("^Click on imageSwitcher$")
	public void click_on_imageSwitcher() throws Throwable {
		
	    wd.findElement(view_imageSwitcher_page.btn_radio_group).click();
	    logger.info("Click on Radio Group");
	    
	}

	
	
}

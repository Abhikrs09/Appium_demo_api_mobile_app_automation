package StepDefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.relevantcodes.extentreports.LogStatus;

import BasePackage.basePage;
import Utilities.DriverFactory;
import Utilities.ExtentManager;
import Utilities.ReadingFileProperties;
import Utilities.ScreenShots;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Hooks extends basePage{

	public DriverFactory driverFactory;
	public AppiumDriver<MobileElement> wd;
    
    @Before
    public void setup(cucumber.api.Scenario scenario) throws Exception
    {
    	
    	
    	logger.info(" ************** in hooks before function ********************* ");
    	
    	service = AppiumDriverLocalService.buildDefaultService();
		service.start();
		
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("platformName", ReadingFileProperties.getProperty("platformName"));
    	capabilities.setCapability("platformVersion", ReadingFileProperties.getProperty("platformVersion"));
    	capabilities.setCapability("appPackage", ReadingFileProperties.getProperty("appPackage"));
    	capabilities.setCapability("deviceName", ReadingFileProperties.getProperty("deviceName"));
    	capabilities.setCapability("appActivity", ReadingFileProperties.getProperty("appActivity"));
    	capabilities.setCapability("deviceName", ReadingFileProperties.getProperty("deviceName"));
    	capabilities.setCapability("app", "Resources\\API Demos_4.0_apkcombo.com.apk");
        
    	
        driverFactory = new DriverFactory();
	    wd = driverFactory.init_driver(capabilities);
	    extent = ExtentManager.getInstance("Reports//Extend_demo.html");
		test = extent.startTest(scenario.getName());
	    wd.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	    
	    
	    System.out.println("*********************************  Server Started  *********************************************************$");
	    logger.info(" ************** Server Started ********************* ");
    }
    
    @After
    public void stopAppium(cucumber.api.Scenario scenario)
    {
    	
    	logger.info(" ************** in hooks after function ********************* ");
    	
    	if (scenario.isFailed()) {
			ScreenShots.takeScreenShot(wd,scenario.getName());
			test.log(LogStatus.ERROR, test.addScreenCapture(System.getProperty("user.dir") + "//Screenshots//" + scenario.getName() +" .jpg"));
		}
    	
    	test.log(LogStatus.PASS, "Test case got passed");
    	wd.removeApp("com.hmh.api");
    	extent.flush();
        wd.quit();
        service.stop();
    	logger.info(" ************** Server Stopped ********************* ");
    }
}

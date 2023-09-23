package BasePackage;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.openqa.selenium.Dimension;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class basePage {

	
	public static AppiumDriverLocalService service;
	public static AppiumDriver<MobileElement> wd;
	public static ExtentReports extent;
	public static ExtentTest test;
	
    public static Logger logger = LogManager.getLogger(basePage.class);
    
    
    @SuppressWarnings("rawtypes")
	public static void verticleSwipeByPercentage(double startpercentage, double endpercentage,
            double anchorpercentage) {
        Dimension size = wd.manage().window().getSize();
        int anchor = (int) (size.width * anchorpercentage);
        int startpoint = (int) (size.width * startpercentage);
        int endpoint = (int) (size.width * endpercentage);



       @SuppressWarnings({ "unused" })
	TouchAction touch = new TouchAction(wd);
        new TouchAction(wd).press(point(anchor, startpoint)).waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endpoint)).release().perform();
    }
}

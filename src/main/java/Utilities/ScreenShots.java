package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ScreenShots {
	
public static void takeScreenShot(AppiumDriver<MobileElement> driver, String Filename) {
		
		String screenShotFileName = System.getProperty("user.dir") + "//Screenshots//" + Filename +".jpg";
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		try {
			
			FileUtils.copyFile(srcFile, new File(screenShotFileName));
			
		} catch(IOException e) {
			
			e.printStackTrace();
		}
	}

}

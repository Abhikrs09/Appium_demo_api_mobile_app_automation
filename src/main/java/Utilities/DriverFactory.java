package Utilities;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class DriverFactory {
	
public static AppiumDriver<MobileElement> wd;
	
	
	public static ThreadLocal<AppiumDriver<MobileElement>> tlDriver = new ThreadLocal<>();

	public AppiumDriver<MobileElement> init_driver(DesiredCapabilities capabilities) throws Exception {
		
		tlDriver.set(wd = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities));
		return getDriver();
	}

	public static synchronized AppiumDriver<MobileElement> getDriver() {
		return tlDriver.get();
	}

}

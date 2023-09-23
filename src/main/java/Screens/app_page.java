package Screens;

import org.openqa.selenium.By;

public class app_page {

	public static By btn_activity        = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]");
	public static By btn_custom_title    = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]");
	public static By textfield_left      = By.id("com.hmh.api:id/left_text_edit");
	public static By textfield_right     = By.id("com.hmh.api:id/right_text_edit");
	
	public static By btn_left            = By.id("com.hmh.api:id/left_text_button");
	public static By btn_right           = By.id("com.hmh.api:id/right_text_button");
	
	public static By textarea_left       = By.id("com.hmh.api:id/left_text");
	public static By textarea_right      = By.id("com.hmh.api:id/right_text");
	
}

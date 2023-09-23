package Screens;

import org.openqa.selenium.By;

public class view_date_time_page {

	
	
	public static By btn_date_widget = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[7]");
	
	public static By btn_dialog    = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]");
	
	public static By btn_change_the_date = By.id("com.hmh.api:id/pickDate");
	public static By btn_change_the_time = By.id("com.hmh.api:id/pickTime");
	
	public static By btn_date = By.xpath("//android.view.View[@content-desc=\"08 February 2023\"]");
	public static By btn_date_ok   = By.id("android:id/button1");
	
	public static By btn_time_hr = By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"4\"]");
	public static By btn_time_min = By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"5\"]");
	public static By btn_time_am = By.id("android:id/am_label");
	public static By btn_time_ok  = By.id("android:id/button1");
	
	public static By taskbar_verify_date_time = By.id("com.hmh.api:id/dateDisplay");
	
	
	
}

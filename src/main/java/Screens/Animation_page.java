package Screens;

import org.openqa.selenium.By;

public class Animation_page {

	public static By btn_Continue     = By.id("com.android.permissioncontroller:id/continue_button");
	public static By btn_ok           = By.id("android:id/button1");
	
	public static By btn_Hide_show = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[6]");
	public static By btn_zero      = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]");
	public static By btn_one       = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]");
	public static By btn_two       = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]");
	public static By btn_three     = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[4]");
	
	public static By btn_show_buttons = By.id("com.hmh.api:id/addNewButton");	
}

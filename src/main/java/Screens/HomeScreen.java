package Screens;


import org.openqa.selenium.By;


public class HomeScreen {
    
    public static By btn_Continue     = By.id("com.android.permissioncontroller:id/continue_button");
	public static By btn_ok           = By.id("android:id/button1");
	
	
	public static By btn_Text         = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[10]"); 
	public static By btn_Animation    = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]");
	public static By btn_os           = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[8]");
	public static By btn_app          = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]");
	public static By btn_views        = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[11]");
	
	public static By btn_LogText_box  = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]");
	public static By btn_Add          = By.id("com.hmh.api:id/add");
        
   
}

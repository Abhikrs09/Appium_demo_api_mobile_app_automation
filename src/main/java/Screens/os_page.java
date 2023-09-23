package Screens;

import org.openqa.selenium.By;

public class os_page {

	
	public static By btn_sms_Messaging  = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]");
	public static By textbox_Recipient  = By.id("com.hmh.api:id/sms_recipient");
	public static By textbox_Message_body = By.id("com.hmh.api:id/sms_content");
	public static By btn_send           = By.id("com.hmh.api:id/sms_send_message");
	public static By msg_sms_status     = By.id("com.hmh.api:id/sms_status");
}

package pages;

import Base.config;

public class Login_page extends config {

	private static String UserName_FLD = "com.ebay.mobile:id/edit_text_username";
	private static String Password_FLD ="com.ebay.mobile:id/edit_text_password";
	private static String SignIn_BTN = "//android.widget.Button[contains(@resource-id,'com.ebay.mobile:id/button_sign_in')]";

public void Sigin_button_presence(){
	try {
	driver.findElementById(SignIn_BTN).isDisplayed();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}

public void login_check() {
	try {
	//Data is fetched from property file
	driver.findElementById(UserName_FLD).sendKeys("username");
	driver.findElementById(Password_FLD).sendKeys("password");
	driver.findElementByXPath(SignIn_BTN).click();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
}
}
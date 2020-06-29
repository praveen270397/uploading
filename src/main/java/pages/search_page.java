package pages;

import Base.config;

public class search_page extends config {
	public static String SearchBox_TBX = "//android.widget.TextView[@text='Search for anything']";
	public static String Search_FLD = "//android.widget.EditText[@text='Search for anything']";

public void Search_box_Available() {
	try {
	driver.findElementById(SearchBox_TBX).isDisplayed();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}

public void Search_text() {
	try {
	//Data is fetched from property file
	driver.findElementById(Search_FLD).sendKeys("Data");
	driver.findElementById(SearchBox_TBX).click();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	}
}

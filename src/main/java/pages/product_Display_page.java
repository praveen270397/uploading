package pages;

import Base.config;

public class product_Display_page extends config {
	String Product_name;
	String Product_price;
	String Product_description;
	public static String ItemName_TXT_VIEW = "//android.widget.TextView[contains(@resource-id,'com.ebay.mobile:id/textview_item_name')]";
	public static String BuyItNow_BTN = "//android.widget.Button[@text='BUY IT NOW']";
	public static String name = "locator identification for name";
	public static String price = "locator identification for price";
	public static String description = "locator identification for description";


public void product_Info() {
	try {
	
	driver.findElementById(ItemName_TXT_VIEW).click();
	Product_name=driver.findElementById(name).getText();
    Product_price=driver.findElementById(price).getText();
	Product_description=driver.findElementById(description).getText();
	driver.findElementById(BuyItNow_BTN).clear();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
	}




}

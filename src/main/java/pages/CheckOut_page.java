package pages;

import org.testng.Assert;

import Base.config;

public class CheckOut_page extends config{
	product_Display_page obj = new product_Display_page();
	public static String Order_price = "//android.widget.TextView[@text='Order price']";
	public static String Order_name = "//android.widget.TextView[@text='Order name']";
	public static String Order_descrpition = "//android.widget.TextView[@text='Order description']";
	
public void Validation() {
	try {
	
	String Actualproduct_name = driver.findElementById(Order_name).getText();
	Assert.assertEquals(obj.Product_name,Actualproduct_name );
	
	String Actualproduct_price = driver.findElementById(Order_price).getText();
	Assert.assertEquals(obj.Product_price,Actualproduct_price );
	
	String Actualproduct_descrpition = driver.findElementById(Order_descrpition).getText();
	Assert.assertEquals(obj.Product_description,Actualproduct_descrpition );
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	}


}
	
	


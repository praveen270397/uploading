package Test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.config;
import pages.CheckOut_page;
import pages.Login_page;
import pages.product_Display_page;
import pages.search_page;

public class App extends config {
	Login_page login = new Login_page();
	search_page search = new search_page();
	product_Display_page product_Display = new product_Display_page();
	CheckOut_page CheckOut = new CheckOut_page();

	@BeforeClass
	public void initialize() throws IOException {
		
	config.setup();
	config.property();
	
	}

   @Test(priority =1)
   public void login_page_Test() {
	 
	   login.Sigin_button_presence();
	   login.login_check();
	   
   }
   
   @Test(priority =2)
   public void Search_page_test() {
	   
	   search.Search_box_Available();
	   search.Search_text();  
	   
   }
   
   @Test(priority =3)
   public void product_display_page_text() {
	
	product_Display.product_Info();
}
   
   @Test(priority =5)
   public void Checkout_page_Test() {
	
	CheckOut.Validation();
}






}

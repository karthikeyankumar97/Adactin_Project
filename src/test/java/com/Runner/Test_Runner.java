package com.Runner;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.BaseClass.Base_Class;
import com.helper.File_Reader_Manager;
import com.pom.Book_A_Hotel;
import com.pom.Booking_Confirmation;
import com.pom.Existing_User_LogIn;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;
import com.sdp.Page_Object_Manager;
public class Test_Runner extends Base_Class {
	public static WebDriver driver = getBrowser("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	public static Logger log = Logger.getLogger(Test_Runner.class);

	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		log.info("BROWSER LAUNCH");
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl();
		geturl(url);
		log.info("URL LAUNCH");
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getusername();
		inputvalueelement(pom.getInstanceExistingLogin().getusername(), username);
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getpassword();
		inputvalueelement(pom.getInstanceExistingLogin().getpassword(), password);
		clickOnElement(pom.getInstanceExistingLogin().getbutton());
		log.info("LOGIN SUCCESSFULLY");
		String location = particular_Data(
				"C:\\Users\\karthikeyan\\eclipse-workspace\\Adactin_Project\\Testcase for Adactin Hotel.xlsx", 6, 5);
		dropdown("value", pom.getInstanceSearchHotel().getLocation(), location);
		String Hotel = particular_Data(
				"C:\\Users\\karthikeyan\\eclipse-workspace\\Adactin_Project\\Testcase for Adactin Hotel.xlsx", 7, 5);
		dropdown("value", pom.getInstanceSearchHotel().getHotel(), Hotel);
		String roomtype = particular_Data(
				"C:\\Users\\karthikeyan\\eclipse-workspace\\Adactin_Project\\Testcase for Adactin Hotel.xlsx", 8, 5);
		dropdown("value", pom.getInstanceSearchHotel().getRoomtype(), roomtype);
		String numberofrooms = particular_Data(
				"C:\\Users\\karthikeyan\\eclipse-workspace\\Adactin_Project\\Testcase for Adactin Hotel.xlsx", 9, 5);
		dropdown("index", pom.getInstanceSearchHotel().getNumberofrooms(), numberofrooms);
		String adultperroom = particular_Data(
				"C:\\Users\\karthikeyan\\eclipse-workspace\\Adactin_Project\\Testcase for Adactin Hotel.xlsx", 12, 5);
		dropdown("value", pom.getInstanceSearchHotel().getAdultperroom(), adultperroom);
		String childperroom = particular_Data(
				"C:\\Users\\karthikeyan\\eclipse-workspace\\Adactin_Project\\Testcase for Adactin Hotel.xlsx", 13, 5);
		dropdown("value", pom.getInstanceSearchHotel().getChildperroom(), childperroom);
		clickOnElement(pom.getInstanceSearchHotel().getSearch());
		clickOnElement(pom.getInstanceSelectHotel().getRadiobutton());
		clickOnElement(pom.getInstanceSelectHotel().getContinue_btn());
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getfirstname();
		inputvalueelement(pom.getInstanceBookAHotel().getFirst_name(), firstname);
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getlastname();
		inputvalueelement(pom.getInstanceBookAHotel().getLast_name(), lastname);
		String Address = particular_Data(
				"C:\\Users\\karthikeyan\\eclipse-workspace\\Adactin_Project\\Testcase for Adactin Hotel.xlsx", 23, 5);
		inputvalueelement(pom.getInstanceBookAHotel().getAddress(), Address);
		String creditnum = particular_Data(
				"C:\\Users\\karthikeyan\\eclipse-workspace\\Adactin_Project\\Testcase for Adactin Hotel.xlsx", 24, 5);
		inputvalueelement(pom.getInstanceBookAHotel().getCreditnum(), creditnum);
		String credittype = particular_Data(
				"C:\\Users\\karthikeyan\\eclipse-workspace\\Adactin_Project\\Testcase for Adactin Hotel.xlsx", 25, 5);
		dropdown("value", pom.getInstanceBookAHotel().getCredit_type(), credittype);
		String cc_exp_month = particular_Data(
				"C:\\Users\\karthikeyan\\eclipse-workspace\\Adactin_Project\\Testcase for Adactin Hotel.xlsx", 26, 5);
		dropdown("value", pom.getInstanceBookAHotel().getCc_exp_month(), cc_exp_month);
		String cc_exp_year = particular_Data(
				"C:\\Users\\karthikeyan\\eclipse-workspace\\Adactin_Project\\Testcase for Adactin Hotel.xlsx", 27, 5);
		dropdown("value", pom.getInstanceBookAHotel().getCc_exp_year(), cc_exp_year);
		String cc_cvv_num = particular_Data(
				"C:\\Users\\karthikeyan\\eclipse-workspace\\Adactin_Project\\Testcase for Adactin Hotel.xlsx", 28, 5);
		inputvalueelement(pom.getInstanceBookAHotel().getCc_cvv_num(), cc_cvv_num);
		clickOnElement(pom.getInstanceBookAHotel().getBook_now());
		log.info("HOTEL BOOKED SUCCESSFULLY");
		clickOnElement(pom.getInstanceBookingConfirm().getLogout());
		log.info("LOGOUT SUCCESSFULLY");
		screenshot();
	    close();
	    quit();
	    log.info("BROWSER QUIT");
	 
	 
	    
	    
		
	}
	

}




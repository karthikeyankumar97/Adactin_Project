package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Book_A_Hotel;
import com.pom.Booking_Confirmation;
import com.pom.Existing_User_LogIn;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

public class Page_Object_Manager {
	public WebDriver driver;
	private Existing_User_LogIn  ul;
	private Search_Hotel sh;
	private Select_Hotel H;
	private Book_A_Hotel bk;
	private Booking_Confirmation bc;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}
	public Existing_User_LogIn getInstanceExistingLogin() {
		if (ul==null) {
			ul = new Existing_User_LogIn(driver);	
		}
		return ul;	
	}
	public Search_Hotel getInstanceSearchHotel() {
		if (sh==null) {
			 sh = new Search_Hotel(driver);
		}
		return sh;
	}
	public Select_Hotel getInstanceSelectHotel() {
		if (H==null) {
		    H = new Select_Hotel(driver);	
		}
		return H;

	}
	public Book_A_Hotel getInstanceBookAHotel() {
		if (bk==null) {
			 bk = new Book_A_Hotel(driver);
		}
		return bk;
	}
	public Booking_Confirmation getInstanceBookingConfirm() {
		if (bc==null) {
			 bc = new Booking_Confirmation(driver);	
		}
		return bc;

	}
}


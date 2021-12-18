package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public WebDriver driver;
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;

	

	public Search_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}
@FindBy(xpath="//select[@id='hotels']")
private WebElement hotel;

public WebElement getHotel() {
	return hotel;
}
@FindBy(xpath="//select[@id='room_type']")
private WebElement roomtype;

public WebElement getRoomtype() {
	return roomtype;
}
@FindBy(xpath="//select[@id='room_nos']")
private WebElement numberofrooms;

public WebElement getNumberofrooms() {
	return numberofrooms;
}
@FindBy(xpath="//select[@id='adult_room']")
private WebElement adultperroom;

public WebElement getAdultperroom() {
	return adultperroom;
}
@FindBy(xpath="//select[@id='child_room']")
private WebElement childperroom;

public WebElement getChildperroom() {
	return childperroom;
}
@FindBy(xpath="//input[@id='Submit']")
private WebElement search;

public WebElement getSearch() {
	return search;
}
}

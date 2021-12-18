package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {
	public WebDriver driver;
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement first_name;

	public Book_A_Hotel(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}

	public WebElement getFirst_name() {
		return first_name;
	}
@FindBy(xpath="//input[@id='last_name']")
private WebElement last_name;

public WebElement getLast_name() {
	return last_name;
}
@FindBy(xpath="//textarea[@id='address']")
private WebElement address;

public WebElement getAddress() {
	return address;
}
@FindBy(xpath="//input[@id='cc_num']")
private WebElement creditnum;

public WebElement getCreditnum() {
	return creditnum;
}
@FindBy(xpath="//select[@id='cc_type']")
private WebElement credit_type;

public WebElement getCredit_type() {
	return credit_type;
}
@FindBy(xpath="//select[@id='cc_exp_month']")
private WebElement cc_exp_month;

public WebElement getCc_exp_month() {
	return cc_exp_month;
}
@FindBy(xpath="//select[@id='cc_exp_year']")
private WebElement cc_exp_year;

public WebElement getCc_exp_year() {
	return cc_exp_year;
}
@FindBy(xpath="//input[@id='cc_cvv']")
private WebElement cc_cvv_num;

public WebElement getCc_cvv_num() {
	return cc_cvv_num;
}
@FindBy(xpath="//input[@id='book_now']")
private WebElement book_now;

public WebElement getBook_now() {
	return book_now;
}
}

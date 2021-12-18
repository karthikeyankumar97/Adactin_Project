package com.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Existing_User_LogIn {
	public WebDriver driver;
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;

	public Existing_User_LogIn(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getusername() {
		return username;
	}
@FindBy(xpath="//input[@name='password']")
private WebElement password;

public WebElement getpassword() {
	return password;
}
@FindBy(xpath="//input[@name='login']")
private WebElement button;

public WebElement getbutton() {
	return button;
}
}


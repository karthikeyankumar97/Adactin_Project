package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public WebDriver driver;
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement radiobutton;

	public Select_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}
@FindBy(xpath="//input[@id='continue']")
private WebElement continue_btn;

public WebElement getContinue_btn() {
	return continue_btn;
}
}

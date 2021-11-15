package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation {
	
	public static WebDriver wd;

	@FindBy(id="my_itinerary")
	private WebElement iti;
	
	public Confirmation(WebDriver wd2) {
		this.wd = wd2;
		PageFactory.initElements(wd, this);
	}

	public WebElement getIti() {
		return iti;
	}
}
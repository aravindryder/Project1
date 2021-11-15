package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itinerary {
	
	public static WebDriver wd;
	
	@FindBy(id="logout")
	private WebElement out;

	public Itinerary(WebDriver wd2) {
		this.wd = wd2;
		PageFactory.initElements(wd, this);
	}

	public WebElement getOut() {
		return out;
	}
}
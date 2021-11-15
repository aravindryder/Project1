package com.Sdp;

import org.openqa.selenium.WebDriver;

import com.Pom.Book_Hotel;
import com.Pom.Confirmation;
import com.Pom.Itinerary;
import com.Pom.Login;
import com.Pom.Search_Hotel;
import com.Pom.Select_Hotel;

public class SDP {

	public WebDriver wd;
	
	private Login l;
	private Search_Hotel sh;
	private Select_Hotel sel;
	private Book_Hotel bh;
	private Confirmation c;
	private Itinerary i;
	
	public SDP(WebDriver wd2) {
		this.wd = wd2;
	}
	
	public Login getL() {
		
		l = new Login(wd);
		return l;
	}
	
	public Search_Hotel getSh() {
		
		sh = new Search_Hotel(wd);
		return sh;
	}
	
	public Select_Hotel getSel() {
		
		sel = new Select_Hotel(wd);
		return sel;
	}
	
	public Book_Hotel getBh() {
		
		bh = new Book_Hotel(wd); 
		return bh;
	}
	
	public Confirmation getC() {
		
		c = new Confirmation(wd);
		return c;
	}
	
	public Itinerary getI() {
		
		i = new Itinerary(wd);
		return i;
	}
}
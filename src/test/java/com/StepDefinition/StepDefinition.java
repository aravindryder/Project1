package com.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.BaseClass.Base_Class;
import com.Help.FileReader;
import com.Runner.TestRunner;
import com.Sdp.SDP;

import cucumber.api.java.en.*;

public class StepDefinition extends Base_Class{
	
	public static WebDriver wd = TestRunner.wd;
	public static SDP s = new SDP(wd);

	@Given("^User Launch the Adactin Application$")
	public void user_Launch_the_Adactin_Application() throws Throwable {
		Get_URL("https://adactinhotelapp.com/");
	}

	@When("^User Enter the \"([^\"]*)\" in the Username field$")
	public void user_Enter_the_in_the_Username_field(String username) throws Throwable {
		Pass(s.getL().getName(), username);
	}

	@When("^User Enter the \"([^\"]*)\" in the Password field$")
	public void user_Enter_the_in_the_Password_field(String password) throws Throwable {
		Pass(s.getL().getPass(), password);
	}

	@Then("^User Click on the Login Button and it Navigates to the Search Hotel page$")
	public void user_Click_on_the_Login_Button_and_it_Navigates_to_the_Search_Hotel_page() throws Throwable {
		click(s.getL().getLogin());
	}
	
	@When("^User choose the Locations of Hotel$")
	public void user_choose_the_Locations_of_Hotel() throws Throwable {
		Drop_Down(s.getSh().getSite(), "byvisibletext", "London");
	}

	@When("^User choose the Hotels$")
	public void user_choose_the_Hotels() throws Throwable {
		Drop_Down(s.getSh().getHotel(), "byvisibletext", "Hotel Sunshine");
	}

	@When("^User Choose the Room Types$")
	public void user_Choose_the_Room_Types() throws Throwable {
		Drop_Down(s.getSh().getRoom(), "byvisibletext", "Deluxe");
	}

	@When("^User Select the Number of Rooms$")
	public void user_Select_the_Number_of_Rooms() throws Throwable {
		Drop_Down(s.getSh().getNos(), "byvalue", "2");
	}

	@When("^User Select the Check in date$")
	public void user_Select_the_Check_in_date() throws Throwable {
		Pass(s.getSh().getIn(), "29/10/2021");
	}

	@When("^User Select the Check out date$")
	public void user_Select_the_Check_out_date() throws Throwable {
		Pass(s.getSh().getOut(), "31/10/2021");
	}

	@When("^User Choose the Adults per Room$")
	public void user_Choose_the_Adults_per_Room() throws Throwable {
		Drop_Down(s.getSh().getAdult(), "byvalue", "2");
	}

	@When("^User Choose the Kids per Room$")
	public void user_Choose_the_Kids_per_Room() throws Throwable {
		Drop_Down(s.getSh().getChild(), "byvalue", "2");
	}

	@Then("^User Click on the Search Button and It Navigates to Select Hotel Page$")
	public void user_Click_on_the_Search_Button_and_It_Navigates_to_Select_Hotel_Page() throws Throwable {
		click(s.getSh().getSearch());	
	}
	
	@When("^User Click the Ration Button in Select Hotel$")
	public void user_Click_the_Ration_Button_in_Select_Hotel() throws Throwable {
		click(s.getSel().getSelect());
	}

	@Then("^User Click on the Continue Button and It Navigates to Book Hotel Page$")
	public void user_Click_on_the_Continue_Button_and_It_Navigates_to_Book_Hotel_Page() throws Throwable {
		click(s.getSel().getCon());
	}
	
	@When("^User Enter the \"([^\"]*)\" in the Firstname field$")
	public void user_Enter_the_in_the_Firstname_field(String first) throws Throwable {
		Pass(s.getBh().getFirst(), first);
	}

	@When("^User Enter the \"([^\"]*)\" in the Lastname field$")
	public void user_Enter_the_in_the_Lastname_field(String last) throws Throwable {
		Pass(s.getBh().getLast(), last);
	}

	@When("^User Enter the \"([^\"]*)\" in the Billing Address field$")
	public void user_Enter_the_in_the_Billing_Address_field(String address) throws Throwable {
		Pass(s.getBh().getAddress(), address);
	}

	@When("^User Enter the \"([^\"]*)\" Number$")
	public void user_Enter_the_Number(String ccno) throws Throwable {
		Pass(s.getBh().getCc(), ccno);
	}

	@When("^User Choose the Credit Card Type$")
	public void user_Choose_the_Credit_Card_Type() throws Throwable {
		Drop_Down(s.getBh().getType(), "byvalue", "AMEX");
	}

	@When("^User Choose the Credit Card Expiry Month and Year$")
	public void user_Choose_the_Credit_Card_Expiry_Month_and_Year() throws Throwable {
		Drop_Down(s.getBh().getMonth(), "byvalue", "8");
		Drop_Down(s.getBh().getYear(), "byvalue", "2022");
	}

	@When("^User Enter the CVV Number$")
	public void user_Enter_the_CVV_Number() throws Throwable {
		String cvv = FileReader.getfr().getcr().cvv();
		Pass(s.getBh().getCvv(), cvv);
	}
	
	@Then("^User Click on the Book Now Button and It Navigates to Booking Confirmation Page$")
	public void user_Click_on_the_Book_Now_Button_and_It_Navigates_to_Booking_Confirmation_Page() throws Throwable {
		click(s.getBh().getBook());
	}

	@Then("^User Click on the My Itinerary Button and It Navigates to Booked Itinerary Page$")
	public void user_Click_on_the_My_Itinerary_Button_and_It_Navigates_to_Booked_Itinerary_Page() throws Throwable {
		click(s.getC().getIti());
	}

	@Then("^User Click on Logout Button and It Navigates to Logout Page$")
	public void user_Click_on_Logout_Button_and_It_Navigates_to_Logout_Page() throws Throwable {
		click(s.getI().getOut());
	}
}
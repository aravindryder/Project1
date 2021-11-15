Feature: Hotel Booking in Adactin Application

@smokeTest
Scenario Outline: User Login
Given User Launch the Adactin Application
When User Enter the "<username>" in the Username field
And User Enter the "<password>" in the Password field
Then User Click on the Login Button and it Navigates to the Search Hotel page

Examples:
|username|password|
|abcdefgh|abcdefgh@123|
|aravind28|Password0007|

@smokeTest
Scenario Outline: Search Hotel
When User choose the Locations of Hotel
And User choose the Hotels
And User Choose the Room Type
And User Select the Number of Rooms
And User Enter the "<cid>" Check in date
And User Enter the "<cod>" Check out date
And User Choose the Adults per Room
And User Choose the Kids per Room
Then User Click on the Search Button and It Navigates to Select Hotel Page

Examples:
|09/11/2021|13/11/2021|
|10/11/2021|11/11/2021|
|11/11/2021|12/11/2021|
|12/11/2021|13/11/2021|
|13/11/2021|14/11/2021|
|14/11/2021|15/11/2021|

@sanityTest
Scenario: Select Hotel
When User Click the Ration Button in Select Hotel
Then User Click on the Continue Button and It Navigates to Book Hotel Page

@smokeTest
Scenario Outline: Book Hotel
When User Enter the "<firstname>" in the Firstname field 
And User Enter the "<lastname>" in the Lastname field
And User Enter the "<address>" in the Billing Address field
And User Enter the "<creditcard>" Number
And User Choose the Credit Card Type
And User Choose the Credit Card Expiry Month and Year
And User Enter the Number
Then User Click on the Book Now Button and It Navigates to Booking Confirmation Page

Examples:
|firstname|lastname|address|creditcard|cvv|
|Aravind|Chandran|No:T123, 1st Main Road, \nLondon - TIC 5f7|1698 8942 6659 7549|

@sanityTest
Scenario: Booking Confirmation
Then User Click on the My Itinerary Button and It Navigates to Booked Itinerary Page

@sanityTest
Scenario: Booked Itinerary
Then User Click on Logout Button and It Navigates to Logout Page
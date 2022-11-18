
# Author
# Date 
# Description


Feature: Feature to test login functionality
 
 @smoketest
  Scenario: Check login is succesful with valid credentials
    Given Open Chrome Browser
 		And I open to my application
		And I fill ceket searchbox on Main Page
 		Then I see ceket products page
 		
	  Given I click first product item
	  Then switch to new window
	  When I click add basket button
	  And I click go to basket page
	  
	  
	  And I click lighting text ok button
	  And I click buy item
	  Then I see login page from basket page
	  
	  When I fill testinium.demo.automation@gmail.com username and Abc123def! password
	  Then I click login button
	  Then I see basket page
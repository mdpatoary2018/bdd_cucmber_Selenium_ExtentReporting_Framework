#Author: Mdshohid H Patoary
@Apprate
Feature: Wipro Find App rating
Description: I am able to find my wipro hight and lowest app rating
	
Background:  
	Given Open firefox and start application
	
	Scenario: 
    When I Click my account
    And Enter Valid User Id
    And Enter Valid Password
    And I click Login Btn
    Then I should be able to see Homepage
    
    
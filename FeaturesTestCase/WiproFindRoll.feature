#Author: Md Shohid H patoary
@Findroll
Feature: Wipro Find Manager Name
Description: I am able to find my manager Name uing Find roll App
	
Background:  
	Given Open firefox and start application
	
	Scenario: 
    When I Click my account
    And Enter Valid User Id
    And Enter Valid Password
    And I click Login Btn
    Then I should be able to see Homepage
    
#Author: Md Shohid H patoary
@loginTest
Feature: Wipro Log In Smoke Test Scenerio
Description: I am able to login mywipro.com with valid credintiales and able to display Mywipro Home
	
Background:  
	Given Open firefox and start application
	
	
	Scenario: Homepage Validation
    When I Click my account
    And Enter Valid User Id
    And Enter Valid Password
    And I click Login Btn
    Then I should be able to see Homepage
  
   
    


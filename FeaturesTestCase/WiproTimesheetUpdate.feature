#Author: mdshohid.patoary@wipro.com
@Timesheettest
Feature: Wipro Time Sheet Update 
Description: I am able to login mywipro.com with valid credintiales and go to  my time Sheet app I can able update my time
	
Background:  
	Given Open firefox and start application
	
	
	Scenario: My Wipro Time Update
    When I Click my account
    And Enter Valid User Id
    And Enter Valid Password
    And I click Login Btn
    And I click My Time App and Click Efforts
    And I put my time hours on lerning and developments 
    Then my Time sheet able to update successfully 
    


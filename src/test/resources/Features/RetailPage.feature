@retailPage
Feature: Retail Website Features 
#Every feature file starts with faeture name of feature files
#Every Scenario starts with Scenario: <name of test case we want to automate>
#Gherkin keywords are given, when and then
#Given is preconditioned
#When is an action taken
#And is repeating and action or can be u


Scenario: Search functionality of Test case 
	 
	When  User search for 'iphone' 
	And   User click on search button 
	Then  User should see Iphone image 
	
	
Scenario Outline: Test Search Functinality with multiple set of Data

	
	When  User search for '<itemName>'
	And   User click on search button
	
	
	Examples:
	|itemName|
	|iphone|
	|mac book|
	|Canon|
	
@RegisterTestAccount
Scenario: Register an Account test case
	When User click on MyAccount
	And User click on Register option
	And User fill the Registration form with Below information
	|firstName|lastName|email|telephone|password|confirmPassword|subscribe|
	|Mohammad|Mustafa|Mus@gmail.com|1012342345|test123$|test123$|no|
	And User accept the privacy and policy 
	And User click on Continue button 
	Then User should be registered in Retail Website
	
	
	 

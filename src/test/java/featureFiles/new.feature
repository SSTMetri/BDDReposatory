#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Login to Application new

	@Smoke
	Scenario: Login ti Vtiger application with valid credentials
	Given i want to launch the browser
	And enter the url
	When login page is displayed enter valid credentials
	And click on login button
	Then validate if home page is displayed or not

  @Regression
  Scenario: Org creation
  Given Launch browser and login
  And validate home page
  When click on org and orhIcon
  And give deatils and save
  Then I validate the outcomes
  And close browser


  
  

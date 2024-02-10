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

Feature: Create organization

  Scenario Outline: Create org
    Given I want to launch browser
    And Login to application with valid credentials <username> and <password>
    When Home page is displayed
    When Click on organization button and org lookup icon
    When give <orgName> and <phone> and click on save button
    Then validate org is created or not with <orgNameV>

    Examples: 
      | username  | password 	| 	 orgName  	|  phone  | orgNameV  |
      | admin 		|     admin | CaptinaMArvel | 123456  |CaptinaMArvel|

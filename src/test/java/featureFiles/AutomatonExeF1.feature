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

Feature: Exercise one

  Scenario: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
    Given Launch browser
    And Navigate to url 'http://automationexercise.com'
    When Verify that home page is visible successfully
    And Scroll down page to bottom
    And Verify 'SUBSCRIPTION' is visible
    Then Click on arrow at bottom right side to move upward
    And Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
    
  

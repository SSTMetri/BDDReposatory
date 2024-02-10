#Author Metri
Feature: Login to Application

Scenario: Login ti Vtiger application with valid credentials
Given i want to launch the browser
And enter the url
When login page is displayed enter valid credentials
And click on login button
Then validate if home page is displayed or not
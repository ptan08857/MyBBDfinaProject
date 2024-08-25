#Author: Peter
#Feature: List of scenarios related to login module
Feature: Login feature of DemoBlaze Application

  Scenario: Test valid login functionality
    Given User will open the broswer
    When User navigated to DemoBlaz Applicaiton URL
    And User click on Login link
    And User enters user name "ptan' and password as '1234'
    And click on Login button
    Then the home page is displayed

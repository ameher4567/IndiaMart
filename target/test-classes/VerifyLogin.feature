@RegressionTest
Feature: Verify Login Functionality of IndiaMart
  @LoginTest
  Scenario: Verify Login Functionality
    Given I am present on IndiaMart Homepage
    And I wait for 3 seconds
    When I enter mobile no in the first page
        And I wait for 1 seconds
    
    And i click on Sign in button
        And I wait for 1 seconds
    
    And I move to profile 
        And I wait for 1 seconds
    
    And I click on view Profile
        And I wait for 1 seconds
    
    And i click on Login Password
        And I wait for 1 seconds
    
    And I enter password 
        And I wait for 1 seconds
    
    And I click on Login with password
        And I wait for 1 seconds
    
    Then i will logged into my profile successfully
    
    

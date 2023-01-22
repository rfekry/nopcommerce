@smoke

Feature: User should be able to login successfully

  Scenario: User could log in with valid email and password
    Given user navigates to login page
    When user enter valid email and password
    And user clicks on login button
    Then user could login successfully


  Scenario: User could not log in with invalid email and password
    Given user navigates to login page
    When user enter invalid email and password
    And user clicks on login button
    Then user could not login successfully

@Regression
Feature: User should be able to register successfully using required fields

  Scenario: User could register with valid data
    Given user navigates to register page
    When user enter Fisrtname, lastname, email and password
    And user clicks on register button
    Then user could register successfully
    And go to registeration result page
